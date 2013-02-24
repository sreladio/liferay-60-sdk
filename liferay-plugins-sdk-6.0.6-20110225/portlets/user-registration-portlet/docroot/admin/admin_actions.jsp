<%@include file="/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(
WebKeys.SEARCH_CONTAINER_RESULT_ROW);
USMember myMember = (USMember) row.getObject();
long groupId = themeDisplay.getLayout().getGroupId();
String name = USMember.class.getName();
String primKey = String.valueOf(myMember.getPrimaryKey());
%>

<liferay-ui:icon-menu>
	<c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey,	ActionKeys.UPDATE) %>">
		<portlet:actionURL name="editMember" var="editURL">
		<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
	</c:if>

	<c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.DELETE) %>">
		<portlet:actionURL name="deleteMember" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
	</c:if>
	
	<c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey,	ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL modelResource="<%= USMember.class.getName() %>"
		modelResourceDescription="<%= myMember.getMemberFirstName() %>"
		resourcePrimKey="<%= primKey %>"
		var="permissionsURL" />
		<liferay-ui:icon image="permissions" url="<%= permissionsURL.toString() %>" />
	</c:if>
</liferay-ui:icon-menu>
	
	
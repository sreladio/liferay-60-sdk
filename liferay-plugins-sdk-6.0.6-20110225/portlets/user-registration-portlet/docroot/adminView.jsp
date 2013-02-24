<%@include file="init.jsp" %>

<liferay-ui:search-container emptyResultsMessage="there-are-no-products" delta="5" >
	<liferay-ui:search-container-results
		<%
			List<USMember> tempResults = ActionUtil.getMembers(renderRequest);
			results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
			total = tempResults.size();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	/>
	
	<liferay-ui:search-container-row className="com.oldschool.user.registration.model.USMember" 
								 keyProperty="memberId"
								 modelVar="user">
 
		<liferay-ui:search-container-column-text name="Nombre" property="memberFirstName" />
		<liferay-ui:search-container-column-text name="Apellidos" property="memberLastName" />
		<liferay-ui:search-container-column-text name="Teléfono" property="memberPhoneNumber" />
		<liferay-ui:search-container-column-text name="email" property="memberEmail" />
		<liferay-ui:search-container-column-text name="Fecha de nacimiento" property="memberBirthDate" />

	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />

</liferay-ui:search-container>


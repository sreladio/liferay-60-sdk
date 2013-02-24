<%@include file="/../init.jsp" %>

<liferay-ui:success key="member-deleted-successfully" message="member-deleted-successfully" />
<liferay-ui:success key="member-updated-successfully" message="member-updated-successfully" />

<liferay-ui:error key="first-name-required" message="first-name-required"  />
<liferay-ui:error key="last-name-required" message="last-name-required" />
<liferay-ui:error key="eMail-required" message="eMail-required" />
<liferay-ui:error key="eMail-must-be-valid" message="eMail-must-be-valid" />
<liferay-ui:error key="phone-number-must-contain-nine-digits" message="phone-number-must-contain-nine-digits" />
<liferay-ui:error key="birthdate-required" message="date-of-birth-required" />
<liferay-ui:error key="error-updating" message="error-updating" />
<liferay-ui:error key="error-deleting" message="error-deleting" />

<liferay-ui:search-container emptyResultsMessage="there-are-no-members" delta="5">
	<liferay-ui:search-container-results>
		<%
			List<USMember> tempResults = ActionUtil.getMembers(renderRequest);
			results = ListUtil.subList(
			tempResults, searchContainer.getStart(), searchContainer.getEnd());
			total = tempResults.size();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row
		className="com.oldschool.user.registration.model.USMember"
		keyProperty="memberId"
		modelVar="member">
		<liferay-ui:search-container-column-text
			name="user-first-name"
			property="memberFirstName" />
		<liferay-ui:search-container-column-text
			name="user-last-name"
			property="memberLastName" />
			
		<liferay-ui:search-container-column-text
			name="user-phone-number"
			property="memberPhoneNumber" />
			
		<liferay-ui:search-container-column-text
			name="user-email"
			property="memberEmail" />
			
		<liferay-ui:search-container-column-text
			name="user-birth-date"
			property="memberBirthDate" />

		<liferay-ui:search-container-column-jsp
			path="/admin/admin_actions.jsp"
			align="right" />

	</liferay-ui:search-container-row>
	
<liferay-ui:search-iterator />

</liferay-ui:search-container>
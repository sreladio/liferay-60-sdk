<%@include file="/../init.jsp" %>

<%
	USMember member = (USMember) request.getAttribute("member");
%>

<portlet:renderURL var="cancelURL">
	<portlet:param name="jspPage" value="/admin/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="updateMember" var="updateMemberURL" />
<h2>Edici�n de datos de usuario registrado</h2>
<aui:form name="fm" action="<%= updateMemberURL.toString() %>" method="post">
	<aui:fieldset>
		<aui:input
			name="resourcePrimKey"
			value="<%= member.getMemberId() %>" type="hidden"
		/>
		
		<aui:input
			name="userFirstName"
			value="<%= member.getMemberFirstName() %>" size="45"
		/>
		
		<aui:input
			name="userLastName"
			value="<%= member.getMemberLastName() %>" size="45"
		/>
		
		<aui:input
			name="userPhoneNumber"
			value="<%= member.getMemberPhoneNumber() %>" size="45"
		/>
		
		<aui:input
			name="userEmail"
			value="<%= member.getMemberEmail() %>" size="45"
		/>
		
		<% 
			Date birthDate = (Date) member.getMemberBirthDate(); 
			Calendar calendar = CalendarFactoryUtil.getCalendar();
			calendar.setTime(birthDate);
		%>
		<aui:fieldset>
            <aui:field-wrapper name="user-birth-date">
            	<liferay-ui:input-date
				
					dayParam="dateDay"
					dayValue="<%= calendar.get(Calendar.DAY_OF_MONTH) %>"
					
					monthParam="dateMonth"
					monthValue="<%= calendar.get(Calendar.MONTH) %>"
					
					yearParam="dateYear"
					yearValue="<%= calendar.get(Calendar.YEAR) %>" 
					
					yearRangeStart="<%= calendar.get(Calendar.YEAR) - 60 %>"
                    yearRangeEnd="<%= calendar.get(Calendar.YEAR) + 60 %>"
				/>
			</aui:field-wrapper>
		</aui:fieldset>
		
		<aui:button-row>
			<aui:button type="submit"/>
			<aui:button type="cancel" value="Cancel" onClick="<%= cancelURL.toString() %>"
		/>
		
		</aui:button-row>
	</aui:fieldset>
</aui:form>


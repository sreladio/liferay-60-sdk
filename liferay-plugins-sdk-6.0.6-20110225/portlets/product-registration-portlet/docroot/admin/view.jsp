<%@include file="init.jsp" %>

<portlet:actionURL name="addProduct" var="addProductURL"/>
	<aui:form name="fm" action="<%= addProductURL.toString() %>" method="post">
		<aui:fieldset>
		<aui:input name="productName" size="45" />
		<aui:input name="productSerial" size="45" />
		<aui:button-row>
		<aui:button type="submit" />
		</aui:button-row>
		</aui:fieldset>
	</aui:form>

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>

<portlet:defineObjects />

<% String catcher = (String)renderRequest.getParameter("catcher"); %> 

<p>Atrapando bola ...</p>

<p>
<% if(catcher != null) {%>
	<%= catcher %>!
<% ;} else { 
%>
... esperando al pitcher.
<%
   ;}
%>
</p>
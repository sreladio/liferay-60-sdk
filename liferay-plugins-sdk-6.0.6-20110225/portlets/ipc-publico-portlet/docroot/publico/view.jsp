<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>

<portlet:defineObjects />

<% String publico = (String)renderRequest.getParameter("publico"); %>

<p>Público grita ...</p>
<p>
<% if(publico != null) {%>
	<%= publico %>!
<% ;} else { 
%>
... esperando al pitcher.
<%
   ;}
%>
</p>
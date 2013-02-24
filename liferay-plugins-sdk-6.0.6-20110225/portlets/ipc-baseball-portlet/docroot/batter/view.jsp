<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>

<portlet:defineObjects />

<% String pitch = (String)renderRequest.getParameter("pitch"); %> 

<p>Batea ...</p>

<p>
<% if(pitch != null) {%>
	<%= pitch %>!
<% ;} else { 
%>
... esperando al pitcher.
<%
   ;}
%>
</p>
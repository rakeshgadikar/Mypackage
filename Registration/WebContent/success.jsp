
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="reg.pkg.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success.jsp</title>
</head>
<body bgcolor="white">
      <%User user=(User)request.getAttribute("ser");%>     
     <p>Succcesfully registered!!  User:  <b><%=user.getUsername()%></b></p>  
     <a href="pickup.jsp"><br><input type="button" value="For Package Click here" name=""/></a> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.example.hibernate.Post"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		
	</head>
	<body>
		
			<div align="center">
				<table border="2">
						<tr>
							<td>ID</td>
							<td>NAME</td>
							<td>BODY</td>
						</tr>
						<%
   							List object = (List) request.getAttribute("data");
   							Iterator itr = object.iterator();
  							 while (itr.hasNext()){
								Post post = (Post) itr.next();
						%>
							<tr>
								<td><%=post.getId()%></td>
								<td><%=post.getTitle()%></td>
								<td><%=post.getBody()%></td>
							</tr>
 
						<%
							}
						%>	
						
						

				</table>
			</div>				
	</body>
</html>

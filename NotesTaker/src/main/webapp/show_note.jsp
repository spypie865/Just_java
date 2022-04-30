<%@page import="com.servletwork.Notes"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.Sessionfac"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="all_design.jsp"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div class="container">

		<%@ include file="navbar.jsp"%>
		<br>
		<h2>ALL NOTES:</h2>
		<div class="row">
			<div class="col-12">
				<%
				Session s1 = Sessionfac.getfactory().openSession();
				Query q1 = s1.createQuery("from Notes");
				List<Notes> li = q1.list();
				for (Notes n1 : li) {
				%>
				<div class="card container m-4" >
					<img src="image/pencil.png" style="width: 100px;"
						class="card-img-top m-3 " alt="go image">
					<div class="card-body">
						<h4 class="card-title"><%=n1.getTitle()%></h4>
						<p class="card-text px-5"><%=n1.getContant()%></p>
						<div class="text-center">	<a href="DeleteNotes?id=<%= n1.getNid() %>" class="btn btn-danger">Delete</a>
							<a href="update.jsp?id=<%=n1.getNid() %>" class="btn btn-primary">Update</a></div>
					
					</div>
				</div>


				<%
				}
				s1.close();
				%>
			</div>
		</div>
	</div>
	 <%@include file="footer.jsp" %>
</body>
</html>
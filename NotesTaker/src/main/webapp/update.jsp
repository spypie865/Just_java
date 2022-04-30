<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.Sessionfac,com.servletwork.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_design.jsp" %>
</head>
<body>
  
<div class="container">
<%@ include file="navbar.jsp" %>
<br><br>
<h3><u>Edit Your List:</u></h3>
<%
int id=Integer.parseInt(request.getParameter("id"));
Session s1=Sessionfac.getfactory().openSession();
Notes n1=(Notes)s1.get(Notes.class,id);


%>
<form action="UpdateNotes" method="post">
  <div class="mb-3">
  <input type="hidden"  name="id" value="<%=n1.getNid()%>"/>
    <label for="exampleInputEmail1" class="form-label">Note Title</label>
    <input value="<%=n1.getTitle() %>" required type="text" name="title" placeholder="write here..." class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
     </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label bold">Note Description</label>
   <textarea required name="desc" class="form-control" style="height:160px"><%=n1.getContant() %></textarea>
   </div>
  
  <center>
  <button type="submit" class="btn purple">Update Note</button>
  </center>
  
</form>
</div>
 <%@include file="footer.jsp" %>
</body>
</html>
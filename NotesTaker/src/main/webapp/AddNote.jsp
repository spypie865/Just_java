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
<h3><u>Fill Your Note Details</u></h3>

<form action="InsertNote" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Note Title</label>
    <input required type="text" name="title" placeholder="write here..." class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
     </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label bold">Note Description</label>
   <textarea required name="desc" class="form-control" style="height:160px"></textarea>
   </div>
  
  <center>
  <button type="submit" class="btn purple">Add Note</button>
  </center>
  
</form>
</div>
 <%@include file="footer.jsp" %>
</body>
</html>
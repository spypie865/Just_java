<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="all_design.jsp" %>
      <title>Hello, world!</title>
  </head>
  <body>
   
<div class="container">
<%@ include file="navbar.jsp" %>
<div class="card my-5 py-5">
<img src="image/pencil.png" style="width:400px" class="mx-auto" />
<h1 class="text-uppercase purple text-center my-3">Start Taking Your Notes</h1>
<a href="AddNote.jsp" class="text-center">
<button class="btn btn-outline-dark" style="width:100px">Take Note</button></a>
</div>
</div>
  <%@include file="footer.jsp" %>
  </body>
</html>
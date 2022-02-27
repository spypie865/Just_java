<html>
<head>
<link rel="stylesheet" href="style/login.css">
<link rel="stylesheet" href="style/index.css">
</head>
<body>


    <div class="header">
        <div class="nav-bar">
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="login.php">Login</a></li>
                <li><a href="registration.php">Registration</a></li>
            </ul>
        </div>
        <div class="slide">
         
             
         <h1>Welcome To Shubh Foods</h1>
          <input type="Submit" value="Order Now" class="bt1"/>
        </div>
        <div class="fix">
   
        </div>
   
           </div>
    <div class="main-login">
        
<label>LOGIN</label>
<hr>
    <div class="form">
<form method="post">
    <div  >
        <label>Username</label><br>
        <input type="text" name="user" placeholder="Enter Your Email" required /><br><br>
    </div>
    
    <div >
    <label>Password</label><br>
        <input type="text" name="pass" placeholder="Enter Your Password" required /><br>
        <div class="warning">
     
        </div>
      
    </div>
    <div>
        <br>
    <input class="btn-update login-btn" type="submit" name="submit" value="Login"/>
    </div>
</form>
    </div>
    </div>
</body>
</html>

<?php
error_reporting(0);
// creating connection to connect with database;
$server="localhost";
$user="root";
$password="";
$db="practice";

$conn=mysqli_connect($server,$user,$password,$db);
if(isset($_POST['submit'])){


$username=$_POST['user'];
$password=$_POST['pass'];

$query="select* from details where email='$username' and password='$password'";
$res=mysqli_query($conn,$query);
$row=mysqli_num_rows($res); //checking if we are getting data or not ;
if($row>0){
    echo '<h2 style="color:green; margin-left:20px">login successfully</h2>';
}
else{
    echo '<h2 style="color:red; margin-left:20px">invalid details</h2>';
}


}

?>
<html>
    <head>
<link href="style/registration.css" rel="stylesheet"/>
<link rel="stylesheet" href="style/index.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
<div class="main-reg">
    <h1>Registration Form</h1>
    <hr>
    <form method="post">
   <div class="inputfield">
<label>Enter Your First Name</label>
<input type="text" name="fname" />

   </div>
   <div class="inputfield">
<label>Enter Your Last Name</label>
<input type="text" name="lname" />

   </div>
   <div class="inputfield">
<label>Enter Your Email ID</label>
<input type="email" name="email" />

   </div>
   <div class="inputfield">
<label>Enter Your Password</label>
<input type="password" name="password"/>

   </div>   

   <div class="inputfield">
<label>Re-enter Your Password</label>
<input type="password" name="cpassword"/>


   </div> 
       
   <div class="inputfield">
<label>Enter Contact Number:</label>
<input type="Number" name="cont" />


</div>

<div class="inputfield">
<label>Select Your Gender:</label>
<select name="gender">
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
</select>

</div>


<div class="inputfield">
<label>Select Your Gender:</label>
<select name="semester">
                    <option>First</option>
                    <option>Second</option>
                    <option>Third</option>
                    <option>Fourth</option>
                    <option>Fifth</option>
                    <option>Sixth</option>
</select>

</div>
      
       
<div class="inputfield">
                <input class="reg" type="submit" name="submit" value="Register"/>
</div>
        
</form>
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
// if($conn){
//     echo "connected successfully";

// }
// else{
//     echo "does'nt connected";
// }
if(isset($_POST['submit'])) // checking if sumit button submitted of not 
{


$fname=$_POST['fname'];
$lname=$_POST['lname'];
$email=$_POST['email'];
$pass=$_POST['cpassword'];
$cont=$_POST['cont'];
$gender=$_POST['gender'];
$sem=$_POST['semester'];

$query="insert into details(fname,lname,email,password,contact,gender,semester)values('$fname','$lname','$email','$pass','$cont','$gender','$sem')";
$res=mysqli_query($conn,$query);
if($res){
    echo "Data Inserted Successfully";

}
else{
    echo "Query error";
}
}
?>
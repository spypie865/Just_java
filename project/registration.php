<html>
    <head>
<link href="style/registration.css" rel="stylesheet"/>
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
<div class="main-reg">
    <h1>Registration Form</h1>
    <hr>
    <form method="post">
    <table class="reg-table" align="center">
        <tr>
            <td class="label">Enter Your First Name:</td>
            <td><input type="text" name="fname" /></td>
        </tr>
        <tr>
            <td class="label">Enter Your Last Name:</td>
            <td><input type="text" name="lname" /></td>
        </tr>
        <tr>
            <td class="label">Enter Your Email Address:</td>
            <td><input type="email" name="email" /></td>
        </tr>
        <tr>
            <td class="label">Enter Your Password:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td class="label">Re-enter Your Password:</td>
            <td><input type="password" name="cpassword"/></td>
        </tr>
        <tr>
            <td class="label">Enter Contact Number:</td>
            <td><input type="Number" name="cont" /></td>
        </tr>
        <tr>
            <td class="label">Select Your Gender:</td>
            <td><input type="radio" name="gender" value="male" /><span>male</span>
                <input type="radio" name="gender" value="female" /><span>Female</span>
                <input type="radio" name="gender" value="other" /><span>Other</span>
            
            
            </td>
        </tr>
        <tr>
            <td class="label">Select Your Semester</td>
            <td>
                <select name="semester">
                    <option>First</option>
                    <option>Second</option>
                    <option>Third</option>
                    <option>Fourth</option>
                    <option>Fifth</option>
                    <option>Sixth</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input class="reg" type="submit" name="submit" value="Register"/>
            </td>
        </tr>
    </table>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
    <link
      rel="stylesheet"
      href="https://unicons.iconscout.com/release/v4.0.0/css/line.css"
    />

    <link rel="stylesheet" href="style.css" />
    <title>Document</title>
  </head>
  <body>
  <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div class="container">
      <div class="forms">
        <!-- Registration Form -->
        <div class="form signup">
          <span class="title">Registration</span>
          <form action="register"  name="myForm" onsubmit="return validateForm();" method="post" >
            <div class="input-field">
              <input type="text" placeholder="Enter username" name="username" />
              <i class="uil uil-user"></i>
            </div>
            <div class="input-field">
              <input type="email" placeholder="Enter your email" name="email" />
              <i class="uil uil-envelope icon"></i>
            </div>
            <div class="input-field">
              <input
              	name="password"
                type="password"
                class="password"
                placeholder="Create password"
              />
              <i class="uil uil-lock-alt icon"></i>
            </div>
            <div class="input-field">
              <input
              	name="confirmPassword"
                type="password"
                class="password"
                placeholder="Confirm password"
              />
              <i class="uil uil-lock-alt icon"></i>
              <i class="uil uil-eye-slash showHidePw"></i>
            </div>

     

            <div class="input-field button">
              <input type="submit" value="SignUp Now" />
            </div>
          </form>

          <div class="login-signup">
            <span class="text"
              >Already a member?

              <a href="login.jsp" class="text login-link">Login now</a>
            </span>
          </div>
        </div>
      </div>
    </div>

    <script src="script.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
		var status=document.getElementById("status").value;
		if(status=="success"){
			swal("Congrats","Account Created Successfully","success");
		}
		
		function validateForm() {
	        let username = document.forms["myForm"]["username"].value;
	        let email = document.forms["myForm"]["email"].value;
	        let password = document.forms["myForm"]["password"].value;
	        let confirmPassword = document.forms["myForm"]["confirmPassword"].value;

	        if (username == "") {
	          alert("Enter username");
	          return false;
	        }
	        else if (email == "") {
		          alert("Enter your email");
		          return false;
		        }
	        else if (password == "") {
	          alert("Enter password");
	          return false;
	        }
	        else if(confirmPassword==""){
	        	alert("Confirm your password");
	        	return false;
	        }
	        else if(password != confirmPassword){
	        	alert("Enter same password for confirming");
	        	return false;
	        }else{
	        	return true;
	        }
     	}
	</script>
  </body>
</html>



<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

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
        <div class="form login">
          <span class="title">Login</span>
          <form action="Login" name="myForm" onsubmit="return validateForm();" method="post">
            <div class="input-field">
              <input type="text" placeholder="Enter username" name="username"/>
              <i class="uil uil-user"></i>
            </div>
            <div class="input-field">
              <input
                type="password"
                class="password"
                placeholder="Enter your password"
                name="password"
                
              />
              <i class="uil uil-lock-alt icon"></i>
              <i class="uil uil-eye-slash showHidePw"></i>
            </div>



            <div class="input-field button">
              <input type="submit" value="Login Now" />
            </div>
          </form>

          <div class="login-signup">
            <span class="text"
              >Not a member?

              <a href="signup.jsp" class="text signup-link">Signup now</a>
            </span>
          </div>
        </div>
      </div>
    </div>

    <script src="script.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
	
	
		var status=document.getElementById("status").value;
		if(status=="failed"){
			swal("Sorry","Invalid Credentials","error");
		}
	
		function validateForm() {
	        let username = document.forms["myForm"]["username"].value;
	        let password = document.forms["myForm"]["password"].value;

	        if (username == "") {
	          alert("Enter username");
	          return false;
	        } else if (password == "") {
	          alert("Enter password");
	          return false;
	        }
     	}

	</script>
  </body>
</html>

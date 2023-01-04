<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("login.jsp");
	}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="style.css" />
  </head>

  <body>
    <div class="main-block">
      <div class="sub-block">
        <h3>Welcome <%= session.getAttribute("name") %></h3>
        <form action="Logout">
          <div>
            <input type="submit" value="Logout" class="form-submit-button" />
          </div>
        </form>
      </div>
    </div>
  </body>
</html>

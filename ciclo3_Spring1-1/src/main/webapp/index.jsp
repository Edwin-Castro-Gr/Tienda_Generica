<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    
    <style>
        .bd-placeholder-img {
          font-size: 1.125rem;
          text-anchor: middle;
          -webkit-user-select: none;
          -moz-user-select: none;
          user-select: none;
        }
  
        @media (min-width: 768px) {
          .bd-placeholder-img-lg {
            font-size: 3.5rem;
          }
        }
      </style>
  
      
      <!-- Custom styles for this template -->
      <link href="css/signin.css" rel="stylesheet">

</head>

	<body class="text-center">
	  
	 <main class="form-signin">
        <form>
          <h1 class="h3 mb-4 fw-normal">Bienvenidos a la Tienda Genérica</h1>
          <img class="mb-4" src="img/user.png" alt="" width="137" height="67">
      
          <div class="form-floating">
            <input type="text" class="form-control" id="Usuario" placeholder="Usuario">
            <label for="floatingInput">Usuario</label>
          </div>
          <div class="form-floating">
            <input type="password" class="form-control" id="Password" placeholder="Password">
            <label for="floatingPassword">Contraseña</label>
          </div>

          <a href="index.html" class="btn btn-primary" type="submit">Aceptar</a>
          <a href="#" class="btn btn-secondary" type="submit">Cancelar</a>
        </form>
      </main>
	
	
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
	</body>
</html>
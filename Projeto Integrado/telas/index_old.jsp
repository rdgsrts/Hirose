<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br"><head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Olimpíadas</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">

  <style>
  body {
      font: 20px Montserrat, sans-serif;
      line-height: 1.8;
      color: #000000;
  }
  p {font-size: 16px;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
      background-color: #ffffff; /* Green */
      color: #000000;
  }
  .bg-2 { 
      background-color: #474e5d; /* Dark Blue */
      color: #ffffff;
  }
  .bg-3 { 
      background-color: #ffffff; /* White */
      color: #555555;
  }
  .bg-4 { 
      background-color: #2f2f2f; /* Black Gray */
      color: #fff;
  }
  .container-fluid {
      padding-top: 70px;
      padding-bottom: 70px;
  }
  .navbar {
      padding-top: 15px;
      padding-bottom: 15px;
      border: 0;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 12px;
      letter-spacing: 5px;
  }
  .navbar-nav  li a:hover {
      color: #1abc9c !important;
  }
  </style>
</head>

<body>

<div class="container-fluid bg-1 text-center">
  
  <h3 class="margin">Futebol</h3>
  
  <img class="img-responsive img-circle margin" style="display:inline" alt="Olimpíadas" src="olympic_rings1.jpg" height="350" width="350">
  
  <div class="btn-group btn-group-justified">
    
    <form action="ServletControl" method="get">
        <!-- Botões-->

        <button type="submit" class="btn btn-success" name="command" value="Cadastrar">Cadastrar</button>
        
        <button type="submit" class="btn btn-primary" name="command" value="Tabela">Consultar</button>

        <button type="submit" class="btn btn-warning" name="command" value="Atualizar">Atualizar</button>
        
        <button type="submit" class="btn btn-danger" name="command" value="Excluir">Excluir</button>
        
  
  </div>

</div>
<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
  <p>I'm MACACO</p> 
</footer>




</body>
</html>
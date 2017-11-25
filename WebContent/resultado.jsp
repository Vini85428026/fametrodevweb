<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title> Resultado </title>
	  <link rel="icon" type="image/png" href="favicon.png" />
      <link href="estilo/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <link href="estilo/style.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top">
         <div class="container-fluid">
            <div class="navbar-header">
               </button>
               <a class="navbar-brand" href="./dashboard.jsp"><img src="./img/bioidade.jpeg" width="50" height="28" /></a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               <ul class="nav navbar-nav">
                  <li class=""><a href="index.jsp">Inicio <span class="glyphicon glyphicon-home"></span> </a></li>
               </ul>
               <ul class="nav navbar-nav navbar-right">
			       <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${nome}</a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
               </ul>
            </div>
         </div>
      </nav>
      <br> <br> <br> <br>

      <form class="form-horizontal" method="POST" action="/Questionario">

      <div class="form-group">
      <label class="col-md-7 control-label"> Resultado do usuário: </label>
        
      </div>
      <div class="form-group">

         <label class="col-md-4 control-label">Nome</label>  
         <div class="col-md-4">
            <input id="inputResultNome" name="inputResultNome" type="text"  class="form-control input-md" value="Humberto Valente" >
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Idade</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeCrono" name="inputResultIdadeCrono" type="text" class="form-control input-md" value="22" >
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Peso</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeBio" name="inputResultIdadeBio" type="text"class="form-control input-md" value="98"> 
         </div>
      </div>
      <br> <br> <br> <br> <br>
	 
      <footer>
         <p> Alunos ADS FAMETRO 2017</p>
      </footer>

</body>
</html>
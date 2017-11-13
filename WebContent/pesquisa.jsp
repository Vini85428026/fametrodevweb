<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
 
    <title> Pesquisa </title>

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
                  <li><a href="./cadastroadm.jsp">Cadastro de usuário <span class="glyphicon glyphicon-list"></span> </a></li>
                  <li class="active"><a href="./pesquisa.jsp">Pesquisar <span class="glyphicon glyphicon-search"></span> </a></li>
               </ul>
      
      <ul class="nav navbar-nav navbar-right">   
				  <li><a href="#"><span class="glyphicon glyphicon-user"></span> usuário </a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
        
      </ul>
    </div>
  </div>
</nav>

<br>
<br>
<br>

<div class="col-md-6 col-md-offset-3">
    
    <br><br><br>

<div class="input-group">
      <input type="text" class="form-control" placeholder="Insira sua pesquisa">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button" name="ButtonPesquisa">Procurar</button>
      </span>
</div>

</nav>
      <br> <br> <br> 
      <form class="form-horizontal" action="" method="post">
      <div class="form-group">
         <label class="col-md-7 control-label"> Resultado do usuário: </label>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Nome</label>  
         <div class="col-md-4">
            <input id="inputResultNome" name="inputResultNome" type="text"  class="form-control input-md" required>
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Idade</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeCrono" name="inputResultIdadeCrono" type="text" class="form-control input-md" required>
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Peso</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeBio" name="inputResultIdadeBio" type="text"class="form-control input-md" required> 
         </div>
      </div>
      <br>
	  
	   <nav aria-label="Page navigation" align="center">
               <ul class="pagination">
                  <li>
                     <a href="./resultado.jsp" aria-label="Next">
                     <span aria-hidden="true">Imprimir</span>
                     </a>
                  </li>
               </ul>
       </nav>
<footer>
        <p> Alunos ADS FAMETRO 2017</p>
</footer>

</body>
</html>
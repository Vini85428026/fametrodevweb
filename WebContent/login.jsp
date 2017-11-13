<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

       
    <title> Login </title>

    
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
				  <li><a href="index.jsp">Início <span class="glyphicon glyphicon-home"></span> </a></li>
                                
               </ul>
      
      <ul class="nav navbar-nav navbar-right">       
                
      </ul>
    </div>
  </div>
</nav>

<br>
<br>
<br>
 <div id="login-overlay" class="modal-dialog">
      <div class="modal-content">
         
          <div class="modal-body">
              <div class="row">
                  <div class="col-xs-6">
                      <div class="well">
                          <form id="loginForm" method="POST" action="/Login">
                              <div class="form-group">
                                  <label class="control-label">CPF / Login</label>
                                  <input type="text" class="form-control" id="usuario" name="usuario" value="" required placeholder="123.456.789-00 OU username">
                                 
                              </div>
                              <div class="form-group">
                                  <label for="password" class="control-label">Senha</label>
                                  <input type="password" class="form-control" id="password" name="password" value="" required ">
                                  
                              </div>
                                                           
                              <button type="submit" class="btn btn-success btn-block">Login</button>
                             
                          </form>
                      </div>
                  </div>
                  <div class="col-xs-6">
                  <br>
                  <br>
                  <br>
                      <p class="lead">Não tem cadastro?</p>
                      <ul class="list-unstyled" style="line-height: 2">
                          
                      </ul>
                      <p><a href="./cadastro.jsp" class="btn btn-info btn-block">Cadastre-se agora</a></p>
                  </div>
              </div>
          </div>
      </div>
  </div>


<br>
<br>
<footer>
        <p> Alunos ADS FAMETRO 2017</p>
</footer>

</body>
</html>
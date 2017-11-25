<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title> Cadastro de usuário </title>
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
				  <li class="active"><a href="./cadastroadm.jsp">Cadastro de usuario <span class="glyphicon glyphicon-list"></span> </a></li>
                  <li><a href="./pesquisa.jsp">Pesquisar <span class="glyphicon glyphicon-search"></span> </a></li>
                  
               </ul>
               <ul class="nav navbar-nav navbar-right">
                  <li><a href="#"><span class="glyphicon glyphicon-user"></span> usuário </a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
               </ul>
            </div>
            <!-- /.navbar-collapse -->
         </div>
         <!-- /.container-fluid -->
      </nav>
      <br>
      <br>
      <br>
      <div class="col-md-4 col-md-offset-4">
      <form class="form-horizontal" method="POST" action="/fametrodevweb/CadastroAdmin">

         <div class="form-group">
            <label class="col-md-4 control-label">Login</label>  
            <div class="col-md-8">
               <input id="inputCadEmail" name="inputCadEmail" type="email" placeholder="Informe um usuário" class="form-control input-md" required> 
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">Senha</label>  
            <div class="col-md-8">
               <input id="inputCadSenha" name="inputCadSenha" type="password" placeholder="Informe uma senha" class="form-control input-md" required>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label" for="button1id"></label>
            <div class="col-md-8">
               <button type="submit" id="buttonCadCadastrar" name="buttonCadCadastrar" class="btn btn-success">Cadastrar</button>
               <button type="reset" id="buttonCadCancelar" name="buttonCadCancelar" class="btn btn-danger">Cancelar</button>
            </div>
         </div>
      </form>
      
      <br>
      <br>
      <footer>
         <p> Alunos ADS FAMETRO 2017</p>
      </footer>

<c:if test="${mensagem != null}">
	<script>
		alert('<c:out value="${mensagem}" />');
	</script>
</c:if>


</body>
</html>
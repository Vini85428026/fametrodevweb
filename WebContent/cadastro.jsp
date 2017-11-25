<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" href="favicon.png" />
    <link href="estilo/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="estilo/style.css" rel="stylesheet">
<title>Cadastro</title>
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
                  <li><a href="index.jsp">Inicio <span class="glyphicon glyphicon-home"></span> </a></li>
				  <li class="active"><a href="./cadastro.jsp">Cadastre-se <span class="glyphicon glyphicon-plus-sign"></span> </a></li>
               </ul>
               <ul class="nav navbar-nav navbar-right">
                  
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
      <form class="form-horizontal" method="POST" action="/fametrodevweb/CadastroPaciente">
         <div class="form-group">
            <label class="col-md-4 control-label">Nome</label>  
            <div class="col-md-8">
               <input id="inputCadNome" name="inputCadNome" type="text" placeholder="Informe seu nome" class="form-control input-md" required>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">Idade</label>  
            <div class="col-md-5">
               <input id="inputCadIdade" name="inputCadIdade" type="date" placeholder="Informe sua idade" class="form-control input-md" required>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">Peso</label>  
            <div class="col-md-5">
               <input id="inputCadPeso" name="inputCadPeso" type="text" placeholder="Informe seu peso" class="form-control input-md" required> 
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">Altura</label>  
            <div class="col-md-5">
               <input id="inputCadAltura" name="inputCadAltura" type="text" placeholder="Informe sua altura" class="form-control input-md" required> 
            </div>
         </div>
         <!-- <div class="form-group">
            <label class="col-md-4 control-label">IMC</label>  
            <div class="col-md-5">
               <input id="inputCadIMC" name="inputCadIMC" type="text" class="form-control input-md">
            </div>
         </div> -->
         <div class="form-group">
            <label class="col-md-4 control-label">Gênero</label>
            <div class="col-md-"> 
               <label class="radio-inline">
               <input type="radio" name="radiosCadGenero" id="radiosCadGenero" value="f" required>
               Feminino
               </label> 
               <label class="radio-inline">
               <input type="radio" name="radiosCadGenero" id="radiosCadGenero" value="m" required>
               Masculino
               </label> 
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">E-mail</label>  
            <div class="col-md-8">
               <input id="inputCadEmail" name="inputCadEmail" type="email" placeholder="Informe seu e-mail" class="form-control input-md" required> 
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">CPF</label>  
            <div class="col-md-8">
               <input id="inputCadCPF" name="inputCadCPF" type="text" placeholder="Informe seu CPF xxx.xxx.xxx-xx" class="form-control input-md"  pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                  title="Digite o CPF no formato xxx.xxx.xxx-xx" required>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label">Senha</label>  
            <div class="col-md-8">
               <input id="inputCadSenha" name="inputCadSenha" type="password" placeholder="Informe sua senha" class="form-control input-md" required>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label"></label>
            <div class="col-md-8"> 
               <label class="radio-inline">
               <input type="radio" name="radiosCadVericidade" id="radiosCadVericidade" value="vericidade" required>
               Declaro a veracidade dos dados preenchidos
               </label> 
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


</body>
</html>
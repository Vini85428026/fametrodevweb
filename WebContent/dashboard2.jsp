<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" session="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
 
    <title> Bem-vindo aos seus resultados. </title>

    <link rel="icon" type="image/png" href="favicon.png" />
    <link href="estilo/bootstrap/css/bootstrap.min.css" rel="stylesheet">    
    <link href="estilo/style.css" rel="stylesheet">
    
</head>
<body>
<%
HttpSession sessionsa = request.getSession(false);
	String idSessao = (String) sessionsa.getAttribute("id");
	String nomeSessao = (String) sessionsa.getAttribute("nome");

%>

<nav class="navbar navbar-default navbar-fixed-top">
         <div class="container-fluid">
            <div class="navbar-header">
               </button>
               <a class="navbar-brand" href="#"><img src="./img/bioidade.jpeg" width="50" height="28" /></a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               <ul class="nav navbar-nav">
				  <li class="active"><a href="#">Meus dados<span class="glyphicon glyphicon-tasks"></span></a></li>
                  <li><a href="./questions.jsp">Responder question�rio <span class="glyphicon glyphicon-tasks"></span> </a></li>
                  <li><a href="./resultado.jsp">Resultado <span class="glyphicon glyphicon-list"></span> </a></li>
                 
               </ul>
      
      <ul class="nav navbar-nav navbar-right">  
				  <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${nomeSessao} </a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
        
      </ul>
    </div>
  </div>
</nav>

<br>
<br>
<br>

<div class="col-md-8 col-md-offset-3 text-justify">
    
    <br><br><br>
<h1> Bem Vindo Usu�rio</h1>
<h3><p>Sua Idade Biol�gica, com um sistema de c�lculo de idade biol�gica  
deve automatizar o processo dos resultados de uma pesquisa 
cient�fica feita por Thomas Perls, professor associado da 
Boston University School of Medicine e criador  da Calculadora 
Living to 100 Life Expectancy, ajudou a criar um question�rio 
que revela a "idade verdadeira" do seu corpo, que nem sempre 
� o mesmo que o  n�mero de anivers�rios que voc� comemorou. 
N�o � uma ci�ncia exata, mas pode  identificar o que voc�s est�o
fazendo certo e o que voc� poderia melhorar para  abrandar o 
processo de envelhecimento.

<p>Quer conhecer sua idade biol�gica ? Clique em <a href="login.jsp">Entrar.</a></p>
</p> </h3>
<br>
<br>
<footer>
        <p> Alunos ADS FAMETRO 2017</p>
</footer>

</body>
</html>
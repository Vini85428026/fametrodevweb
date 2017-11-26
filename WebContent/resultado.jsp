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
      <title> Resultado </title>
	  <link rel="icon" type="image/png" href="favicon.png" />
      <link href="estilo/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <link href="estilo/style.css" rel="stylesheet">
</head>
<body>

<% if (session.getAttribute("id") == null || session.getAttribute("id").equals("")) {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	} else {
		if(session.getAttribute("tipo").equals("admin")){
			request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		}else{	
%>

<nav class="navbar navbar-default navbar-fixed-top">
         <div class="container-fluid">
            <div class="navbar-header">
               </button>
               <a class="navbar-brand" href="./dashboard2.jsp"><img src="./img/bioidade.jpeg" width="50" height="28" /></a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               <ul class="nav navbar-nav">
                  <li class=""><a href="dashboard2.jsp">Inicio <span class="glyphicon glyphicon-home"></span> </a></li>
               </ul>
               <ul class="nav navbar-nav navbar-right">
			       <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${nome}</a></li>
                  <li><a href="/fametrodevweb/Logout"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
               </ul>
            </div>
         </div>
      </nav>
      <br> <br> <br> <br>

      <form class="form-horizontal" method="POST" action="/Questionario">

      <div class="form-group">
      <label class="col-md-7 control-label"> Resultado da última avaliação do usuário: </label>
        
      </div>
      <div class="form-group">

         <label class="col-md-4 control-label">Nome</label>  
         <div class="col-md-4">
            <input id="inputResultNome" name="inputResultNome" type="text"  class="form-control input-md" value="${nome}" disabled >
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Idade Biologica</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeCrono" name="inputResultIdadeCrono" type="text" class="form-control input-md" value="${idadeBio}" disabled >
         </div>
      </div>
      <div class="form-group">
         <label class="col-md-4 control-label">Idade Cronológica</label>  
         <div class="col-md-4">
            <input id="inputResultIdadeBio" name="inputResultIdadeBio" type="text"class="form-control input-md" value="${idadeCrono}" disabled> 
         </div>
      </div>
      <br> <br> <br> <br> <br>

<% } }  %>
	 
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
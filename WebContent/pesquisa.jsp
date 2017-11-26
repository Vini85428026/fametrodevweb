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
				  <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${nome} </a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
        
      </ul>
    </div>
  </div>
</nav>

<br>
<br>
<br>

    <br><br><br>

	<div class="col-xs-12 col-md-12">
    	<div class="well">
        	<form id="loginForm" method="POST" action="/fametrodevweb/PesquisarPaciente">	
			  <div class="input-group">
			      <input type="text" name="inputPesquisa" class="form-control" required placeholder="Busque por email...">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="submit" name="ButtonPesquisa">Procurar</button>
			      </span>
		      </div>
      		</form>
		</div>
	</div>
      <br> <br> <br> 
	<div class="col-xs-12 col-md-12">     
      <div class="container">
		  <table class="table">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>Idade Cronologica</th>
		        <th>Idade Biologica</th>
		        <th>IMC</th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach items="${listaPesquisa}" var="item">
				    <tr>
				    	<td>${item.nome}</td>
				    	<c:if test="${item.idadeCronologica != null}">
							<td>${item.idadeCronologica}</td>
						</c:if>
						<c:if test="${item.idadeCronologica == null}">
							<td> - </td>
						</c:if>
						<c:if test="${item.idadeBiologica != null}">
							<td>${item.idadeBiologica}</td>
						</c:if>
						<c:if test="${item.idadeBiologica == null}">
							<td> - </td>
						</c:if>
				    	<td>${item.imc}</td>
				    </tr>
				</c:forEach>
		    </tbody>
		  </table>
</div>
</div>
      
<footer>
        <p> Alunos ADS FAMETRO 2017</p>
</footer>

<c:if test="${mensagem == 'undefined'}">
	<script>
		alert("Paciente não encontrado!");
	</script>
</c:if>

</body>
</html>
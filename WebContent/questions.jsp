<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title> Perguntas </title>
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
                  <li class=""><a href="index.jsp">Início <span class="glyphicon glyphicon-home"></span> </a></li>
				
               </ul>
      
      <ul class="nav navbar-nav navbar-right">   
				  <li><a href="#"><span class="glyphicon glyphicon-user"></span> Usuário</a></li>
                  <li><a href="./index.jsp"> <span class="glyphicon glyphicon-off"></span> Sair</a></li>
        
      </ul>
    </div>
  </div>
</nav>

<br>
<br>
<br>
      <div class="box">
         <form class="form-horizontal method="POST" action="/Questionario">
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">1 - Quantas vezes você ingere bebidas alcoólicas?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios1" id="radios-0" value="0" required>
                     A. Duas ou três bebidas por semana
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios1" id="radios-1" value="0" required>
                     B. Duas ou três bebidas por mês
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios1" id="radios-2" value="3" required>
                        C. Cerca de uma bebida por dia
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios1" id="radios-3" value="10" required>
                  D. Duas ou mais bebidas por dia
                  </label>
                  </div>
                  <div class="radio">
                     <label for="radios-4">
                     <input type="radio" name="radios1" id="radios-4" value="0" required>
                     E. Nenhuma
                     </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">2 - Quando você fica cansado, você:</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios2" id="radios-0" value="-2">
                     A. Calça seus tênis ou liga para uma namorada 
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios2" id="radios-1" value="-2">
                     B. Faz algumas respirações profundas e continua indo 
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios2" id="radios-2" value="5">
                        C. Vai preparar alguns brownies?
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios2" id="radios-3" value="5">
                  D. Não faz nada
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">3. Com que frequência você come carne vermelha?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios3" id="radios-0" value="12">
                     A. Todos os dias
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios3" id="radios-1" value="5">
                     B. De uma a três vezes por semana
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios3" id="radios-2" value="0">
                        C. Uma ou duas vezes por mês
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios3" id="radios-3" value="-5">
                  D. Nunca
                  </label>
                  </div>
                  <div class="radio">
                     <label for="radios-4">
                     <input type="radio" name="radios3" id="radios-4" value="0">
                     E. Nenhuma
                     </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">4 - Seu nível de escolaridade é:</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios4" id="radios-0" value="3">
                     A. Ensino fundamental
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios4" id="radios-1" value="0">
                     B. Ensino Médio
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios4" id="radios-2" value="-4">
                        C. Faculdade/Universidade
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios4" id="radios-3" value="-5">
                  D. Pós-Graduação
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">5 - Se você estivesse em uma crise pessoal, quantas pessoas ajudariam, mesmo que apenas deixassem uma refeição?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios5" id="radios-0" value="-2">
                     A.Talvez 10 
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios5" id="radios-1" value="-3">
                     B. Eu tenho uma enorme rede de apoio
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios5" id="radios-2" value="0">
                        C. Um pequeno grupo de amigos e família
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios5" id="radios-3" value="2">
                  D. Eu provavelmente iria sozinho(a)
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">6 - Como você está envolvido na comunidade em geral?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios6" id="radios-0" value="-5">
                     A. Eu estou em uma escola, igreja, artes ou atividades de caridade
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios6" id="radios-1" value="-3">
                     B. Sou voluntário regularmente
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios6" id="radios-2" value="-1">
                        C. Eu arremesso uma ou duas vezes por ano
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios6" id="radios-3" value="0">
                  D. Eu escrevo um cheque de vez em quando
                  </label>
                  </div>
               </div>
            </div>
			<div class="form-group">
               <label class="col-md-4 control-label" for="radios">7 - Quantas vezes por semana você faz 30 minutos de exercí­cio moderado a vigoroso?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios7" id="radios-0" value="-12">
                     A. Todos os dias
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios7" id="radios-1" value="-9">
                     B. Quatro ou cinco
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios7" id="radios-2" value="-4">
                        C. . Um a três
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios7" id="radios-3" value="5">
                  D. Caminhar dentro de casa conta?
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">8 - Qual é a sua história com o tabagismo?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios8" id="radios-0" value="0">
                     A.Eu nunca fui fumante
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios8" id="radios-1" value="8">
                     B. Trago um cigarro nos fins de semana
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios8" id="radios-2" value="4">
                        C. Eu abandonei e eu me sinto muito melhor
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios8" id="radios-3" value="10">
                  D.  Eu abandonei, mas eu ainda tem problemas com meus pulmãos
                  </label>
                  </div>
                  <div class="radio">
                     <label for="radios-4">
                     <input type="radio" name="radios8" id="radios-4" value="20">
                     E.  Eu fumo regularmente
                     </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">9 - Qual refeição reflete melhor o seu menu regular?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios9" id="radios-0" value="2">
                     A. Um hambúrguer, batata frita e sobremesa
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios9" id="radios-1" value="-4">
                     B. Legumes torrados com quinoa e grão-de-bico
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios9" id="radios-2" value="-5">
                        C. Salmão com espinafre e arroz integral
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios9" id="radios-3" value="0">
                  D. Penne com frango e salada
                  </label>
                  </div>
               </div>
            </div>
			<div class="form-group">
               <label class="col-md-4 control-label" for="radios">10 - Você bebe café?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios10" id="radios-0" value="-3">
                     A. Tenho que ter minhas duas ou três xícaras por dia
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios10" id="radios-1" value="-3">
                     B. Eu praticamente vivo na Starbucks 
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios10" id="radios-2" value="0">
                        C. Uma caneca da manhã
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios10" id="radios-3" value="0">
                  D. Eu não sou fã 
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">11 - Como está seu sono?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios11" id="radios-0" value="-4">
                     A.Eu durmo seis a sete horas por noite
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios11" id="radios-1" value="-4">
                     B. Eu gosto de 8 a 10 horas se eu conseguir isso
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios11" id="radios-2" value="5">
                        C. Eu descanso entre quatro a seis horas
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios11" id="radios-3" value="7">
                  D.  Eu só durmo 4 horas
                  </label>
                  </div>
               </div>
            </div>
            <div class="form-group">
               <label class="col-md-4 control-label" for="radios">12 - Vamos falar sobre sexo.</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios12" id="radios-0" value="0">
                     A. Eu não estou tendo muita ação
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios12" id="radios-1" value="-3">
                     B. Eu faço sexo três vezes por semana em média
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                        <input type="radio" name="radios12" id="radios-2" value="-3">
                        C. Mais comum uma vez por semana para mim 
                  </div>
                  <div class="radio">
                  <label for="radios-3">
                  <input type="radio" name="radios12" id="radios-3" value="0">
                  D. Eu fico tranquilo talvez uma vez por mês
                  </label>
                  </div>
               </div>
            </div>
			<div class="form-group">
               <label class="col-md-4 control-label" for="radios">13 - Alguém de seus familiares viveu até 95 anos?</label>
               <div class="col-md-4">
                  <div class="radio">
                     <label for="radios-0">
                     <input type="radio" name="radios13" id="radios-0" value="-10">
                     A. Pelo menos uma pessoa na minha família
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-1">
                     <input type="radio" name="radios13" id="radios-1" value="0">
                     B. Não tenho certeza
                     </label>
                  </div>
                  <div class="radio">
                     <label for="radios-2">
                     <input type="radio" name="radios13" id="radios-2" value="0">
                     C. Não 
                  </div>
               </div>
            </div>
			<nav aria-label="Page navigation" align="center">
               <ul class="pagination">
                  <li>
                     <a href="./resultado.jsp" aria-label="Next">
                     <span aria-hidden="true">Concluir</span>
                     </a>
                  </li>
               </ul>
            </nav>
         </form>
      </div>
      <br>
      <footer>
         <p> Alunos ADS FAMETRO 2017</p>
      </footer>

</body>
</html>
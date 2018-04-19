<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.Pais, java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>Listar Paises</title>
	
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>

<!-- Menu superior -->
	
	<c:import url="Menu.jsp"/>
	
	  
	<div id="main" class="container">
	
		<h3 class="page-header">Listar Paises</h3>
		
		<c:forEach var="pais" items="${paiseslist}">
		
			
            <div class="row">
            <div class="col-md-12">
                    <p><strong>ID</strong>
                    <p><strong>Nome</strong>
                    </p>
                    <p>
                    		${pais.id}
                        ${pais.nome}
                    </p>
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-6">
                    <p><strong>População</strong>
                    </p>
                    <p>
                        ${pais.populacao}
                    </p>
                </div>
                
                <div class="col-md-6">
                    <p><strong>Área</strong>
                    </p>
                    <p>
                        ${pais.area}
                    </p>
                </div>
            </div>
            <hr />
            
	
	
	
	</c:forEach>
	

	
	<div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.jsp" class="btn btn-info">Voltar</a>
                </div>
            </div>
            
	</div>
	
	  <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
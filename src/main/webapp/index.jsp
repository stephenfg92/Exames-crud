<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>Exames-crud</title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<section>
		<nav>
			<ul>
				<li><a href="<s:url action='pacienteListar'/>" target="frame">Pacientes</a></li>
				<li><a href="<s:url action='exameListar'/>" target="frame">Exames</a></li>
				<li><a href="<s:url action='resultadoListar'/>" target="frame">Resultados</a></li>
			</ul>
		</nav>
		<iframe src="<s:url action='pacienteListar'/>" name="frame" class="scroller"></iframe>
	</section>
</body>
</html>

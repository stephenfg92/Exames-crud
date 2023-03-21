<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Inclusão de paciente concluída</title>
  </head>
  <body>
    <h3>Paciente <s:property value="paciente.nomePaciente" /> incluído com sucesso.</h3>

    <p><a href="<s:url action='pacienteListar' />" >OK</a>.</p>
  </body>
</html
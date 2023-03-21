<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Incluir Paciente</title>
  </head>
  <body>
    <h3>Insira os dados para inclusão de paciente</h3>

    <s:form action="pacienteIncluir">
      <s:textfield name="paciente.nomePaciente" label="Nome completo" />
      <s:submit/>
    </s:form>	

    <p><a href="<s:url action='pacienteListar'/>">Voltar</a></p>
  </body>
</html>

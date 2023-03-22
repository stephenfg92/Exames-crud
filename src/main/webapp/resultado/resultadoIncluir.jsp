<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Incluir Resultado</title>
  </head>
  <body>
    <h3>Insira os dados para inclusão de resultado</h3>

    <s:form action="resultadoIncluir">
      <s:textfield name="resultadoObj.idExame" label="Id Exame" />
      <s:textfield name="resultadoObj.idPaciente" label="Id Paciente" />
      <s:textfield name="resultadoObj.data" label="Data" />
      <s:textfield name="resultadoObj.resultado" label="Resultado" />
      <s:submit/>
    </s:form>	

    <p><a href="<s:url action='resultadoListar'/>">Voltar</a></p>
  </body>
</html>
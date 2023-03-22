<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Inclusão de resultado concluída</title>
  </head>
  <body>
    <h3>Resultado de exame <s:property value="resultadoObj.nomeExame" /> 
        para o paciente <s:property value="resultadoObj.nomePaciente" /> 
        na data de <s:property value="resultadoObj.data" /> incluído com sucesso.
    </h3>

    <p><a href="<s:url action='resultadoListar' />" >OK</a>.</p>
  </body>
</html
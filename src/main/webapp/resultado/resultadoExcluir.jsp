<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>resultados crud</title>
        <link rel="stylesheet" href="css/crud.css">
    </head>
    <body>
        <h1>Excluir resultado</h1>
        <h3>Confirmar a exclusão do resultado?</h3>
        <p>Id: <s:property value="%{resultado.getIdResultado()}"></s:property></p>
        <p>Exame: <s:property value="%{resultado.getNomeExame()}"></s:property></p>
        <p>Paciente: <s:property value="%{resultado.getNomePaciente()}"></s:property></p>
        <p>Data: <s:property value="%{resultado.getData()}"></s:property></p>
        <p>Resultado: <s:property value="%{resultado.getResultado()}"></s:property></p>
        <s:form action="resultadoExcluir" method="POST">
            <s:hidden name="idResultado" value="%{resultado.getIdResultado()}"></s:hidden>
            <s:submit class="submit" value="Excluir"></s:submit>
        </s:form>
        <p><a href="<s:url action='resultadoListar' />" >Voltar</a></p>
    </body>
</html>
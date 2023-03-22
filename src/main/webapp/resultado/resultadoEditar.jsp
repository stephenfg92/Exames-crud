<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames crud</title>
    </head>
    <body>
        <h1>Editar Resultado</h1>
            <s:form action="resultadoEditar" method="POST">
                <s:hidden name="idResultado" value="%{resultado.getIdResultado()}"></s:hidden>
                <s:textfield name="Exame" value="%{resultado.getNomeExame()}" label="Exame" readonly="true" disabled="true"></s:textfield>
                <s:textfield name="Paciente" value="%{resultado.getNomePaciente()}" label="Paciente" readonly="true" disabled="true"></s:textfield>
                <s:textfield name="data" value="%{resultado.getData()}" label="Data"></s:textfield>
                <s:textfield name="resultado" value="%{resultado.getResultado()}" label="Resultado"></s:textfield>
                <s:submit value="Salvar"></s:submit>
            </s:form>
            <p><a href="<s:url action='resultadoListar' />" >Voltar</a>.</p>
    </body>
</html>
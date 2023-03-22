<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames crud</title>
        <link rel="stylesheet" href="css/crud.css">        
    </head>
    <body>
        <h1>Alterar Paciente</h1>
        <s:form action="pacienteEditar" method="POST">
            <s:hidden name="idPaciente" value="%{paciente.getIdPaciente()}"></s:hidden>
            <s:textfield name="nomePaciente" value="%{paciente.getNomePaciente()}" label="Nome"></s:textfield>
            <s:submit class="submit" value="Salvar"></s:submit>
        </s:form>
        <p><a href="<s:url action='pacienteListar' />" >Voltar</a></p>
    </body>
</html>
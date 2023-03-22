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
        <h1>Excluir Paciente</h1>
        <h3>Confirmar a exclusão do paciente?</h3>
        <p>Id: <s:property value="%{paciente.getIdPaciente()}"></s:property></p>
        <p>Nome: <s:property value="%{paciente.getNomePaciente()}"></s:property></p>
        <s:form action="pacienteExcluir" method="POST">
            <s:hidden name="idPaciente" value="%{paciente.getIdPaciente()}"></s:hidden>
            <s:submit class="submit" value="Excluir"></s:submit>
        </s:form>
        <p><a href="<s:url action='pacienteListar' />" >Voltar</a></p>
    </body>
</html>
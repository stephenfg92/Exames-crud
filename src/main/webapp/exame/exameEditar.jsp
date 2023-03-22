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
        <h1>Alterar Exame</h1>
        <s:form action="exameEditar" method="POST">
            <s:hidden name="idExame" value="%{exame.getIdExame()}"></s:hidden>
            <s:textfield name="nome" value="%{exame.getNome()}" label="Nome"></s:textfield>
            <s:textfield name="descricao" value="%{exame.getDescricao()}" label="Descrição"></s:textfield>
            <s:submit class="submit" value="Salvar"></s:submit>
        </s:form>
        <p><a href="<s:url action='exameListar' />" >Voltar</a></p>
    </body>
</html>
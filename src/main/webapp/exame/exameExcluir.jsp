<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames crud</title>
    </head>
    <body>
        <h1>Excluir exame</h1>
        <h3>Confirmar a exclusão do exame?</h3>
        <p>Id: <s:property value="%{exame.getIdExame()}"></s:property></p>
        <p>Nome: <s:property value="%{exame.getNome()}"></s:property></p>
        <p>Descrição: <s:property value="%{exame.getDescricao()}"></s:property></p>
        <s:form action="exameExcluir" method="POST">
            <s:hidden name="idExame" value="%{exame.getIdExame()}"></s:hidden>
            <s:submit value="Excluir"></s:submit>
        </s:form>
        <p><a href="<s:url action='exameListar' />" >Voltar</a>.</p>
    </body>
</html>
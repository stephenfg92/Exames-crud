<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de exames</title>
    </head>
    <body>
        <h1>Exames</h1>
        <p><a href="<s:url action='exameIncluir'/>">Incluir exame</a></p>
        <table cellspacing="10">
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Nome
                </th>
                <th>
                    Descrição
                </th>
            </tr>
        <s:iterator value="getExames()" var="e">
            <tr>
                <td>
                    <s:property value="#e.getIdExame()"></s:property>
                </td>
                <td>
                    <s:property value="#e.getNome()"></s:property>
                </td>
                <td>
                    <s:property value="#e.getDescricao()"></s:property>
                </td>
                <td>
                    <s:url action="exameObter" var="linkExameAtualizar">
                        <s:param name="idExame"><s:property value="#e.getIdExame()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="false"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkExameAtualizar}">Editar</s:a><br>
                </td>
                <td>
                    <s:url action="exameObter" var="linkExameExcluir">
                        <s:param name="idExame"><s:property value="#e.getIdExame()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="true"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkExameExcluir}">Excluir</s:a><br>
                </td>
            </tr>
        </s:iterator>
        </table>
    </body>
</html>

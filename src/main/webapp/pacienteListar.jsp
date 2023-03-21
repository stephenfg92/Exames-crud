<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Pacientes</title>
    </head>
    <body>
        <h1>Pacientes</h1>
        <table cellspacing="10">
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Nome
                </th>
            </tr>
        <s:iterator value="getPacientes()" var="p">
            <tr>
                <td>
                    <s:property value="#p.getIdPaciente()"></s:property>
                </td>
                <td>
                    <s:property value="#p.getNomePaciente()"></s:property>
                </td>
                <%--<td>
                    <s:url action="ObterCliente" var="linkAtualizar">
                        <s:param name="clienteId"><s:property value="#c.getId()"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkAtualizar}">Atualizar</s:a><br>
                </td>
                <td>
                    <s:url action="DeletarCliente" var="linkDeletar">
                        <s:param name="clienteId"><s:property value="#c.getId()"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkDeletar}">Deletar</s:a><br>
                </td>--%>
            </tr>
        </s:iterator>
        </table>
        <a href="index.jsp">Voltar</a><br>
    </body>
</html>

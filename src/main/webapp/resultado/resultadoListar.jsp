<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de resultados</title>
    </head>
    <body>
        <h1>Resultados</h1>
        <p><a href="<s:url action='resultadoIncluir'/>">Incluir resultado</a></p>
        <table cellspacing="10">
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Paciente
                </th>
                <th>
                    Exame
                </th>
                <th>
                    Data
                </th>
                <th>
                    Resultado
                </th>
            </tr>
        <s:iterator value="getResultados()" var="r">
            <tr>
                <td>
                    <s:property value="#r.getIdResultado()"></s:property>
                </td>
                <td>
                    <s:property value="#r.getNomePaciente()"></s:property>
                </td>
                <td>
                    <s:property value="#r.getNomeExame()"></s:property>
                </td>
                <td>
                    <s:property value="#r.getData()"></s:property>
                </td>
                <td>
                    <s:property value="#r.getResultado()"></s:property>
                </td>
                <td>
                    <s:url action="resultadoObter" var="linkResultadoAtualizar">
                        <s:param name="idResultado"><s:property value="#r.getIdResultado()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="false"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkResultadoAtualizar}">Editar</s:a><br>
                </td>
                <td>
                    <s:url action="resultadoObter" var="linkResultadoExcluir">
                        <s:param name="idResultado"><s:property value="#r.getIdResultado()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="true"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkResultadoExcluir}">Excluir</s:a><br>
                </td>
            </tr>
        </s:iterator>
        </table>
    </body>
</html>
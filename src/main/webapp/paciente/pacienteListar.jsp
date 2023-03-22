<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Pacientes</title>
        <link rel="stylesheet" href="css/crud.css">
    </head>
    <body>
        <h1>Pacientes</h1>
        <p><a href="<s:url action='pacienteIncluir'/>">Incluir Paciente</a></p>
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
                <td>
                    <s:url action="pacienteObter" var="linkPacienteAtualizar">
                        <s:param name="idPaciente"><s:property value="#p.getIdPaciente()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="false"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkPacienteAtualizar}">Editar</s:a><br>
                </td>
                <td>
                    <s:url action="pacienteObter" var="linkPacienteExcluir">
                        <s:param name="idPaciente"><s:property value="#p.getIdPaciente()"></s:property></s:param>
                        <s:param name="excluir"><s:property value="true"></s:property></s:param>
                    </s:url>
                    <s:a href="%{linkPacienteExcluir}">Excluir</s:a><br>
                </td>
            </tr>
        </s:iterator>
        </table>
    </body>
</html>

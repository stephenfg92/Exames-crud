<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Incluir exame</title>
    <link rel="stylesheet" href="css/crud.css">
  </head>
  <body>
    <h3>Insira os dados para inclusão de exame</h3>

    <s:form action="exameIncluir">
      <s:textfield name="exame.nome" label="Nome" />
      <s:textfield name="exame.descricao" label="Descrição" />
      <s:submit class="submit" value="Incluir"/>
    </s:form>	

    <p><a href="<s:url action='exameListar'/>">Voltar</a></p>
  </body>
</html>

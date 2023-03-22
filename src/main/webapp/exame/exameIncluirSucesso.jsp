<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Inclusão de exame concluída</title>
    <link rel="stylesheet" href="css/crud.css">
  </head>
  <body>
    <h3>exame <s:property value="exame.nome" /> incluído com sucesso.</h3>

    <p><a href="<s:url action='exameListar' />">OK</a></p>
  </body>
</html
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Erro na inclusão de resultado</title>
    <link rel="stylesheet" href="css/crud.css">
  </head>
  <body>
    <h3>
      Algo deu errado na inclusão de resultado :(
      Tente novamente mais tarde.
    </h3>

    <p><a href="<s:url action='resultadoListar' />" >OK</a>.</p>
  </body>
</html
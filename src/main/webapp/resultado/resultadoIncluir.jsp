<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Incluir Resultado</title>
    <script type="text/javascript" src="js/inputmask.min.js"></script>
    <script type="text/javascript" src="js/validardata.js"></script>
  </head>
  <body>
    <h3>Insira os dados para inclusão de resultado</h3>

    <s:form id="validarData" action="resultadoIncluir">
      <s:select name="resultadoObj.idExame" label="Exame" list="exames" listKey="idExame" listValue="nome" />
      <s:select name="resultadoObj.idPaciente" label="Paciente" list="pacientes" listKey="idPaciente" listValue="nomePaciente" />
      <s:textfield name="resultadoObj.data" label="Data" class="inputMasked"/>
      <script>Inputmask("99/99/9999").mask(".inputMasked");</script>
      <s:textfield name="resultadoObj.resultado" label="Resultado" />
      <s:submit/>
    </s:form>	
    <p><a href="<s:url action='resultadoListar'/>">Voltar</a></p>
    <script>
      const form = document.querySelector("#validarData");
      form.addEventListener('submit', (event) => {
        const dataString = document.querySelector('[name="resultadoObj.data"]').value;
        if (!validardata(dataString)) {
          event.preventDefault();
          alert('Data inválida! A data deve ser igual ou maior a data atual.');
        }
      });
    </script>
  </body>
</html>
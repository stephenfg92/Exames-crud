<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames crud</title>
        <link rel="stylesheet" href="css/crud.css">
        <script type="text/javascript" src="js/inputmask.min.js"></script>
        <script type="text/javascript" src="js/validardata.js"></script>
    </head>
    <body>
        <h1>Editar Resultado</h1>
            <s:form id="validarData" action="resultadoEditar" method="POST">
                <s:hidden name="idResultado" value="%{resultado.getIdResultado()}"></s:hidden>
                <s:textfield name="Exame" value="%{resultado.getNomeExame()}" label="Exame" readonly="true" disabled="true"></s:textfield>
                <s:textfield name="Paciente" value="%{resultado.getNomePaciente()}" label="Paciente" readonly="true" disabled="true"></s:textfield>
                <s:textfield name="data" value="%{resultado.getData()}" label="Data" class="inputMasked"></s:textfield>
                <script>Inputmask("99/99/9999").mask(".inputMasked");</script>
                <s:textfield name="resultado" value="%{resultado.getResultado()}" label="Resultado"></s:textfield>
                <s:submit class="submit" value="Salvar"></s:submit>
            </s:form>
            <p><a href="<s:url action='resultadoListar' />" >Voltar</a></p>
            <script>
                const form = document.querySelector("#validarData");
                form.addEventListener('submit', (event) => {
                  const dataString = document.querySelector('[name="data"]').value;
                  if (!validardata(dataString)) {
                    event.preventDefault();
                    alert('Data inválida! A data deve ser igual ou maior a data atual.');
                  }
                });
            </script>
    </body>
</html>
function validardata(dataString) {
    var formato = new RegExp(/^\d{2}\/\d{2}\/\d{4}$/);
    var dataAtual = removerHorasDate(new Date());
    
    try {
      var data = converterStringParaDate(dataString);

      dataMs = data.getTime();
      dataAtualMs = dataAtual.getTime();
      
      if (dataMs >= dataAtualMs && formato.test(dataString)) {
        return true;
      } else {
        return false;
      }
    } catch (e) {
      return false;
    }
}

function converterStringParaDate(dataString){
    var [dia, mes, ano] = dataString.split("/");
    if (mes > 12){
        throw new Error("Mês inválido!");
    }
    return new Date(ano, mes -1, dia);;
}

function removerHorasDate(date){
    date.setHours(0, 0, 0, 0);
    return date;
}
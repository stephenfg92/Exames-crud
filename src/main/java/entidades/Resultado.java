package entidades;

import org.apache.commons.validator.routines.DateValidator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;  

public class Resultado {
	Integer idResultado;
	Integer idExame;
	Integer idPaciente;
	String nomeExame;
	String nomePaciente;
	String data;
	String resultado;
	
	public Resultado() {}
	
	public Resultado(Integer idResultado, String data, String resultado) {
		this.idResultado = idResultado;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idExame, Integer idPaciente, String data, String resultado) {
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado,Integer idExame,  Integer idPaciente, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado, Integer idExame, Integer idPaciente, String nomeExame, String nomePaciente, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.nomeExame = nomeExame;
		this.nomePaciente = nomePaciente;
		this.data = data;
		this.resultado = resultado;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(Integer idExame) {
		this.idExame = idExame;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public static boolean validarData(String dataString) throws ParseException {
		DateValidator validador = new DateValidator();
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAtual = removerHoras(new Date());
		boolean valido = false;
		
		try {
			Date data = formato.parse(dataString);
			
			boolean dataMaiorOuIgualAtual = data.compareTo(dataAtual) >= 0;
			boolean formatoValido = validador.isValid(dataString, "dd/MM/yyyy");
			
			if (dataMaiorOuIgualAtual && formatoValido)
				valido = true;			
		} catch (Exception e) {
			System.out.println("Validação de data falhou: " + e);
			e.printStackTrace();
		}
		
		return valido;
	}
	
	private static Date removerHoras(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}
}

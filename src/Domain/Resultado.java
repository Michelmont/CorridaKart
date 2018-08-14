package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Resultado {
	
	public String nomePiloto;
	public String codigoPiloto;
	public int numeroVoltas;
	public Long tempoTotalProva;
	
	public Resultado(){
		nomePiloto = "";
		codigoPiloto= "";
		numeroVoltas = 0;
	    tempoTotalProva = (long) 0;
		
		
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public String getCodigoPiloto() {
		return codigoPiloto;
	}

	public void setCodigoPiloto(String codigoPiloto) {
		this.codigoPiloto = codigoPiloto;
	}

	public int getNumeroVoltas() {
		return numeroVoltas;
	}

	public void setNumeroVoltas(int numeroVoltas) {
		this.numeroVoltas = numeroVoltas;
	}


	public Long getTempoTotalProva() {
		return tempoTotalProva;
	}

	public void setTempoTotalProva(Long tempoTotalProva) {
		this.tempoTotalProva = tempoTotalProva;
	}
	
	
	
	
}

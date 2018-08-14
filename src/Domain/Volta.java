package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Volta {
	
	private Date hora;
	private Long tempoVolta;
	private Double velocidadeMediaVolta;
	private int numeroVolta;
	private Piloto piloto;
	
	
	
	
	public Volta() {}


	public Date getHora() {
		return hora;
	}


	public void setHora(Date hora) {
		this.hora = hora;
	}


	public Long getTempoVolta() {
		return tempoVolta;
	}


	public void setTempoVolta(Long tempoVolta) {
		this.tempoVolta = tempoVolta;
	}


	public double getVelocidadeMediaVolta() {
		return velocidadeMediaVolta;
	}


	public void setVelocidadeMediaVolta(double velocidadeMediaVolta) {
		this.velocidadeMediaVolta = velocidadeMediaVolta;
	}


	public int getNumeroVolta() {
		return numeroVolta;
	}


	public void setNumeroVolta(int numeroVolta) {
		this.numeroVolta = numeroVolta;
	}


	public Piloto getPiloto() {
		return piloto;
	}


	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	
}

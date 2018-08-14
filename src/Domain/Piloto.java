package Domain;
import Infrastructure.Log;
public class Piloto {
	private String nomePiloto;
	private String codigoPiloto;


	public Piloto(String codigoPiloto, String nomePiloto)
	{
		this.nomePiloto = nomePiloto;
		this.codigoPiloto = codigoPiloto;
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
	
}
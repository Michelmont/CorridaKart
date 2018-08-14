package Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import Infrastructure.Log;

public class CorridaFactory {
	private String arquivoDeLog;
	public CorridaFactory(String arquivo) {
		this.arquivoDeLog =arquivo;
	}
	
	public CorridaFactory() {}
	
	public Corrida ObterCorridaDoArquivoDeLog()
	{
		Log logArquivo = new Log(arquivoDeLog);
		List<Volta> voltas = new ArrayList<Volta>();
		List<String> logConteudo = logArquivo.ObterLogCorrida();
		
		try
		{
			logConteudo.forEach( v->{
				String[] atributosVolta =v.split("\\s+");
				
				Volta volta = new Volta();
				
				
				try {
					volta.setTempoVolta(new SimpleDateFormat("m:s.S").parse(atributosVolta[5]).getTime());
					volta.setHora(new SimpleDateFormat("k:m:s.S").parse(atributosVolta[0]));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				volta.setNumeroVolta(Integer.parseInt(atributosVolta[4]));
				volta.setVelocidadeMediaVolta(Double.parseDouble(atributosVolta[6].replaceAll(",", ".")));
				
				
				Piloto piloto = new Piloto(atributosVolta[1],atributosVolta[3]);
				volta.setPiloto(piloto);
				
				voltas.add(volta);
			});
			
			Corrida corrida = new Corrida(voltas);
			return corrida;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	

}

package Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Corrida {
	private List<Volta> voltas;
		
	
	public Corrida(List<Volta> voltas) {
		this.voltas = voltas;
	}

	public List<Volta> getVoltas() {
		return voltas;
	}

	public List<Resultado> ObterResultado()
	{
		List<Resultado> resultados = new ArrayList<Resultado>();
		
		List<String>  codigosPilotos = new ArrayList<String>();
        
        voltas.forEach(v -> {
        	if(codigosPilotos.contains(v.getPiloto().getCodigoPiloto())==false)
        			codigosPilotos.add(v.getPiloto().getCodigoPiloto());
        });
      
        codigosPilotos.forEach(p -> {
        	Resultado resultado = new Resultado();
        	resultado.setCodigoPiloto(p);
        	List<Volta> voltasDoPiloto = new ArrayList<Volta>();
        	
        	voltas.forEach(v -> {
        		if(v.getPiloto().getCodigoPiloto().equals(p))
        			voltasDoPiloto.add(v);
        	});
        	
        	voltasDoPiloto.forEach(vp -> {
        		System.out.println(vp.getTempoVolta());
        		if(resultado.getNomePiloto().equals(""))
        			resultado.setNomePiloto(vp.getPiloto().getNomePiloto());
        		if(resultado.getNumeroVoltas() < vp.getNumeroVolta() )
        			resultado.setNumeroVoltas(vp.getNumeroVolta());
        		Long tempoTotalProva = resultado.getTempoTotalProva()+ vp.getTempoVolta();
        		
        		resultado.setTempoTotalProva(tempoTotalProva);
        		
        		
        	});
        	
        	resultados.add(resultado);
        	
        });
        
        resultados.sort(Comparator.comparingInt(Resultado::getNumeroVoltas).reversed().thenComparingDouble(Resultado::getTempoTotalProva));
        	
        
        resultados.forEach(r ->{
        	
        		Date d = new Date(r.getTempoTotalProva());
        		System.out.println(r.getCodigoPiloto() + "  " + d);
        });
        return resultados;

	}


	
	
}
	

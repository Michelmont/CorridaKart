package TestLayer;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Domain.Corrida;
import Domain.CorridaFactory;
import Domain.Resultado;

class CorridaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void obterPosicaoPilotosTest() {
		CorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		
		List<Resultado> resultados = new ArrayList<Resultado>();
		
		resultados = corrida.ObterResultado();
		
		resultados.forEach(r -> {
			Date d = new Date(r.getTempoTotalProva());
			SimpleDateFormat format = new SimpleDateFormat("m:s.S");
			System.out.println(r.getCodigoPiloto() + " " + r.getNomePiloto() + " " + r.getNumeroVoltas() + " " + format.format(d));
		});
		
		assertEquals(resultados.get(0).getCodigoPiloto(), "038");
		assertEquals(resultados.get(0).getNomePiloto(), "F.MASSA");
		assertEquals(resultados.get(0).numeroVoltas, 4);
		
		
		
	
	} 

}

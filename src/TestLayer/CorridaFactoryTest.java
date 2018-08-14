package TestLayer;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Domain.Corrida;
import Domain.CorridaFactory;
import Domain.Volta;

class CorridaFactoryTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void obterCorridaDoArquivoDeLog() throws ParseException {
		CorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		assertNotNull(corrida);
		assertNotNull(corrida.getVoltas());
		List<Volta> voltas =corrida.getVoltas(); 
		Volta volta = voltas.get(0);
		
		Date horaEsperada  = new SimpleDateFormat("k:m:s.S").parse("23:49:08.277");
		Date tempoVoltaEsperado = new SimpleDateFormat("m:ss.SSSSSS").parse("1:02.852");
		
		assertEquals(horaEsperada, volta.getHora());
		assertEquals(tempoVoltaEsperado, volta.getTempoVolta());
		System.out.println(tempoVoltaEsperado.toString());
		double velocidadeMediaEsperada = 44.275;
		assertEquals(velocidadeMediaEsperada, volta.getVelocidadeMediaVolta());
		int numeroVoltaEsperado = 1;
		assertEquals(numeroVoltaEsperado, volta.getNumeroVolta());
		String codigoPilotoEsperado = "038";
		assertEquals(codigoPilotoEsperado,volta.getPiloto().getCodigoPiloto());
		String nomePilotoEsperado = "F.MASSA";
		assertEquals(nomePilotoEsperado, volta.getPiloto().getNomePiloto());
		
	}
	
	@Test
	void obterCorridaDoArquivoDeLogInexistente() throws ParseException {
		CorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest1.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		assertNull(corrida);
		
	}
	
	@Test
	void obterCorridaDoArquivoDeLogFormatoInvalido() throws ParseException {
		CorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTestInvalido.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		assertNull(corrida);
		
	}

}

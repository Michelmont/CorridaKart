package TestLayer;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Infrastructure.Log;

class LogTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testObterLogCorridaArquivoValido() {
		Log log = new Log("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest.txt");
		List<String> corrida = log.ObterLogCorrida();
		assertNotNull(corrida);
		
		corrida.forEach(c ->{
			System.out.println(c);
		});
	}
	
	@Test
	void testObterLogCorridaArquivoInexistente() {
		Log log = new Log("C:\\Fake.txt");
		List<String> corrida = log.ObterLogCorrida();
		assertNull(corrida);
	}

}



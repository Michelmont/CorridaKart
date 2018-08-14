package Application;

public class Main {
	
	private String arquivo;
	
	public static void main(String[] args) {
		
		SCorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		
		List<Resultado> resultados = new ArrayList<Resultado>();
		
		resultados = corrida.ObterResultado();
		
		resultados.forEach(r -> {
			Date d = new Date(r.getTempoTotalProva());
			SimpleDateFormat format = new SimpleDateFormat("m:s.S");
			System.out.println(r.getCodigoPiloto() + " " + r.getNomePiloto() + " " + r.getNumeroVoltas() + " " + format.format(d));
		});
		
		
		
		
	}

}

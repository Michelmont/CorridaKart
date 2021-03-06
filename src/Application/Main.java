package Application;

public class Main {
	
	private String arquivo;
	
	public static void main(String[] args) {
		
		CorridaFactory factory = new CorridaFactory("C:\\Users\\User\\eclipse-workspace\\CorridaDeKart\\src\\TestLayer\\CorridaTest.txt");
		Corrida corrida = factory.ObterCorridaDoArquivoDeLog();
		
		List<Resultado> resultados = new ArrayList<Resultado>();
		
		resultados = corrida.ObterResultado();
		int i =0;
		resultados.forEach(r -> {
			Date d = new Date(r.getTempoTotalProva());
			SimpleDateFormat format = new SimpleDateFormat("m:s.S");
			System.out.println(String.valueOf(i) + " " + r.getCodigoPiloto() + " " + r.getNomePiloto() + " " + r.getNumeroVoltas() + " " + format.format(d));
			i++;
		});
		
		
		
		
	}

}

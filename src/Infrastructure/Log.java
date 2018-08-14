package Infrastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Log {
	private String  path;
	
	public Log(String path) {
		this.path = path;
		
	}
	
	public List<String> ObterLogCorrida()
	{
		List<String> log = new ArrayList<String>();
		try
		{
			String sLinhaAtual;
			BufferedReader br = new BufferedReader(new FileReader(path));
			br.readLine();
			while((sLinhaAtual = br.readLine()) != null)
				log.add(sLinhaAtual);
		    br.close();	
			return log;			
			
		}
		catch(Exception ex)
		{
			return null;
			
		}
	}
}

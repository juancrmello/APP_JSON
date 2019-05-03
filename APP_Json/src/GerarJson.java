import java.io.FileWriter;

import com.google.gson.Gson;

public class GerarJson {

	public static void main(String[] args) {

		Cerveja skol = new Cerveja();
		
		skol.setNome("Skol Ice Blue Red");
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		
		Gson g = new Gson();
		
		String json = g.toJson(skol);
		
		try {
			FileWriter fw = new FileWriter("c:/Json/Cerveja.json");
			fw.write(json);
			fw.close();
			
			
			
		} catch(Exception e) {
			
			
		}
		
		System.out.println(json);
	}

}

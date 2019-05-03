import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LerJson {

	public static void main(String[] args) {

		Gson gson = new Gson();
		
		try {
			
			BufferedReader arquivoCerveja = new BufferedReader(new FileReader("c:/Json/Cerveja.json"));
			
			Cerveja skol =  gson.fromJson(arquivoCerveja, Cerveja.class);
			
			System.out.println(skol);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}

}

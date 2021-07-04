package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entities.Relatorio;

//Classe temporaria para armazenar os valores(json,na home do usuario)
//TODO substituir por um banco de dados
public class State {

	public static ArrayList<Relatorio> relatorios = new ArrayList<Relatorio>();
	
	public static Scanner sc = new Scanner (System.in);
	
	private static String FILE_NAME = "relatorios.json";
	
	private static String getOsFilePath() {
		return Paths.get(System.getProperty("user.home"),FILE_NAME).toString();
	}
	
	public static void saveState() {
		 try {
			  Gson gson = new Gson();
			  
		      FileWriter myWriter = new FileWriter(getOsFilePath());		      
		      myWriter.write(gson.toJson(relatorios));
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void loadState() throws FileNotFoundException {
		Gson gson = new Gson();
		String content = new Scanner(new File(getOsFilePath())).useDelimiter("\\Z").next();
		relatorios = gson.fromJson(content, new TypeToken<List<Relatorio>>(){}.getType());
		//TODO fechar scanner
		
	}
	
	public static void cadastrarRelatorio(Relatorio r) {
		relatorios.add(r);
		saveState();
	}
}

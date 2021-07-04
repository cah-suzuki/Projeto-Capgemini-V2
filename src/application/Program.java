package application;

import java.io.FileNotFoundException;
import java.text.ParseException;

import view.MenuPrincipal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		try {
			State.loadState();
		} catch (FileNotFoundException e) {
			//Arquivo nao existe, continuando
		}
		
				
        MenuPrincipal chamarMenuPrincipal = new MenuPrincipal();
        chamarMenuPrincipal.MostrarMenuPrincipal();
		
        State.sc.close();
	}

}

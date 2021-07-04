package view;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
import java.util.Locale;

import application.State;
import entities.Relatorio;
import services.Filtro;

public class MenuDeBusca {
	
	
	
	
	public void MostrarMenuDeBusca() throws ParseException {
		Locale.setDefault(Locale.US);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Menu De Busca - Entre com cliente ou enter para todos os clientes ");
		String CLIENTE = State.sc.nextLine();
		//TODO teste de input 
		//TODO coletar data inicial e final para filtrar também por data
//		System.out.print("Entre com data inicial ou enter para todas as datas ");
//		Date DATA_INICIAL = sdf.parse(State.sc.nextLine());
//		System.out.print("Entre com data final ou enter para todas as datas ");
//		Date DATA_FINAL = sdf.parse(State.sc.nextLine());
		
//		if (DATA_INICIAL.equals("")) {
//			DATA_INICIAL = null;
//		}
	  
	    
	    List<Relatorio> relatorioFiltrado = Filtro.RelatorioFiltrado(CLIENTE);
	    System.out.print(relatorioFiltrado);
	    for (Relatorio x : relatorioFiltrado){
	    	System.out.println(x);
	    	System.out.print("------------------------------------------------------------------------");
	    }
	    
	  	    		
	}
	

	

}

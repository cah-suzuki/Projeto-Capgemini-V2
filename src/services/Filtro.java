package services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import application.State;
import entities.Relatorio;

public class Filtro {
	
	String cliente;
	Date dataInicial;
	Date dataFinal;
		
	
	public Filtro(String cliente, Date dataInicial, Date dataFinal) {
		this.cliente = cliente;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}


	
	public static List<Relatorio> RelatorioFiltrado(String cliente) {
	List<Relatorio> relatorioFiltrado =
			State.relatorios.stream()
			.filter(relatorio ->relatorio.getCliente().equals(cliente))
			//TODO filtrar por data
//			.filter(relatorio ->relatorio.getDataInicial().after(dataInicial))
//			.filter(relatorio ->relatorio.getDataFinal().before(dataFinal))
			.collect(Collectors.toList());
		
		
		return relatorioFiltrado;
				
	}

}

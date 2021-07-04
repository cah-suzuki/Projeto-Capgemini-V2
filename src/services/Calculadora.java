package services;

import entities.Anuncio;
import entities.Relatorio;

public class Calculadora {
	
	double BASE_VISUALIZACAO_NOVA = 40;
	double BASE_COMPARTILHA = 3;
	double BASE_CLICKS = 20;
	double BASE_VISUALIZACAO = 12;
	double BASE_VISUALIZACAO_POR_CLICK = 100;
	double PESSOAS_POR_INVESTIMENTO = 30;
	
	
	
	public Relatorio getDadosRelatorio(Anuncio anuncio) {
		
		
		
		
  	    double valorInvestido = anuncio.getInvestimentoPorDia();
  	    double totalDias = anuncio.getDiasTotais();
  	    double totalInvestido = valorInvestido * totalDias;
  	    double visualizacaoInicial = PESSOAS_POR_INVESTIMENTO * totalInvestido;
  	    
  	    Relatorio relatorio = new Relatorio();
  	    relatorio.setQuantidadeMaximaVisualizacao(visualizacaoInicial);
   	    relatorio.setValorTotalInvestido(totalInvestido);
   	    relatorio.setCliente(anuncio.getCliente());
   	    relatorio.setDataInicial(anuncio.getDataInicial());
   	    relatorio.setDataFinal(anuncio.getDataFinal());
  	  
		
  	    
  	  for (int i=0;i<=3;i++) {
		 double totalClicks = (visualizacaoInicial * BASE_VISUALIZACAO)/BASE_VISUALIZACAO_POR_CLICK;
		 double totalCompartilha = (totalClicks * BASE_COMPARTILHA) / BASE_CLICKS;
		 double visualizacaoNova = totalCompartilha * BASE_VISUALIZACAO_NOVA;
							
		
		relatorio.setQuantidadeMaximaVisualizacao(relatorio.getQuantidadeMaximaVisualizacao() + visualizacaoNova);
		relatorio.setQuantidadeMaximaClicks(relatorio.getQuantidadeMaximaClicks() + totalClicks);
		relatorio.setQuantidadeMaximaCompartilhamento(relatorio.getQuantidadeMaximaCompartilhamento() + totalCompartilha);
		visualizacaoInicial = visualizacaoNova;
		
	           		 
  	 }		 	
		
	
		return relatorio;
	
		
	}

}

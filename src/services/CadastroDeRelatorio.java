package services;

import java.text.ParseException;

import application.State;
import entities.Anuncio;
import entities.Relatorio;

public class CadastroDeRelatorio {
	
	public void CadastraESalvaRelatorio()throws ParseException {
		LeitorDeDados leitorDeDados = new LeitorDeDados();
		Anuncio anuncio = leitorDeDados.lerDados();
		Calculadora calculadora = new Calculadora();
		Relatorio relatorio = calculadora.getDadosRelatorio(anuncio);
		State cadastrarRelatorio = new State();
	    State.cadastrarRelatorio(relatorio);
		
	}



	
}

package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import application.State;
import entities.Anuncio;

public class LeitorDeDados  {
	
	String nomeAnuncio;
	String nomeCliente;
	Date dataInicial;
	Date dataFinal;
	double valorInvestimentoPorDia;

	
	public Anuncio lerDados() throws ParseException {
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Cadastro de Anuncio");
		System.out.print("Digite nome do anuncio: ");
		String nomeAnuncio = State.sc.nextLine();
		System.out.print("Digite nome do cliente/empresa: ");
		String nomeCliente = State.sc.nextLine();
		System.out.print("Digite data inicial do anuncio (dd/MM/yyyy): ");
		Date dataInicial = sdf.parse(State.sc.next());
		System.out.print("Digite data final do anuncio (dd/MM/yyyy): ");
		Date dataFinal = sdf.parse(State.sc.next());
		System.out.print("Digite valor de investimento por dia: ");
		double valorInvestimentoPorDia = State.sc.nextDouble();
     	
	//	testeLeitura();
    // TODO chamada para teste em todos os 5 inputs
		
		Anuncio anuncio= new Anuncio(nomeAnuncio,nomeCliente,dataInicial,dataFinal,valorInvestimentoPorDia);
	  	return anuncio;
	}
	
	//Exemplo de como validar input de dados usando Scanner.
	//TODO a ser replicado para todos os outros valores de input
	public double testeLeitura() {
		Anuncio anuncio = new Anuncio();
		double valorInvestido = anuncio.getInvestimentoPorDia();
		
		Scanner sc = new Scanner(System.in);

		  while (valorInvestido <=0) {
			  try {
			     System.out.print("Por favor entre com valor de investimento para ter acesso a simulação de alcance");
			     valorInvestido = sc.nextDouble();
			     anuncio.setInvestimentoPorDia(valorInvestido);
		      }catch(Exception e){
				 System.out.println("Valor Inválido.Por favor digite valor numérico");
				 sc.nextLine();
				                                            
			  } 
		 }
		  sc.close();
		
		return valorInvestido;
	
	}
	

}

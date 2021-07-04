package view;

import java.text.ParseException;
import java.util.Locale;

import application.State;
import services.CadastroDeRelatorio;

public class MenuPrincipal {
	
	Integer OPCAO_DO_MENU = -1;
	

	public void MostrarMenuPrincipal() throws ParseException  {
		
		
		
		while (OPCAO_DO_MENU!=0) {
			imprimeOpcoes();
			
			if (OPCAO_DO_MENU == 1) {
				CadastroDeRelatorio cadastroDeRelatorio = new CadastroDeRelatorio();
				cadastroDeRelatorio.CadastraESalvaRelatorio();
				
			}
			if (OPCAO_DO_MENU == 2) {
				MenuDeBusca menuDeBusca = new MenuDeBusca();
				menuDeBusca.MostrarMenuDeBusca();
				
			}
				
		}
		
	
			
	}
	
	public void imprimeOpcoes() {
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Menu Principal - Digite opção desejada");
		System.out.print("1 - Novo Cadastro ");
		System.out.print("2 - Busca ");
		System.out.print("0 - Sair ");
		OPCAO_DO_MENU = State.sc.nextInt();	
		State.sc.nextLine();
		
		
	}
	

}

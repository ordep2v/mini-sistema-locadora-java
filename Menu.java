package locadoraG4;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

	public void Menu() {
		CadastroClientes cadastrar = new CadastroClientes();
		CadastroFilmes cadastrarFilmes = new CadastroFilmes();

		int opcaoMenu;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("\n|(1)Cadastrar Clientes|\n" + "|(2)Cadastrar Filme|\n" + "|(3)Locação de Filme|\n"
					+ "|(4)Clientes cadastrados|\n" + "|(5)Filmes cadastrados|\n" + "|(0)Sair|\n");

			System.out.println("Você escolhe: ");
			opcaoMenu = entrada.nextInt();
			switch (opcaoMenu) {
			case 1:
				cadastrar.cadastrarClientes();

				break;

			case 2:
				cadastrarFilmes.cadastrarFilmes();
				break;
			case 3:
				break;
			case 4:
				cadastrar.mostrarClientesCadastrados();
				break;
			case 5:
				cadastrarFilmes.mostrarFilmesCadastrados();
				break;
			case 0:
				System.out.println("Você saiu do sistema!");
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenu != 0);
		entrada.close();
	}

}

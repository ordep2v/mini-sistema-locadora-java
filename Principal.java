package locadoraG4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Login telaLogin = new Login();
		Registro telaRegistro = new Registro();
		Scanner entrada = new Scanner(System.in);
		int opcaoMenu = 0;
		do {
			System.out.println("Seja bem-vindo ao sistema de sua locadora!");
			System.out.println("Aperte (1) para fazer o login!\nAperte (2) para se registrar!");
			opcaoMenu = entrada.nextInt();
			switch (opcaoMenu) {
			case 1:
				telaLogin.logar();
				break;
			case 2:
				telaRegistro.registrar();
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenu != 1 && opcaoMenu != 2);
	}
}

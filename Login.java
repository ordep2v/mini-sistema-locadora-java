package locadoraG4;

import java.util.Scanner;

public class Login {
	String login = "";
	String senha = "";
	Scanner entrada = new Scanner(System.in);
	Registro registro = new Registro();
	Menu menu = new Menu();
	String loginRegistrado = registro.getLogin();
	String senhaRegistrada = registro.getSenha();
	
	public void logar() {
		do {
		System.out.println("Logar-se:");
		System.out.println("Insira seu login: ");
		login = entrada.next();
		System.out.println("Insira sua senha: ");
		senha = entrada.next();
		
			System.out.println("Logado com sucesso!");
			menu.Menu();
		
			System.out.println("Login e/ou senha errados!");
		
		
	}while(loginRegistrado.equals(login) && senha.equals(senhaRegistrada));
		
	}
}


	
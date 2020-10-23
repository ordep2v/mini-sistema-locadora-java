package locadoraG4;

import java.util.Scanner;

public class Registro implements Comparable<Registro>{
	 private String login = "";
	 private String senha = "";
	private Scanner entrada = new Scanner(System.in);

	public void registrar() {
		Login telaLogar = new Login();
		System.out.println("Registrar-se: ");
		do {
			System.out.println("Defina um login de no mínimo 4 dígitos: ");
			login = entrada.next();
			System.out.println("Defina uma senha de no mínimo 4 dígitos: ");
			senha = entrada.next();
			if (login.length() < 4 || senha.length() < 4) {
				System.out.println("Erro! O login e a senha devem conter pelo menos 4 dígitos! ");

			} else {
				System.out.printf("O usuário *%s* foi registrado com sucesso!\n", login);
				telaLogar.logar();
			}
		} while (login.length() < 4 && senha.length() < 4);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "Registro [login=" + login + ", senha=" + senha + "]";
	}

	@Override
	public int compareTo(Registro arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}

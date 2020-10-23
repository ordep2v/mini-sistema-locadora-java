package locadoraG4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CadastroClientes {
	String nome = "";
	int qtdClientes = 0;
	int i, j;
	String endereco = "";
	String cpf = "";
	String telefone = "";
	int qtdLocada = 0;
	int id = 0;
	int opcaoMenu = 0;

	Scanner entrada = new Scanner(System.in);

	ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
	public void cadastrarClientes() {

		System.out.println("|Cadastro de clientes|");
		System.out.printf("Quantos clientes desejas cadastrar?\nSua resposta:\n");
		qtdClientes = entrada.nextInt();

		for (i = 0; i < qtdClientes; i++) {
			id += 1;
			System.out.printf("Digite o nome do cliente[%d]:\n", i + 1);
			nome = entrada.next();
			System.out.printf("Digite o endereço do cliente[%d]:\n", i + 1);
			endereco = entrada.next();
			System.out.printf("Digite o CPF do cliente[%d]:\n", i + 1);
			cpf = entrada.next();
			System.out.printf("Digite o telefone do cliente[%d]:\n", i + 1);
			telefone = entrada.next();
			System.out.printf("Quantas mídias o cliente[%d] alugou:\n", i + 1);
			qtdLocada = entrada.nextInt();
			System.out.printf("Cliente[%d] cadastrado com sucesso!\n", i + 1);
			listaClientes.add(new Clientes(id,nome,cpf,endereco,telefone,qtdLocada));
		}
		System.out.println(listaClientes.toString());

	}
	public void mostrarClientesCadastrados() {
		System.out.println((listaClientes.toString()));
	}
}




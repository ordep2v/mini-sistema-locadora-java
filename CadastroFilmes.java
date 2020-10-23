package locadoraG4;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFilmes {
	String nome = "";
	int quantidade = 0;
	String genero = "";
	int qtdFilmes = 0;
	int i;
	Scanner entrada = new Scanner(System.in);

	ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
	public void cadastrarFilmes() {

		System.out.println("|Cadastro de filmes|");
		System.out.printf("Quantos filmes desejas cadastrar?\nSua resposta:\n");
		qtdFilmes = entrada.nextInt();

		for (i = 0; i < qtdFilmes; i++) {
			System.out.printf("Digite o título do filme[%d]:\n", i + 1);
			nome = entrada.next();
			System.out.printf("Digite o gênero do filme[%d]:\n", i + 1);
			genero = entrada.next();
			System.out.printf("Digite a quantidade de mídias em estoque[%d]:\n", i + 1);
			quantidade = entrada.nextInt();
			System.out.printf("Filme[%d] cadastrado com sucesso!\n", i + 1);
			listaFilmes.add(new Filme(nome,genero,qtdFilmes));
		}
		System.out.println(listaFilmes.toString());

	}
	public void mostrarFilmesCadastrados() {
		System.out.println((listaFilmes.toString()));
	}
}
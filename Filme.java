package locadoraG4;

public class Filme {
	private String nome;
	private String genero;
	private int quantidade;
	private int quantidadeLocada;
	private boolean disponivel;
	private String nomeCliente;

	public Filme(String nome, String genero, int quantidade) {
		this.nome = nome;
		this.genero = genero;
		this.quantidade = quantidade;

	}
	public Filme(String nome, int quantidadeLocada, String nomeCliente) {
		this.nome = nome;
		this.quantidade = quantidadeLocada;
		this.nomeCliente = nomeCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidadeLocada() {
		return quantidadeLocada;
	}
	public void setQuantidadeLocada(int quantidadeLocada) {
		this.quantidadeLocada = quantidadeLocada;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	@Override
	public String toString() {
		String mostrarLista = "\nTítulo:"+ getNome() +" Gênero: "+ getGenero() + " Quantidade total de mídias: " + getQuantidade();
		return mostrarLista;
	}

}

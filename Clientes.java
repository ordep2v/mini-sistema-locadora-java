package locadoraG4;

public class Clientes {
	private String nome, endereco, cpf;
	private String telefone;
	private int qtdLocada;
	private int id;

	public Clientes(int id, String nome, String endereco, String cpf, String telefone, int qtdLocada) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.qtdLocada = qtdLocada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdLocada() {
		return qtdLocada;
	}

	public void setQtdLocada(int qtdLocada) {
		this.qtdLocada = qtdLocada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		String mostrarLista = "\nID: " + getId() + ", Nome: "+ getNome()+", Endereço: " + getEndereco() + ", CPF: "+ getCpf() + 
				", Telefone: "+ getTelefone() + ", Quantidade de mídias locadas: " + getQtdLocada();
		return mostrarLista;
	}

}

package br.com.aula;

public class Pessoa {

	private Long idade;
	private String nome;
	private String telefone;
	
	public Pessoa salvar(Long idade, String nome, String telefone) {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(idade);
		pessoa.setNome(nome);
		pessoa.setTelefone(telefone);	
		
		return pessoa;
	}
	
	public Pessoa criarPessoa(Long tipoPessoa) {
		if (tipoPessoa.equals(1L) ) { 
			return new Funcionario(); 
		} else {
			return new Dependente();
		}
	}
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}

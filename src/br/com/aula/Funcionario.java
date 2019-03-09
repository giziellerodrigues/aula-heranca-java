package br.com.aula;

public class Funcionario extends Pessoa {
	
	private String matricula;
	
	public Funcionario (Pessoa pessoa) {
		super();
		setIdade(pessoa.getIdade());
		setNome(pessoa.getNome());
		setTelefone(pessoa.getTelefone());
	}
	
	public Funcionario () {
		super();
	}
	
	// Sobrecarga
	public Funcionario salvar(Long idade, String nome, String telefone, String matricula) {
	    Funcionario func = new Funcionario (super.salvar(idade, nome, telefone));
	    func.setMatricula(matricula);
		return func;
	}
	
	//Sobreescrita
	@Override
	public Pessoa salvar(Long idade, String nome, String telefone) {
		return super.salvar(idade, nome, telefone);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", getMatricula()=" + getMatricula() + ", getIdade()="
				+ getIdade() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}

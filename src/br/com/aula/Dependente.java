package br.com.aula;

public class Dependente extends Pessoa {
	
	private Funcionario funcionario;
	private String inscricao;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	@Override
	public String toString() {
		return "Dependente [funcionario=" + funcionario + ", inscricao=" + inscricao + ", getFuncionario()="
				+ getFuncionario() + ", getInscricao()=" + getInscricao() + ", getIdade()=" + getIdade()
				+ ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

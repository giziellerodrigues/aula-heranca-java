package br.com.aula;

public class Exe_Pessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		System.out.println(" primeira instancia " + pessoa);
		Pessoa retorno = pessoa.salvar(10L, "Maria","99999999999");
		System.out.println("segunda instancia " + retorno);
		
		
		Funcionario func = (Funcionario) pessoa.criarPessoa(1L);
		Funcionario funcRetorno = func.salvar(10L, "Joao", "9999999", "absgdggg");
		
		System.out.println("funcionario " + funcRetorno);
		
		
		Dependente dependente = (Dependente) pessoa.criarPessoa(2L);
		
		System.out.println("dependente " + dependente);
		
		
	}

}

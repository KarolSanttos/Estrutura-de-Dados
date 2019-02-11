package br.edu.ifce.estruturas.vetor;

public class TesteRemover {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Felipe");



		Vetor v1 = new Vetor();

		v1.remover(a1);


		System.out.println(v1);

	}

}

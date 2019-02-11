package br.edu.ifce.estruturas.vetor;

public class TesteAdiciona {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Willian");

		Aluno a2 = new Aluno();
		a2.setNome("Bia");

		Aluno a3 = new Aluno();
		a3.setNome("Pe.Fabio de Melo");

		Vetor v1 = new Vetor();

		v1.adiciona(a1);
		v1.adiciona(a2);
		v1.adiciona(a3);

		System.out.println(v1);

	}

}

package br.edu.ifce.estruturas.vetor;

public class TestePega {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Felipe");

		Aluno a2 = new Aluno();
		a2.setNome("Karol");

		Aluno a3 = new Aluno();
		a3.setNome("Beatriz");

		Vetor v1 = new Vetor();

		v1.adiciona(a1);
		v1.adiciona(a2);
		v1.adiciona(a3);

		System.out.println(v1.pega(2));
	}

}

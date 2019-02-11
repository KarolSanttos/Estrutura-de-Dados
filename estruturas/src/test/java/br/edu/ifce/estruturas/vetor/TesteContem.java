package br.edu.ifce.estruturas.vetor;

public class TesteContem {

	public static void main(String[] args) {
		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		a1.setNome("Abrahao");

		Aluno a2 = new Aluno();
		a2.setNome("Moises");

		Aluno a3 = new Aluno();
		a3.setNome("Josue");

		v1.adiciona(a1);
		v1.adiciona(a2);
		v1.adiciona(a3);

		System.out.println(v1);

		Aluno a4 = new Aluno();
		a4.setNome("Kevin");

		System.out.println(v1.contem(a4));

	}

}

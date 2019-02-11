package br.edu.ifce.estruturas.vetor;

public class TesteTamanho {

	public static void main(String[] args) {
		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();

		v1.adiciona(a1);

		System.out.println(v1.tamanho());

		v1.adiciona(a1);
		
		System.out.println(v1.tamanho());

	}

}

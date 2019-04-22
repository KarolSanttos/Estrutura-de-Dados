package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Cesar");		
		a2.setNome("Cesar");
		
		System.out.println(a1.equals(a2));

	}

}

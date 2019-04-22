package br.edu.ifce.estruturas.conjunto;

import br.edu.ifce.estruturas.conjunto.ConjuntoEspalhamento;

public class TesteTamanho {

	public static void main(String[] args) {
ConjuntoEspalhamento cel = new ConjuntoEspalhamento();
		
		
		cel.adiciona("Abrahao");
		cel.adiciona("Beatriz");
		cel.adiciona("Karol");
		cel.adiciona("kevin");
		cel.adiciona("Cesar");
		cel.adiciona("Ednaldo");
		cel.adiciona("Junior");
		cel.adiciona("Warlley");
		
		System.out.println(cel.tamanho());

	}

}
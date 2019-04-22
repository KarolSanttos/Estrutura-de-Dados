package br.edu.ifce.estruturas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	ArrayList<LinkedList<String>> tabelaEspalhamento
	= new ArrayList<LinkedList<String>>();

	int numeroElementos = 0;
	public ConjuntoEspalhamento() {
		
		for(int i=0; i<26; i++) {
			
			LinkedList<String> lista = new LinkedList<String>();
			tabelaEspalhamento.add(lista);
			
		}
		
	}
	
	private int CalculaCodigoHash(String palavra) {
		int codigo = 1;
		
		for(int i=0; i<palavra.length();i++) {
			codigo = 31*codigo + palavra.toLowerCase().charAt(i); 
		
	}
		//PODE DAR NEGATIVO
		return codigo;
	}
	private int calculaIndiceTabela(String palavra) {
		
		int CodigoHash = (this.CalculaCodigoHash(palavra));
		
		CodigoHash = Math.abs(CodigoHash);
		
		return CodigoHash % this.tabelaEspalhamento.size();
		
	}
	public void adiciona(String palavra) {
		
		if(!contem(palavra)) {
			this.verificaCarga();
			int indice = calculaIndiceTabela(palavra);
			List<String> lista = this.tabelaEspalhamento.get(indice);
			lista.add(palavra);
			numeroElementos++;
		
		}
		
	}
	
	public boolean contem(String palavra) {
		
		int indice = this.calculaIndiceTabela(palavra);
		LinkedList<String> verifica = this.tabelaEspalhamento.get(indice);
		return verifica.contains(palavra);
		
	}
	
	public void remove(String palavra) {
		
		if(contem(palavra)) {
		
		int indice = this.calculaIndiceTabela(palavra);
		LinkedList<String> remover = this.tabelaEspalhamento.get(indice);
		remover.remove(palavra);
		numeroElementos--;
		this.verificaCarga();
		
		
		}
		
	}
	public List<String> pegaTodas(){
		List<String> palavras = new ArrayList<String>();
		  
		  for (int i = 0; i < this.tabelaEspalhamento.size(); i++) {
		    palavras.addAll(this.tabelaEspalhamento.get(i));
		  }
		  
		  return palavras;
		}
	
	public int tamanho() {
	    return this.numeroElementos;
	}  
	
	public void verificaCarga(){
		
		int numeroElementos = this.numeroElementos;
		int numeroListas = this.tabelaEspalhamento.size();
		
		double carga = numeroElementos/numeroListas;
		
		if(carga>0.7) {
			redimensionaTabela(numeroListas*2);
		}else if(carga<0.3){
			redimensionaTabela(Math.max(10, numeroListas/2));
		}
	}
    
	public void redimensionaTabela(int novoNumLista) {
		
		List<String> guardaPalavras = new ArrayList<String>();
		
		for(int i=0; i<this.tabelaEspalhamento.size();i++) {
			guardaPalavras.addAll(this.tabelaEspalhamento.get(i));
		}
		
		this.tabelaEspalhamento.clear();
		for(int i=0; i<novoNumLista; i++) {
			
			tabelaEspalhamento.add(new LinkedList<String>());
			
		}
		for(String palavras: guardaPalavras) {
			this.adiciona(palavras);
		}
		
	}
}
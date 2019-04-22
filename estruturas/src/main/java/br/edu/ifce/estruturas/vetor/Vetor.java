package br.edu.ifce.estruturas.vetor;

public class Vetor {

	private Object[] objetos = new Object[100];
	private int totalDeElementos = 0;

	public void adiciona(Object objeto) {
		this.garanteEspaco();
	    this.objetos[totalDeElementos] = objetos;
	    this.totalDeElementos++;
	}

	public void adiciona(int posicao, Object objeto) {
		this.garanteEspaco();
        for(int i = this.totalDeElementos; i>posicao; i--){
            objetos[i] = objetos[i-1];
        }

        this.objetos[posicao] = objeto;
        this.totalDeElementos++;
	}

	public Object pega(int posicao) {
	    if(posicaoOcupada(posicao) == false){
	        throw new IllegalArgumentException("Posicao invalida");
	        }

	        return this.objetos[posicao];
	}

	public void remover(Object a1) {
	    this.objetos[totalDeElementos] = null;
	    this.totalDeElementos--;
	}

	public boolean contem(Object objeto) {
		for (int i = 0; i < this.totalDeElementos; i++) {
			if (objeto == this.objetos[i]) {
				return true;
			}
		}
		return false;
	}
	
	private void garanteEspaco() {
		if(this.totalDeElementos == this.objetos.length) {
			Object [] novoArray = new Object[this.objetos.length*2];
			for(int i=0; i < this.totalDeElementos-1; i++) {
				novoArray[i] = this.objetos[i];
			}
			this.objetos = novoArray; 
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}
	
    boolean posicaoOcupada(int posicao){

        if(posicao >= 0 && posicao < this.totalDeElementos){
            return true;
        } else {
            return false;
        }            
    }

	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}

		builder.append(this.objetos[this.totalDeElementos - 1]);
		builder.append("]");

		return builder.toString();
	}

}

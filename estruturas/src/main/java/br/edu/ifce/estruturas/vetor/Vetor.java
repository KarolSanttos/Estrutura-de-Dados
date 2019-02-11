package br.edu.ifce.estruturas.vetor;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeElementos = 0;

	public void adiciona(Aluno aluno) {
	    this.alunos[totalDeElementos] = aluno;
	    this.totalDeElementos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
        for(int i = this.totalDeElementos; i>posicao; i--){
            alunos[i] = alunos[i-1];
        }

        this.alunos[posicao] = aluno;
        this.totalDeElementos++;
	}

	public Aluno pega(int posicao) {
	    if(posicaoOcupada(posicao) == false){
	        throw new IllegalArgumentException("Posicao invalida");
	        }

	        return this.alunos[posicao];
	}

	public void remover(int posicao) {
	    this.alunos[totalDeElementos] = aluno;
	    this.totalDeElementos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeElementos; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
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
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeElementos - 1]);
		builder.append("]");

		return builder.toString();
	}

}

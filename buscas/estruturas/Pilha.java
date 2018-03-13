package estruturas;

import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Pilha {
	private int tamanho;
	private Cidade[] cidades;
	private int topo;

	public Pilha(int tamanho) {
		this.tamanho = tamanho;
		// instanciando o meu vetor - criando o tamanho do vetor
		cidades = new Cidade[this.tamanho];
		topo = -1;
	}

	public void empilhar(Cidade cidade) {
		if (!pilhaCheia()) {
			this.cidades[++topo] = cidade;
		} else {
			System.out.println("Pilha Cheia");
		}

	}

	public Cidade desempilhar() {
		if (!pilhaVazia()) {
			return cidades[topo--];
		} else {
			System.out.println("Pilha Vazia");
			return null;
		}

	}

	public Cidade getTopo() {
		return cidades[topo];
	}

	private boolean pilhaVazia() {
		return (topo == -1);
	}

	private boolean pilhaCheia() {
		return (topo == tamanho - 1);
	}

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		Mapa mapa = new Mapa();
		pilha.empilhar(mapa.getMoradaNova());
		pilha.empilhar(mapa.getJuatama());
		pilha.empilhar(mapa.getIbicuitinga());

		System.out.println(pilha.getTopo().getNome());
		pilha.desempilhar();
		System.out.println(pilha.getTopo().getNome());
	}

}

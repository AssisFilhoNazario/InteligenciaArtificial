package estruturas;

import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Fila {

	private int tamanho;
	// fila de cidades
	private Cidade[] cidades;
	private int inicio;
	private int fim;
	private int numerosElementos;

	public Fila(int tamanho) {
		this.tamanho = tamanho;
		cidades = new Cidade[tamanho];
		inicio = 0;
		fim = -1;
		numerosElementos = 0;

	}

	public void enfileirar(Cidade cidade) {
		if (!filaCheia()) {
			if (fim == tamanho - 1) {
				fim = -1;
			}

			cidades[++fim] = cidade;
			numerosElementos++;
		} else {
			System.out.println("Fila Cheia");
		}
	}

	public Cidade desenfileirar() {
		if (!filaVazia()) {
			Cidade temp = cidades[inicio++];
			if (inicio == tamanho) {
				inicio = 0;
			}

			numerosElementos--;
			return temp;
		} else {
			System.out.println("Fila vazia");
			return null;
		}
	}

	public Cidade getPrimeiro() {
		return cidades[inicio];
	}

	public boolean filaVazia() {
		return (numerosElementos == 0);
	}

	public boolean filaCheia() {
		return (numerosElementos == tamanho);
	}

	public int getNumerosElementos() {
		return numerosElementos;
	}

	public static void main(String[] args) {
		Fila fila = new Fila(5);
		Mapa mapa = new Mapa();

		fila.enfileirar(mapa.getMoradaNova());
		fila.enfileirar(mapa.getBanabuiu());
		fila.enfileirar(mapa.getQuixeramobim());

		System.out.println(fila.getPrimeiro().getNome());
	}

}

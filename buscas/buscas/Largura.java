package buscas;

import estruturas.Fila;
import grafoCidades.Adjacente;
import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Largura {

	private Fila fronteira;
	private Cidade inicio;
	private Cidade objetivo;
	private boolean achou;

	public Largura(Cidade inicio, Cidade objetivo) {
		this.inicio = inicio;
		this.inicio.setVisitado(true);
		this.objetivo = objetivo;

		this.fronteira = new Fila(20);
		fronteira.enfileirar(inicio);
		achou = false;

	}

	public void buscar() {
		Cidade primeiro = fronteira.getPrimeiro();
		System.out.println("Primeiro: " + primeiro.getNome());

		if (primeiro == objetivo) {
			achou = true;
		} else {

			System.out.println("Desenfileirou: "
					+ fronteira.desenfileirar().getNome());
			for (Adjacente a : primeiro.getAdjacentes()) {
				System.out.println("Verificando se ja Visitado: "
						+ a.getCidade().getNome());
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.enfileirar(a.getCidade());
				}
			}
			if (fronteira.getNumerosElementos() > 0) {
				buscar();
			}
		}

	}

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Largura l = new Largura(mapa.getMoradaNova(), mapa.getQuixada());
		l.buscar();
	}

}

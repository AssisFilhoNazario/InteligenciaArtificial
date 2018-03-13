package buscas;

import estruturas.Pilha;
import grafoCidades.Adjacente;
import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Profundidade {

	// essa fronteira é onde estara aproxima cidade.
	private Pilha fronteira;
	private Cidade inicio;
	private Cidade objetivo;
	private boolean achou;

	public Profundidade(Cidade inicio, Cidade objetivo) {
		this.inicio = inicio;
		// Essa cidade inicial estou setando na classe
		// cidade para evitar a cidade que ja foi visitado
		// Se eu começo com o inicio entao o inicio ja visitei
		this.inicio.setVisitado(true);
		this.objetivo = objetivo;

		// a fronteira é uma pilha estou passando o tamanho dela de 20
		fronteira = new Pilha(20);
		// passando a primeira cidade para o todo da pilha
		fronteira.empilhar(inicio);
		achou = false;

	}

	public void buscar() {
		// pegando o topo da pilha
		Cidade topo = fronteira.getTopo();
		System.out.println("Topo: " + topo.getNome());
		// se o topo quue é a cidade que estou procurando for igual o objetivo
		if (topo == objetivo) {
			achou = true;
		} else {
			// Fazendo um for para percorer todas as cidades adjacente a ela
			for (Adjacente a : topo.getAdjacentes()) {
				if (!achou) {
					System.out.println("Verificando se ja visitado: "
							+ a.getCidade().getNome());
					// Se a cidade nao foi visitada ela vai empilhar
					if (!a.getCidade().isVisitado()) {
						a.getCidade().setVisitado(true);
						fronteira.empilhar(a.getCidade());
						// recurcao
						buscar();
					}
				}
			}
		}
		// System.out.println("Desempilhou: " +
		// fronteira.desempilhar().getNome());
	}

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Profundidade p = new Profundidade(mapa.getMoradaNova(),
				mapa.getQuixada());
		p.buscar();
	}

}

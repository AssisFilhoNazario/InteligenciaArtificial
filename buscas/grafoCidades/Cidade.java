package grafoCidades;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
	private String nome;
	private boolean visitado;
	// vertices que estao ligados diretamente, soa a lista
	// das cidades ligado a ela
	private List<Adjacente> adjacentes;

	public Cidade(String nome) {
		this.nome = nome;
		visitado = false;
		adjacentes = new ArrayList<Adjacente>();
	}

	// Adicionar cidades adijacente da classe adjacente
	public void addCidadeAdjacentes(Adjacente cidade) {
		adjacentes.add(cidade);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public List<Adjacente> getAdjacentes() {
		return adjacentes;
	}

}

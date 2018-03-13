package grafoCidades;

public class Mapa {
	// Definido cidades por cidades

	private Cidade moradaNova;
	private Cidade banabuiu;
	private Cidade ibicuitinga;
	private Cidade juatama;
	private Cidade quixeramobim;
	private Cidade quixada;

	//
	// //Instanciando cada uma das variaveis
	public Mapa() {

		moradaNova = new Cidade("Morada Nova");
		banabuiu = new Cidade("Banabuíu");
		ibicuitinga = new Cidade("Ibicuitinga");
		juatama = new Cidade("Juatama");
		quixeramobim = new Cidade("Quixeramobim");
		quixada = new Cidade("Quixada");

		/*
		 * Fazendo as aresta ou seja as cidades que estao ligadas diretamente
		 */

		moradaNova.addCidadeAdjacentes(new Adjacente(banabuiu));
		moradaNova.addCidadeAdjacentes(new Adjacente(ibicuitinga));

		ibicuitinga.addCidadeAdjacentes(new Adjacente(moradaNova));
		ibicuitinga.addCidadeAdjacentes(new Adjacente(quixada));

		banabuiu.addCidadeAdjacentes(new Adjacente(juatama));
		banabuiu.addCidadeAdjacentes(new Adjacente(quixeramobim));
		banabuiu.addCidadeAdjacentes(new Adjacente(moradaNova));

		juatama.addCidadeAdjacentes(new Adjacente(banabuiu));
		juatama.addCidadeAdjacentes(new Adjacente(quixada));
		juatama.addCidadeAdjacentes(new Adjacente(quixeramobim));

		quixada.addCidadeAdjacentes(new Adjacente(ibicuitinga));
		quixada.addCidadeAdjacentes(new Adjacente(juatama));

		quixeramobim.addCidadeAdjacentes(new Adjacente(banabuiu));
		quixeramobim.addCidadeAdjacentes(new Adjacente(juatama));

	}

	public Cidade getMoradaNova() {
		return moradaNova;
	}

	public void setMoradaNova(Cidade moradaNova) {
		this.moradaNova = moradaNova;
	}

	public Cidade getBanabuiu() {
		return banabuiu;
	}

	public void setBanabuiu(Cidade banabuiu) {
		this.banabuiu = banabuiu;
	}

	public Cidade getIbicuitinga() {
		return ibicuitinga;
	}

	public void setIbicuitinga(Cidade ibicuitinga) {
		this.ibicuitinga = ibicuitinga;
	}

	public Cidade getJuatama() {
		return juatama;
	}

	public void setJuatama(Cidade juatama) {
		this.juatama = juatama;
	}

	public Cidade getQuixeramobim() {
		return quixeramobim;
	}

	public void setQuixeramobim(Cidade quixeramobim) {
		this.quixeramobim = quixeramobim;
	}

	public Cidade getQuixada() {
		return quixada;
	}

	public void setQuixada(Cidade quixada) {
		this.quixada = quixada;
	}

}

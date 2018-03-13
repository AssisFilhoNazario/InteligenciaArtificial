package arvorebinaria;

public class No {

	private int valor;
	private No filho_Direito;
	private No filho_Esquerdo;

	public No(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getFilho_Direito() {
		return filho_Direito;
	}

	public void setFilho_Direito(No filho_Direito) {
		this.filho_Direito = filho_Direito;
	}

	public No getFilho_Esquerdo() {
		return filho_Esquerdo;
	}

	public void setFilho_Esquerdo(No filho_Esquerdo) {
		this.filho_Esquerdo = filho_Esquerdo;
	}

	public boolean isVazio() {
		return filho_Esquerdo == null && filho_Direito == null;
	}

}

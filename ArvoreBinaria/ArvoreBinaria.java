

public class ArvoreBinaria {

	private No raiz;

	public boolean isVazio() {
		if (this.raiz != null) {
			return false;
		}
		return true;
	}

	public int getAltura() {
		return getAltura(this.raiz);
	}

	private int getAltura(No no) {
		if (no == null) {
			return 0;
		}
		int filhos_esquerdo = getAltura(no.getFilho_Esquerdo());
		int filhos_direito = getAltura(no.getFilho_Direito());

		if (filhos_esquerdo > filhos_direito) {
			return filhos_esquerdo + 1;

		} else {
			return filhos_direito + 1;
		}
	}

	public int getQuantidade() {
		return getQuantidade(this.raiz);
	}

	private int getQuantidade(No no) {
		if (no == null) {
			return 0;
		}
		int filhos_esquerdo = getQuantidade(no.getFilho_Esquerdo());
		int filhos_direito = getQuantidade(no.getFilho_Direito());

		return filhos_esquerdo + filhos_direito + 1;
	}

	public void imprimirArvore() {
		if (isVazio()) {
			System.out.println("A arvor está vazia!");
		}
		imprimirArvore(this.raiz);
	}

	private void imprimirArvore(No no) {
		if (no.getFilho_Esquerdo() != null) {
			imprimirArvore(no.getFilho_Esquerdo());
		}
		if (no.getFilho_Direito() != null) {
			imprimirArvore(no.getFilho_Direito());
		}

		System.out.println("Valor do No: " + no.getValor());
	}

	public void iserirNo(int valor) {
		inserirNo(this.raiz, valor);
	}

	private void inserirNo(No no, int valor) {
		if (this.raiz == null) {
			this.raiz = new No(valor);
		} else {
			if (valor < no.getValor()) {
				if (no.getFilho_Esquerdo() != null) {
					inserirNo(no.getFilho_Esquerdo(), valor);
				} else {
					no.setFilho_Esquerdo(new No(valor));
				}

			} else {
				if (no.getFilho_Direito() != null) {
					inserirNo(no.getFilho_Direito(), valor);
				} else {
					no.setFilho_Direito(new No(valor));
				}
			}
		}
	}

	public No remover(int valor) {
		if (isVazio()) {
			System.out.println("A arvore está vazia");
			return null;
		}
		return remover(this.raiz, valor);
	}

	private No remover(No no, int valor) {
		if (valor < no.getValor()) {
			if (no.getFilho_Esquerdo() != null) {
				no.setFilho_Esquerdo(remover(no.getFilho_Esquerdo(), valor));
			} else {
				System.out.println("Valor não existe");
				return null;
			}

		} else if (valor >= no.getValor()) {
			if (no.getFilho_Direito() != null) {
				no.setFilho_Direito(remover(no.getFilho_Direito(), valor));
			} else {
				System.out.println("Valor não existe");
				return null;
			}
		} else if (valor == no.getValor()) {
			System.out.println("Remover No: " + no.getValor());
			no.setValor(encontrarMinimo(no.getFilho_Direito()).getValor());
			no.setFilho_Direito(removerMinimo(no.getFilho_Direito()));

		}
		return no;
	}

	private No encontrarMinimo(No no) {
		if (no != null) {
			while (no.getFilho_Esquerdo() != null) {
				no = no.getFilho_Esquerdo();
			}
		}
		return no;
	}

	private No removerMinimo(No filho) {
		if (filho == null) {

			System.out.println("ERRo na Remoção");
		} else if (filho.getFilho_Esquerdo() != null) {
			filho.setFilho_Esquerdo(removerMinimo(filho.getFilho_Esquerdo()));
			return filho;
		} else {
			return filho.getFilho_Direito();
		}

		return null;
	}

}

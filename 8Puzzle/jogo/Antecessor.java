package jogo;

/**
 * Interface para estados que tem a função antecessores
 */
public interface Antecessor {
	public java.util.List<Estado> antecessores();
}
package jogo;

/**
 * Interface para estados que tem a fun��o antecessores
 */
public interface Antecessor {
	public java.util.List<Estado> antecessores();
}
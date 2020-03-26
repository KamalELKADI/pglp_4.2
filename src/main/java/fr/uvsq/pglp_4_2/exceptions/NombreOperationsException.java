package fr.uvsq.pglp_4_2.exceptions;


public class NombreOperationsException extends IllegalArgumentException {

	/**
	 * Constructeur de l'exception
	 */
	public NombreOperationsException() {
		super("Il n'y a pas assez d'opérations, il reste au moins deux nombres dans la pile");
	}

}

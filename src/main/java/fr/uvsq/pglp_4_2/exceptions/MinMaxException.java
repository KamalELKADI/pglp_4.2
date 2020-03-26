package fr.uvsq.pglp_4_2.exceptions;


public class MinMaxException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public MinMaxException() {
		super("Valeur absolue trop grande pour être gérée");
	}
}

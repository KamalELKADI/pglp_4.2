package fr.uvsq.pglp_4_2.exceptions;


public class DivisionParZeroException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public DivisionParZeroException() {
		super("Division par zéro");
	}

}

package fr.uvsq.pglp_4_2.exceptions;

/**
 * Exception pour la division par zéro
 * @author Maxime
 * @date 18/10/2018
 */
public class DivisionParZeroException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public DivisionParZeroException() {
		super("Division par zéro");
	}

}

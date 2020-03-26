package fr.uvsq.pglp_4_2.exceptions;

/**
 * Exception pour la pile
 * @author Maxime
 * @date 18/10/2018
 */
public class ArgumentPileException extends IllegalArgumentException {

	/**
	 * Constructeur de l'exception
	 */
	public ArgumentPileException() {
		super("Pas assez d'éléments dans la pile pour cette opération");
	}

}

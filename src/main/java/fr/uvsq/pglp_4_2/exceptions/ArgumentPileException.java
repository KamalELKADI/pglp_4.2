package fr.uvsq.pglp_4_2.exceptions;


public class ArgumentPileException extends IllegalArgumentException {

	
	public ArgumentPileException() {
		super("Pas assez d'éléments dans la pile pour cette opération");
	}

}

package fr.uvsq.pglp_4_2.command;

import java.util.Stack;

import fr.uvsq.pglp_4_2.ExceptionHandler;



public class StoreNbCommand implements UndoableCommand {
	
	/** # RECEIVER: Stack<Double> **/
	
	private double nb;
	private Stack<Double> pile;
	
	public StoreNbCommand(Stack<Double> pile, double nb) {
		this.pile = pile;
		this.nb = nb;		
	}
	
	@Override
	public void apply() {
		ExceptionHandler.handleMinMax(nb);
		this.pile.push(nb);
	}
	
	@Override
	public void undo() {
		this.pile.pop();
	}

}

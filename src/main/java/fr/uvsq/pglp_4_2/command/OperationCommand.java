package fr.uvsq.pglp_4_2.command;

import java.util.Stack;

import fr.uvsq.pglp_4_2.ExceptionHandler;
import fr.uvsq.pglp_4_2.Operation;



public class OperationCommand implements UndoableCommand {

	
	
	private double dernier;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	public OperationCommand(Stack<Double> pile, Operation operation) {
		ExceptionHandler.handleStackSize(pile.size(), 2);
		this.pile = pile;
		this.operation = operation;
	}

	@Override
	public void apply() {
		double result;
		this.dernier = this.pile.pop();
		this.avantDernier = this.pile.pop();
		try {
			result = operation.eval(avantDernier, dernier);
			ExceptionHandler.handleMinMax(result);
			this.pile.push(result);
		}
		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(dernier);
			throw e;
		}
	}
	
	@Override
	public void undo() {
		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(dernier);
	}

}

package fr.uvsq.pglp_4_2.command;

import java.util.Stack;

public class UndoCommand implements Command {
	

	
	private UndoableCommand lastCommand;
	
	public UndoCommand(Stack<UndoableCommand> historique) {
		ExceptionHandler.handleStackSize(historique.size(), 1);
		this.lastCommand = historique.pop();
	}

	public void apply() {
		lastCommand.undo();		
	}

}

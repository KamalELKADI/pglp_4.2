package fr.uvsq.pglp_4_2.command;

public class UndoCommand implements Command {
	
	/**
	 * # RECEIVER: historique et commande
	 */
	
	private UndoableCommand lastCommand;
	
	public UndoCommand(Stack<UndoableCommand> historique) {
		ExceptionHandler.handleStackSize(historique.size(), 1);
		this.lastCommand = historique.pop();
	}

	@Override
	public void apply() {
		lastCommand.undo();		
	}

}

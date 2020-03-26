package fr.uvsq.pglp_4_2.command;


public interface UndoableCommand extends Command {

	public void undo();
	
}

package fr.uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import fr.uvsq.pglp_4_2.command.Command;
import fr.uvsq.pglp_4_2.command.QuitCommand;
import fr.uvsq.pglp_4_2.command.UndoCommand;
import fr.uvsq.pglp_4_2.command.UndoableCommand;



public class Interpreteur {
	
	private Stack<UndoableCommand> historique;
	private Switch interrupteur;
	private List<String> log;
	
	public Interpreteur() {
		this.historique = new Stack<UndoableCommand>();
		this.interrupteur = new Switch();
		this.log = new ArrayList<String>();
	}
	
	
	private void applyCommand(Command command) {
		command.apply();
	}	
	

	public void applyStoreCommand(UndoableCommand command) {
		try {
			command.apply();
			this.historique.add(command);	
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void undoCommand() {
		this.applyCommand(new UndoCommand(historique));
	}
	
	public void log(String str) {
		this.applyCommand(() -> log.add(str));
	}
	
	public String getLastLog() {
		return log.get(log.size() - 1);
	}
	
	public void shutdown() {
		this.applyCommand(new QuitCommand(interrupteur));
	}
	
	public boolean isOn() {
		return interrupteur.isOn();
	}
	
}

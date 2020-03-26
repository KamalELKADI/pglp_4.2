package fr.uvsq.pglp_4_2.command;

import fr.uvsq.pglp_4_2.Switch;

public class QuitCommand implements Command {
	
	
	
	private Switch interrupteur;
	
	public QuitCommand(Switch interrupteur) {
		this.interrupteur = interrupteur;
	}

	@Override
	public void apply() {
		interrupteur.turnOff();
	}
	

}

package fr.istic.aoc.metronome.command;

import fr.istic.aoc.metronome.controleur.Controleur;

public class CmdMarquerTempo implements Command{

	private Controleur control;
	
	@Override
	public void execute() {
		if(control!=null) control.marquerTempo();
		else throw new NullPointerException("le controle de la commande marquer tempo est null");
	}

	public void setControl(Controleur control) {
		this.control = control;
	}

}

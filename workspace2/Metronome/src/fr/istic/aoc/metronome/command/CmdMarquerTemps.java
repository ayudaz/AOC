package fr.istic.aoc.metronome.command;

import fr.istic.aoc.metronome.controleur.Controleur;

public class CmdMarquerTemps implements Command{

	private Controleur control;
		
	@Override
	public void execute() {
		if(control!=null) control.marquerTemps();
		else throw new NullPointerException("le controle de la commande marquer temps est null");
	}

	public void setControl(Controleur control) {
		this.control = control;
	}

}

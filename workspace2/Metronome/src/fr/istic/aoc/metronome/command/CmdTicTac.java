package fr.istic.aoc.metronome.command;

import fr.istic.aoc.metronome.model.MoteurMetronome;

public class CmdTicTac implements Command {

	private MoteurMetronome moteur;
	
	@Override
	public void execute() {
		if(moteur!=null) moteur.TicTac();
		else throw new NullPointerException("cmdTicTac : le moteur est null");		
	}

	public MoteurMetronome getMoteur() {
		return moteur;
	}

	public void setMoteur(MoteurMetronome moteur) {
		this.moteur = moteur;
	}

}

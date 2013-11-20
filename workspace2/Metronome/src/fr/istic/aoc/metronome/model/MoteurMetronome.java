package fr.istic.aoc.metronome.model;

public interface MoteurMetronome {

	public abstract int getTempo();

	public abstract void setTempo(int tempo);

	public abstract float getTempsParMesure();

	public abstract void setTempsParMesure(float tempsParMesure);

	public abstract boolean isEtatMarche();

	public abstract void setEtatMarche(boolean etatMarche);

	public abstract void TicTac();

}
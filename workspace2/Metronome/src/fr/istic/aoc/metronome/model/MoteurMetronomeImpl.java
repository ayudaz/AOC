package fr.istic.aoc.metronome.model;

public class MoteurMetronomeImpl implements MoteurMetronome {

	private int tempo;
	private float tempsParMesure;
	private boolean etatMarche;
	
	@Override
	public void TicTac() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public float getTempsParMesure() {
		return tempsParMesure;
	}
	
	@Override
	public void setTempsParMesure(float tempsParMesure) {
		this.tempsParMesure = tempsParMesure;
	}
	
	@Override
	public boolean isEtatMarche() {
		return etatMarche;
	}
	
	@Override
	public void setEtatMarche(boolean etatMarche) {
		this.etatMarche = etatMarche;
	}

	
	
}

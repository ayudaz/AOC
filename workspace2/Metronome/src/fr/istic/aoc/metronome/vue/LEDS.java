package fr.istic.aoc.metronome.vue;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LEDS extends JPanel {

	private Led ledTEmpo;
	private Led ledMesure;
	
	public LEDS(Color tempo, Color mesure) {
		ledTEmpo = new Led(tempo);
		ledMesure = new Led(mesure);
		add(ledTEmpo);
		add(ledMesure);
		setVisible(true);
	}

	public Led getLedTEmpo() {
		return ledTEmpo;
	}

	public void setLedTEmpo(Led ledTEmpo) {
		this.ledTEmpo = ledTEmpo;
	}

	public Led getLedMesure() {
		return ledMesure;
	}

	public void setLedMesure(Led ledMesure) {
		this.ledMesure = ledMesure;
	}

}

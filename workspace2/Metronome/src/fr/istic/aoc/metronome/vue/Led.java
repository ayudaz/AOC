package fr.istic.aoc.metronome.vue;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Led extends JPanel{
	
	private Color couleur;
	
	public Led(Color couleur) {
		this.couleur = couleur;
		setBackground(couleur);
		setVisible(true);
		setSize(30, 30);
	}	
}

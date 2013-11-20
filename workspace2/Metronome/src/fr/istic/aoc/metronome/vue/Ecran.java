package fr.istic.aoc.metronome.vue;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ecran extends JPanel{

	private JLabel affichage;
	
	public Ecran()
	{
		setBackground(Color.white);
		affichage = new JLabel("0");
		add(affichage);
		setVisible(true);
	}
}

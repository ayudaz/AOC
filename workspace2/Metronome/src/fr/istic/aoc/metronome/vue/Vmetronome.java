package fr.istic.aoc.metronome.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Vmetronome extends JFrame {

	private Button4IHM buttons;
	
	public Vmetronome() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.gray);

		init();
		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(getParent());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init()
	{
		Slider slider = new Slider();
		add(slider, BorderLayout.WEST);
		
		Ecran ecran = new Ecran();
		add(ecran, BorderLayout.CENTER);
		
		LEDS leds = new LEDS(Color.black, Color.black);
		add(leds, BorderLayout.EAST);
		
		buttons=new Button4IHM();
		add(buttons, BorderLayout.SOUTH);
		
		rafraichir();
	}

	public void rafraichir() {
		pack();
		repaint();
	}
	
	public static void main(String[] args)
	{
		Vmetronome metronome = new Vmetronome();
		
	}

}

package fr.istic.aoc.metronome.vue;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button4IHM extends JPanel{
	
	private JButton start;
	private JButton stop;
	private JButton dec;
	private JButton inc;
	
	public Button4IHM ()
	{
		start = new JButton("Start");
		stop = new JButton("Stop");
		inc = new JButton("inc");
		dec = new JButton("dec");
		add(start);
		add(stop);
		add(inc);
		add(dec);
		setVisible(true);
	}
	
	public JButton getStart() {
		return start;
	}
	public void setStart(JButton start) {
		this.start = start;
	}
	public JButton getStop() {
		return stop;
	}
	public void setStop(JButton stop) {
		this.stop = stop;
	}
	public JButton getDec() {
		return dec;
	}
	public void setDec(JButton dec) {
		this.dec = dec;
	}
	public JButton getInc() {
		return inc;
	}
	public void setInc(JButton inc) {
		this.inc = inc;
	}		
}

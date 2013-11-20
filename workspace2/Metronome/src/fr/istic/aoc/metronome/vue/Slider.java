package fr.istic.aoc.metronome.vue;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Slider extends JPanel {
		
	private JSlider slider;
	
	public Slider()
	{
		slider = new JSlider(JSlider.VERTICAL,0,100,0);
		slider.setPaintTrack(true);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(1);
		add(slider);
		setVisible(true);
	}
}
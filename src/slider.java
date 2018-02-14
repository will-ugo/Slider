import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class slider extends JFrame {
	private JSlider slider;
	private circle myCircle;
	
	public slider() {
		super("JSlider Demo");
		
		myCircle = new circle();
		myCircle.setBackground(Color.ORANGE);
		add(myCircle, BorderLayout.CENTER);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent event) {
						myCircle.setDiameter(slider.getValue());
					}
				}
				);
		add(slider, BorderLayout.SOUTH);
	}
}

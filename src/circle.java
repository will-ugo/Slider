import java.awt.*;
import javax.swing.*;

public class circle extends JPanel {
	private int diameter = 10;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}
	
	public void setDiameter(int newDiameter) {
		diameter = ((newDiameter >= 0) ? newDiameter : 10);
		repaint();
	}
}

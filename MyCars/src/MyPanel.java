import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyPanel extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Car car1 = new Car(0,0);
		g2.setColor(Color.BLACK);
		g2.draw(car1.frame); 
		g2.draw(car1.rearWheel);
		g2.draw(car1.frontWheel);
	}
}

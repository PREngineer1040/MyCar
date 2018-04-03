import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car 
{
	private int radius=10; 
	private int margin =10;
	private int frameWidth = 75; 
	private int frameHeight = 20; 
	private int windowHeight =20; 
	Rectangle frame = new Rectangle(); 
	Line2D.Double frontWindow= new Line2D.Double();
	Line2D.Double rearWindow = new Line2D.Double();
	Line2D.Double top = new Line2D.Double();
	Ellipse2D.Double frontWheel = new Ellipse2D.Double(); 
	Ellipse2D.Double rearWheel = new Ellipse2D.Double(); 
	public Car(int x, int y)
	{
		frame.setBounds(x+margin+radius, y+margin+windowHeight, frameWidth, frameHeight);
		rearWheel.setFrame(x+margin, y+margin+frameHeight+windowHeight, radius*2,radius*2);
		frontWheel.setFrame(x+margin+ frameWidth, y+margin+frameHeight+windowHeight, radius*2,radius*2);
	}
}

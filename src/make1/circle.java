package make1;
import java.awt.*;
import javax.swing.JFrame;


public class circle extends Canvas {
	
	public void paint( Graphics g  ) {
	
	Color green = new Color(42, 117, 35);
	g.setColor(Color.yellow);
	g.drawOval(20, 40, 50, 50);
	g.fillOval(20, 40, 50, 50);
	g.setColor(Color.black);
	g.drawOval(35, 60, 5, 5);
	g.fillOval(35, 60, 5, 5);
	g.setColor(Color.black);
	g.drawOval(50, 60, 5, 5);
	g.fillOval(50, 60, 5, 5);
	g.setColor(Color.red);
	g.drawArc(35, 70, 20, 15, 180, 200);
	
	}
	public static void main( String[] args )
	{
		JFrame win = new JFrame("Circle");
		win.setSize(600,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		circle canvas = new circle();
		win.add( canvas );
		win.setVisible(true);

}
}
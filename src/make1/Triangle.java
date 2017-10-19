package make1;
import java.awt.*;
import javax.swing.JFrame;


public class Triangle extends Canvas {
	
	
	public void paint( Graphics g )
	{
		Polygon triangular = new Polygon();
		
		
		g.setColor(Color.blue);
		triangular.addPoint(200, 300);
		triangular.addPoint(100,500);
		triangular.addPoint(400, 300);
		
		
		g.setColor(Color.lightGray);
		g.fillPolygon( triangular);		
		
	}

public static void main (String[] args){
	 
	JFrame win = new JFrame ("Triangle");
	win.setSize(600,600);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win.add( new Triangle () );
	win.setVisible(true);
	
}
}

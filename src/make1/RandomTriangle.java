package make1;
import java.util.Random;
import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;


public class RandomTriangle extends Canvas {
	
	public void paint ( Graphics g ) {
		
		
		super.paint (g);
	Random r = new Random();
	
	
	
		int i;
		
		for ( i=0; i < 500; i++){
			
		Polygon triangle = new Polygon();	
		

			int x1 = (int)(Math.random()*500);
			int x2 = (int)(Math.random()*500);
			int x3 = (int)(Math.random()*500);
			int y1 = (int)(Math.random()*500);
			int y2 = (int)(Math.random()*500);
			int y3 = (int)(Math.random()*500);
			
			
			triangle.addPoint(x1, y1);
			triangle.addPoint(x2, y2);
			triangle.addPoint(x3, y3);
			
			
			g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
			g.fillPolygon( triangle);
			
	}  
		
	}

public static void main (String[] args){
	 
	JFrame win = new JFrame ("Triangle");
	win.setSize(600,600);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win.add( new RandomTriangle () );
	win.setVisible(true);
}
}

package make1;

import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	private static final long serialVersionUID = 1L;

	public void paint( Graphics g )
    {
		super.paint(g);
		int x = 0,y=0;
		
		
        drawSmilingFace(g,x,y);
 
         int x1 = (int)(Math.random()*500);
		int y1 = (int)(Math.random()*500);
		
		g.setColor(Color.YELLOW);;
        g.drawOval(x1, y1, 50, 50);
        g.fillOval(x1, y1, 50, 50);
        g.setColor(Color.black);
    	g.drawOval(x1+15, y1+20, 5, 5);
    	g.fillOval(x1+15, y1+20, 5, 5);
    	g.setColor(Color.black);
    	g.drawOval(x1+30, y1+20, 5, 5);
    	g.fillOval(x1+30, y1+20, 5, 5);
    	g.setColor(Color.black);
    	g.drawArc(x1+15, y1+30, 20, 15, 180, 200);
        
        drawSmilingFace(g,400,350);
        // etc
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
    	
    	// Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        // draw circle for the head

        // draw eyes

        // draw mouth
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFaceFunction() );
        win.setVisible(true);
    }

}

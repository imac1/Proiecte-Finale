package make1;

import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.font.*;

public class Poster extends Canvas {
	
	Image face;
	
	public   Poster () throws Exception
	{
		face = ImageIO.read( new File("mitch.png") );
	}
	
	
	
	 public void paint( Graphics g )
	    {
	        g.setColor(Color.black);
	        g.setFont(new Font ( "Times New Roman",  Font.HANGING_BASELINE, 56 ));
	        
	        g.drawString("Mr.Mitchell", 200, 200);
	        g.drawImage(face, 100, 100, this);
	       


	    }


public static void main( String[] args )
{
    JFrame win = new JFrame("Poster");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    win.add( new Image());
    win.setVisible(true);
}
}
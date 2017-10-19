package make1;

import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas  {
	
	

	
	public void paint( Graphics g )
	{
	g.setColor(Color.RED);
g.drawString("Mr.Mitchell", 10, 10);
	}

	
	public void ImageDemo() throws Exception
	{
		
	
		
	}

public static void main(String[] args) throws Exception
{
	JFrame win = new JFrame("Motivational Poster");
	win.setSize(600,600);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win.add( new ImageDemo() );
	win.setVisible(true);
	
}
}


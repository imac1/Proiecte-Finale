package make1;

import java.util.Random;

import java.util.Scanner;


		
		import java.awt.*;
		import javax.swing.JFrame;

		public class work extends Canvas
		{
			public void paint( Graphics g )
			{
				g.setColor(Color.RED);
				
				g.drawRect(400,400,400,400);  // draw a rectangle
				g.fillOval(50,50,100,200); // draw a filled-in oval
				g.setColor(Color.blue);
				g.fillRect(200,400,200,20); // a filled-in rectangle
				g.drawOval(200,430,200,100);
				
				g.setColor(Color.green);
				g.drawString("Graphics are pretty neat.", 500, 100);
				int x = getWidth() / 2;
				int y = getHeight() / 2;
				g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
			}

			public static void main( String[] args )
			{
				// You can change the title or size here if you want.
				JFrame win = new JFrame("GraphicsDemo1");
				win.setSize(800,600);
				win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GraphicsDemo1 canvas = new GraphicsDemo1();
				win.add( canvas );
				win.setVisible(true);
			}
		
		
	}


package make1;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	private static final long serialVersionUID = -1590907703090286195L;
	public  void paint( Graphics window )
	{				//                  color       x    y   w   h
			float b = 0;
			float r = 0;
			float g=0;
			int x =0;
			int y = 0;
			int w =0;
			int h = 0;
			super.paint( window); 	
			
			drawBox( window, Color.getHSBColor( b,r,g),  x,  y,  w,  h );	
			
			for (int i = 0; i<6; i++){
				
				Random rand = new Random();
				int x1 = (int)(Math.random()*500);
				int x2 = (int)(Math.random()*500);
				int y2 = (int)(Math.random()*500);
				int y1 = (int)(Math.random()*500);
				int height = (int)Math.random()*500;
				int w1 = (int)Math.random()*300;
				
				float h1 = rand.nextFloat()*256;
				float s1 = rand.nextFloat()*256;
				float b1 = rand.nextFloat()*256;
				float h2 = rand.nextFloat()*256;
				float s2 = rand.nextFloat()*256;
				float b2 = rand.nextFloat()*256;	
				drawBox( window, Color.getHSBColor(h1, s1, b1), x1, y1, 90, 70 );
				drawBox( window, Color.getHSBColor(h2, s2, b2),  x2, y2, 30, 150 );
			}	
		}
		// draw six more boxes -- different colors, different places, different sizes
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int height )
	{
		// add code to draw a WxH box in color c at (x,y)
		
		window.setColor(c);
		window.fillRect(x,y,w,height);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,height-20);	
	}
	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
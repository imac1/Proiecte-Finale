package make1;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

class Boxy2 extends Canvas
{
	private static final long serialVersionUID = 1L;
	public void paint( Graphics window )
	{
		//                  color    x    y
		Random r = new Random();
		super.paint( window); 
		int x = 0;
		int y = 0;
		float hue = 0;
		float saturation = 0;
		float brightness = 0;
		
		drawBox( window, Color.HSBtoRGB(hue, saturation, brightness), x, y );
		
	for (int i = 0; i<11; i++){
		
		int x1 = (int)(Math.random()*500);
		int y2 = (int)(Math.random()*500);
		
		
		float hue1 = r.nextFloat()*256;
		float saturation1 = r.nextFloat()*256;
		float brightness1 = r.nextFloat()*256;
		
		window.setColor(Color.getHSBColor(hue1, saturation1, brightness1));
		window.fillRect(x1,y2,100,100);
	
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.white);
		window.fillRect(x1+10,y2+10,80,80);	
	}

		// draw ten more boxes -- different colors, different places
	}
	private void drawBox(Graphics window, int hsBtoRGB, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	public void drawBox( Graphics window, Color i, int x, int y  )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(i);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}
	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}

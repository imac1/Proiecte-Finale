package make1;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class Triangles2JPanel extends JPanel {
    /*Randomly generates a certain number of triangles
	 *and chooses a random color for each. Upon resizing of window,
	 *new triangles are generated*/
    
	public void paintComponent(Graphics g){
        
		super.paintComponent(g);
        int numOfTri=500;  //The number of triangles
        
        Random random=new Random();
        
        Graphics2D g2d=(Graphics2D) g;
        
        //Loop will execute once for each triangle to be created
        for(int i=0;i<numOfTri;++i){
            GeneralPath triangle=new GeneralPath();
			
			//Generating 3 random x coordinates
            int t1x[]={random.nextInt(this.getWidth()-2),
                           random.nextInt(this.getWidth()-2),
                           random.nextInt(this.getWidth())-2};
			
			//Generating 3 random Y coordinates
            int t1y []={random.nextInt(this.getHeight()-2),
                            random.nextInt(this.getHeight()-2),
                            random.nextInt(this.getHeight())-2};
        
			//moving to starting location
            triangle.moveTo(t1x[0], t1y[0]);
			
			//Drawing a line to each point
            for(int j=1;j<t1x.length;++j){
                triangle.lineTo(t1x[j], t1y[j]);
			}
            triangle.closePath();
			
			//Picking a random color for the triangle
            g2d.setColor(new Color(random.nextInt(256),random.nextInt(256),
                        random.nextInt(256)));
            g2d.fill(triangle);
        }
    }
    
}

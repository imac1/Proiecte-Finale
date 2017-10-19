package make1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangles {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Triangles"); 
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Triangles2JPanel triangles2jpanel=new Triangles2JPanel();
        frame.add(triangles2jpanel);
        frame.setVisible(true);
    }
    
}

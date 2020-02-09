
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spencer
 */
public class Main {
    
    private GraphicsPanel gp;
    private JFrame f;
    private JPanel landing;
    private Container c;
    private boolean rungame;
    private ImageIcon img;
    
    public Main(){
        initializeValues();
        setUpWindow();
        //runApp();
    }
    
    /**
     * @param null
     * Method to establish starting values for the application
     */
    public void initializeValues(){
        gp = new GraphicsPanel();
        img = new ImageIcon("stockclipart.png");
    }
    /**
     * @param null
     * Establishes and creates the frame for the application
     */
    public void setUpWindow(){
        f = new JFrame("DOW JONES");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setIconImage(img.getImage());
        
        c = f.getContentPane();
        
        landing = new JPanel();
        landing.setLayout(new BorderLayout());
        landing.setPreferredSize(new Dimension(750,1000));
        
        landing.add(gp,BorderLayout.CENTER);
        
        f.setLayout(new BorderLayout());
        f.add(landing, BorderLayout.CENTER);
        
        f.pack();
        c.add(landing);
        f.show();
    }
    
    /*public void runApp(){
       Thread runner = new Thread();
       while(rungame == false){
        try 
        { 
          runner.sleep(5); 
        }
        catch(InterruptedException e){}
        
        landing.repaint();
       }
    }
    */
}

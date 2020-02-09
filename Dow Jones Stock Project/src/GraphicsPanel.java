
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Spencer Ekstrom, Alexander Feltman, Wyatt Thelen, Jake Laurent
 * @version February 6, 2019
 * This is the class that controls drawing the application
 */
public class GraphicsPanel extends JPanel{
    
    private JLabel dowIndexTool;
    private boolean inTheGreen = true;
    private double dowValue = 29432;
    private DecimalFormat money = new DecimalFormat("#.00");
    private double valUpOrDown = 50.055;
    
    public GraphicsPanel(){
        System.out.println("Created Page!");
        initializeValues();
    }
    
    public void initializeValues(){
        dowIndexTool = new JLabel("DOW INDEX TOOL");
        dowIndexTool.setLocation(10, 10);
    }
    
    public void inTheGreen(boolean inTheGreen){
        this.inTheGreen = inTheGreen;
    }
    
    public void getDowValue(int dowValue){
        this.dowValue = dowValue;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        setBackground(Color.white);
        
        //Draws Landing Page Header
        g.setFont(new Font("ARIEL", Font.BOLD, 35));
        g.drawString("DOW INDEX TOOL", 20, 50);
        
        //
        g.drawLine(500, 130, 500, 870);
        g.drawLine(500, 130, 750, 130);
        g.drawLine(500, 870, 750, 870);
        
        //Draws Information about the DOW
        
        //Draws Dow Jones
        g.setFont(new Font("ARIEL", Font.BOLD, 25));
        g.drawString("DOW JONES", 20, 150);
        
        if(inTheGreen){
            //Draws Dow Price
            g.setColor(Color.green);
            g.drawString(String.valueOf(money.format(dowValue)), 200, 150);
            g.drawString("+ " + money.format(valUpOrDown), 20, 180);
        } else{
            //Draws Dow Price
            g.setColor(Color.red);
            g.drawString(String.valueOf(money.format(dowValue)), 200, 150);
            g.drawString("- " + money.format(valUpOrDown), 20, 180);
        }
    }
}
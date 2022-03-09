package project2;

import javax.swing.JFrame;

public class GuiFrame extends JFrame {
    // Static variables for the frame to use
    static final int WIDTH = 1200, HEIGHT = 520;
    static final String FRAMETITLE = "Ice Cream Order Form";
    
    // Default constructor
    public GuiFrame () {
        super(FRAMETITLE);
        setFrame(WIDTH, HEIGHT);
    }
    
    // Additional constructor, allows custom size for the frame
    public GuiFrame(int width, int height) {
        super(FRAMETITLE);
        setFrame(width, height);
        
    }
    
 
    
    // display method shows the frame on the screen
    public void display() {
        setVisible(true);
    }
    
    // setFrame method allows easier editing of the size of the frame,
    // as well as sets the frame to the center of the screen
    public void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}

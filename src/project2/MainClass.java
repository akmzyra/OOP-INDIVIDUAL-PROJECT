package project2;

import project2.GuiFrame;
import project2.GuiPanel;
import project2.MainClass;

public class MainClass extends GuiFrame {
    
    // Extends from the GuiFrame.java to make the gui frame
    MainClass() {
        super(1200, 520);
        add(new GuiPanel());
    }
    
    // main class, creates the gui frame and displays it
    static public void main(String[] args) {
        MainClass icecreamApp = new MainClass();
        icecreamApp.display();
    }
}

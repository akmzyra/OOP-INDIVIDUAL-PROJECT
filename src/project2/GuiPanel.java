package project2;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class GuiPanel extends JPanel {
	
	
	// Creates DecimalFormat for currency
    private DecimalFormat format = new DecimalFormat("#.00");
    
    // Creates all the labels for the gui
    private JLabel welcomeLbl = new JLabel("Welcome to Baobei Ice Cream Parlour", 
            JLabel.CENTER);
    private JLabel orderLbl = new JLabel("Please order your ice cream below, and "
            + "hit 'SUBMIT' when you are finished.", JLabel.CENTER);
    private JLabel chocoLbl = new JLabel("Chocolate");
    private JLabel vanillaLbl = new JLabel("Vanilla");
    private JLabel chocochipLbl = new JLabel("Chocolate Chip");
    private JLabel cookiescreamLbl = new JLabel("Cookies and Cream");
    private JLabel strawberryLbl = new JLabel("Strawberry");
    private JLabel cookiedoughLbl = new JLabel("Cookie Dough");
    private JLabel mintchocoLbl = new JLabel("Mint Chocolate Chip");
    private JLabel mochaLbl = new JLabel("Mocha");
  
    
    // Creates all the titled borders for the gui
    private TitledBorder flavoursBorder = new TitledBorder("Ice cream flavour");
    private TitledBorder icecreamTopBorder = new TitledBorder("Ice Cream Toppings RM0.50");
    
    // Creates all the radio buttons for the gui
    private JRadioButton chocoRadioBtn = new JRadioButton("RM2", true);
    private JRadioButton vanillaRadioBtn = new JRadioButton("RM2");
    private JRadioButton chocochipRadioBtn = new JRadioButton("RM3.50");
    private JRadioButton cookiescreamRadioBtn = new JRadioButton("RM3.50");
    private JRadioButton strawberryRadioBtn = new JRadioButton("RM2");
    private JRadioButton cookiedoughRadioBtn = new JRadioButton("RM4");
    private JRadioButton mintchocoRadioBtn = new JRadioButton("RM3");
    private JRadioButton mochaRadioBtn = new JRadioButton("RM3");
    
 // Creates all the check boxes for the gui
    private JCheckBox hotfudgeChkBox = new JCheckBox("Hot fudge");
    private JCheckBox sprinklesChkBox = new JCheckBox("Sprinkles");
    private JCheckBox caramChkBox = new JCheckBox("Caramel");
    private JCheckBox oreosChkBox = new JCheckBox("Oreos");
    private JCheckBox whippedcChkBox = new JCheckBox("Whipped cream");
    private JCheckBox cherriesChkBox = new JCheckBox("Cherries");
    private JCheckBox gummybearsChkBox = new JCheckBox("Gummy Bears");
   
 // Creates the button for the gui
    private JButton submitBtn = new JButton("Submit");
    private JButton loadBtn = new JButton("Load");
    private JButton exitBtn = new JButton("Exit");
    
    // Creates the option pane for the gui
    private JOptionPane msgPane = new JOptionPane();
   private JFrame frame;

	protected FileWriter fw;
    
    public GuiPanel() {
        
        // Creates all the panels to be used in the frame
        JPanel mainPanel = new JPanel();
        JPanel introPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        JPanel toppingPanel = new JPanel();
        JPanel submitPanel = new JPanel();
        JPanel loadPanel = new JPanel();
        JPanel exitPanel = new JPanel();
        
        
    
        
     // Set up for each panel and adding all the items into them
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        introPanel.setLayout(new GridLayout(2, 1));
        introPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 30));
        introPanel.add(welcomeLbl);
        introPanel.add(orderLbl);
        
        sizePanel.setLayout(new GridLayout(2, 3, 5, 5));
        sizePanel.setBorder(flavoursBorder);
        sizePanel.add(chocoLbl);
        sizePanel.add(chocoRadioBtn);
        sizePanel.add(vanillaLbl);
        sizePanel.add(vanillaRadioBtn);
        sizePanel.add(chocochipLbl);
        sizePanel.add(chocochipRadioBtn);
        sizePanel.add(cookiescreamLbl);
        sizePanel.add(cookiescreamRadioBtn);
        sizePanel.add(strawberryLbl);
        sizePanel.add(strawberryRadioBtn);
        sizePanel.add(cookiedoughLbl);
        sizePanel.add(cookiedoughRadioBtn);
        sizePanel.add(mintchocoLbl);
        sizePanel.add(mintchocoRadioBtn);
        sizePanel.add(mochaLbl);
        sizePanel.add(mochaRadioBtn);
        
        toppingPanel.setLayout(new GridLayout(5, 3, 5, 5));
        toppingPanel.setBorder(icecreamTopBorder);
        toppingPanel.add(hotfudgeChkBox);
        toppingPanel.add(sprinklesChkBox);
        toppingPanel.add(caramChkBox);
        toppingPanel.add(oreosChkBox);
        toppingPanel.add(whippedcChkBox);
        toppingPanel.add(cherriesChkBox);
        toppingPanel.add(gummybearsChkBox);
        
        submitPanel.setLayout(new FlowLayout());
        submitPanel.add(submitBtn);
        
        loadPanel.setLayout(new FlowLayout());
        loadPanel.add(loadBtn);
        
        exitPanel.setLayout(new FlowLayout());
        exitPanel.add(exitBtn);
        
        
        
        // Adds the panels to the frame
        mainPanel.add(introPanel);
        mainPanel.add(sizePanel);
        mainPanel.add(toppingPanel);
        mainPanel.add(submitPanel);
        mainPanel.add(loadPanel);
        mainPanel.add(exitPanel);
        add(mainPanel);
        
        // Groups the radio buttons
        ButtonGroup sizeButtonGroup = new ButtonGroup();
        sizeButtonGroup.add(chocoRadioBtn);
        sizeButtonGroup.add(vanillaRadioBtn);
        sizeButtonGroup.add(chocochipRadioBtn);
        sizeButtonGroup.add(cookiescreamRadioBtn);
        sizeButtonGroup.add(strawberryRadioBtn);
        sizeButtonGroup.add(cookiedoughRadioBtn);
        sizeButtonGroup.add(mintchocoRadioBtn);
        sizeButtonGroup.add(mochaRadioBtn);
      
        
        submitBtn.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                double totalPrice = geticecreamPrice();
                String icecreamType = geticecreamType();
                String icecreamToppings = geticecreamToppings();
              

                msgPane.showMessageDialog(null, "Your order of a " + icecreamType 
                        + " Ice Cream with\n" + "Topping(s):\n" + icecreamToppings + "was confirmed.\n" 
                        + "Your total comes out to RM" 
                        + format.format(totalPrice) + ". \nThank you for buying "
                        + "from Baobei Ice Cream Parlour. \nPlease order again!");
             
                
               
                try {
                	
                	fw = new FileWriter("Data.txt");
                	fw.write("\n");
                	fw.write(flavoursBorder.getTitle() + ": " + icecreamType.toString() + "\n");
                	fw.write(icecreamTopBorder.getTitle() + ": \n" + icecreamToppings.substring(0));
                	fw.write("\nTotal: \t RM " + geticecreamPrice());
                	fw.write("\n");
                	fw.close();
                	
                	
             
                	
                }
                
                catch(Exception e1){
                	
                	JOptionPane.showMessageDialog(null, e1+"");
                	
                }
                	
                	
                }
            
            
                
              
        });
        
        
        
        loadBtn.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                double totalPrice = geticecreamPrice();
                String icecreamType = geticecreamType();
                String icecreamToppings = geticecreamToppings();
        
             
                
               
                try {
					
					File f = new File("Data.txt");
					Scanner m = new Scanner(f);
					
					while(m.hasNextLine()) {
						String data = m.nextLine();
						System.out.println(data);
					}
					
					 msgPane.showMessageDialog(null, flavoursBorder.getTitle() + ": " + icecreamType.toString() + "\n"
		                        + icecreamTopBorder.getTitle() + ": \n" + icecreamToppings.substring(0) 
		                        + "\nTotal: \t RM " + geticecreamPrice() 
		                        + "\n");
					 

					
					m.close();
				}
				
				catch (FileNotFoundException e1) {
				      System.out.println("An error occurred.");
				      e1.printStackTrace();
				
				
				
			}
			
			}
			
			
			});
        
        
        exitBtn.addActionListener(new ActionListener() {
 	
        	public void actionPerformed(ActionEvent e) {
    	 
        		int confirm = JOptionPane.showOptionDialog(frame,
                 "Are you sure you want to close this application?",
                 "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
         
         
        		if (confirm == JOptionPane.YES_OPTION) {
             System.exit(1);
        		}
			
        	}
		
	
	 });
        
        
    }
    
    public String geticecreamToppings() {
        String icecreamTopping = "";
        
        if (hotfudgeChkBox.isSelected())
        	icecreamTopping += "- hot fudge\n";
        if (sprinklesChkBox.isSelected())
        	icecreamTopping += "- sprinkles\n";
        if (caramChkBox.isSelected())
        	icecreamTopping += "- caramel\n";
        if (oreosChkBox.isSelected())
        	icecreamTopping += "- oreos\n";
        if (whippedcChkBox.isSelected())
        	icecreamTopping += "- whipped cream\n";
        if (cherriesChkBox.isSelected())
        	icecreamTopping += "- cherries\n";
        if (gummybearsChkBox.isSelected())
        	icecreamTopping += "- gummy bears\n";
        
        
        return icecreamTopping;
    }
    
    public double geticecreamPrice() {
        double icecreamPrice = 0.00;
        
        if (chocoRadioBtn.isSelected())
            icecreamPrice += 2;
        if (vanillaRadioBtn.isSelected())
            icecreamPrice += 2;
        if (chocochipRadioBtn.isSelected())
            icecreamPrice += 3.50;
        if (cookiescreamRadioBtn.isSelected())
            icecreamPrice += 3.50;
        if (strawberryRadioBtn.isSelected())
            icecreamPrice += 2;
        if (cookiedoughRadioBtn.isSelected())
            icecreamPrice += 4;
        if (mintchocoRadioBtn.isSelected())
            icecreamPrice += 3;
        if (mochaRadioBtn.isSelected())
            icecreamPrice += 3;
        if (hotfudgeChkBox.isSelected())
            icecreamPrice += 0.50;
        if (sprinklesChkBox.isSelected())
            icecreamPrice += 0.50;
        if (caramChkBox.isSelected())
            icecreamPrice += 0.50;
        if (oreosChkBox.isSelected())
            icecreamPrice += 0.50;
        if (whippedcChkBox.isSelected())
            icecreamPrice += 0.50;
        if (cherriesChkBox.isSelected())
            icecreamPrice += 0.50;
        if (gummybearsChkBox.isSelected())
            icecreamPrice += 0.50;
        
        
        return icecreamPrice;
    }
    
    public String geticecreamType() {
        String icecreamType;
        
        if (chocoRadioBtn.isSelected())
            icecreamType = "Chocolate";
        else if (vanillaRadioBtn.isSelected())
            icecreamType = "Vanilla";
        else if (chocochipRadioBtn.isSelected())
            icecreamType = "Chocolate Chip";
        else if (cookiescreamRadioBtn.isSelected())
            icecreamType = "Cookies Cream";
        else if (strawberryRadioBtn.isSelected())
            icecreamType = "Strawberry";
        else if (cookiedoughRadioBtn.isSelected())
            icecreamType = "Cookie Dough";
        else if (mintchocoRadioBtn.isSelected())
            icecreamType = "Mint Chocolate";
        else
            icecreamType = "Mocha";
        
        return icecreamType;
    }
}



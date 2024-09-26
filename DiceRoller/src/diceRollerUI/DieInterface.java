package UI;
import PD.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This is a class that defines how the diceRoller UI will look like
 * @author Ange Gabriel NTIGURIRWA
 *
 */

public class DieInterface extends JFrame implements ActionListener{
	JButton rollButton = new JButton("Roll");
	JButton clear = new JButton("Clear");
	JTextArea numberOfDice = new JTextArea();
	JTextArea numberOfFaces = new JTextArea();
	JTextArea totalRolled = new JTextArea();
	JTextArea errorMessage = new JTextArea();
	JLabel label1 = new JLabel("Dice:");
	JLabel label2 = new JLabel("Faces:");
	JLabel label3 = new JLabel("Total:");
	Font myFont = new Font("Arial",Font.PLAIN,15);
	private Container con = getContentPane();
	static int x = 10;
	  static int y = 10;
	  static int z = 100;
	  
	/**
	 * This method initializes a JLabel with the correct location, size and font  
	 * then adds it to the main frame
	 * @param labeln
	 */
	private void init(JLabel labeln) {
		labeln.setFont(myFont);
        labeln.setSize(100,20);
        labeln.setLocation(50,x);
        labeln.setForeground(Color.BLACK);
        con.add(labeln);
        
        x = x + 25;
		}
	
	/**
	 * This method initializes a JTextArea with the correct location, size and font
	 * then adds it to the main frame
	 * @param text1
	 */
	private void init(JTextArea text1) {
		text1.setLocation(100,y);
        text1.setSize(250,15);
        text1.setBackground(Color.WHITE);//(66,66,66));
        text1.setForeground(Color.black);
        text1.setLineWrap(true);
        con.add(text1);
        
        y = y + 25;
	}
	
	/**
	 * This method initializes a JTextArea but with a custom option to make it editable to the user or not
	 * @param text1
	 * @param b
	 */
	private void init(JTextArea text1, Boolean b) {
		init(text1);
		text1.setEditable(b);
		
		
	}
	
	/**
	 * This method initializes a JButton with the correct location size and font
	 * then adds it to the main frame
	 * @param butClear
	 */
	private void init(JButton butClear ) {
		butClear.setFont(myFont);
        butClear.setSize(100,20);
        butClear.setLocation(z,85);
        butClear.addActionListener(this);
        butClear.setBackground(new Color(66,66,66));
        butClear.setForeground(Color.WHITE);
        con.add(butClear);
        z = z + 120;    
	}
	

	/**
	 * Constructor to instantiate the class 
	 */
	public DieInterface(){
		super("DiceRoller");
		setLayout(null);
		setResizable(false);
		setBounds(510,340,450,200);
		
		init(label1);
		init(label2);
		init(label3);
		init(numberOfDice);
		init(numberOfFaces);
		init(totalRolled,false);
		
		init(rollButton);
		init(clear);
		
		errorMessage.setLocation(100,130);
        errorMessage.setSize(250,15);
        errorMessage.setBackground(con.getBackground());
        errorMessage.setForeground(Color.red);
        errorMessage.setEditable(false);
        errorMessage.setLineWrap(true);
        con.add(errorMessage);
		
		
		
		
		
		setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	/**
	 * actionPerformed method implemented from actionListener interface
	 * this method is responsible for interaction between the user, the Dicebag and the diceBag user interface
	 * @throws NullPointerException 
	 * 
	 */
	public void actionPerformed(ActionEvent e) throws NullPointerException {
		if(e.getSource() == rollButton) {
			try {
				 DiceBag diceBag = new DiceBag(Integer.parseInt(numberOfDice.getText()),Integer.parseInt(numberOfFaces.getText()));
				 try {
					diceBag.roll();
				} catch (EmptyBagException e1) {
					// TODO Auto-generated catch block
					errorMessage.setText("Empty DiceBag error");
				}
				 totalRolled.setText(diceBag.toString());
			} catch (NumberFormatException e1) {
				errorMessage.setText("Input format Error");
			} catch (NumberOfDiceOutOfRangeException e1) {
				errorMessage.setText("Dice Input Error");
			} catch (NumberOfFacesOutOfRangeException e1) {
				errorMessage.setText("Face Input Error");
			}catch (NullPointerException e1) {
				errorMessage.setText("Empty DiceBag Error");
				
			}
			
		}
		if(e.getSource() == clear) {
			String cl = "";
			numberOfDice.setText(cl);
			numberOfFaces.setText(cl);
			totalRolled.setText(cl);
			errorMessage.setText(cl);
			
		}
	}

	

}

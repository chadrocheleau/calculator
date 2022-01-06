package roch0251.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author paisl
 *
 */
public class Calculator extends JFrame implements ActionListener {
	
	private int calcWidth = 415;
	private int calcHeight = 635;
	
	// will be used to collect opperands and the opperation to be performed.
	private String operand1 = "0";
	private String operand2 = "0";
	private String opperation = "";
	
	// declaring all panels to be used in Calculator Frame
	private JPanel display = new JPanel();
	private JPanel keypad = new JPanel();
	private JPanel equals = new JPanel();
	private JPanel operators = new JPanel();
	
	// declaring all labels to be used
	private Window window = new Window();
	
	// declaring all buttons to be used on calculator face
	private KeyButton one = new KeyButton( "1", Color.GRAY);
	private KeyButton two = new KeyButton( "2", Color.GRAY);
	private KeyButton three = new KeyButton( "3", Color.GRAY);
	private KeyButton four = new KeyButton( "4", Color.GRAY);
	private KeyButton five = new KeyButton( "5", Color.GRAY);
	private KeyButton six = new KeyButton( "6", Color.GRAY);
	private KeyButton seven = new KeyButton( "7", Color.GRAY);
	private KeyButton eight = new KeyButton( "8", Color.GRAY);
	private KeyButton nine = new KeyButton( "9", Color.GRAY);
	private KeyButton zero = new KeyButton( "0", Color.GRAY);
	private KeyButton add = new KeyButton( "+", Color.ORANGE);
	private KeyButton subtract = new KeyButton( "-", Color.ORANGE);
	private KeyButton multiply = new KeyButton( "X", Color.ORANGE);
	private KeyButton divide = new KeyButton( "/", Color.ORANGE);
	private KeyButton percent = new KeyButton( "%", Color.ORANGE);
	private KeyButton equal = new KeyButton( "=", Color.GREEN);
	private KeyButton clear = new KeyButton( "CLR", Color.LIGHT_GRAY);
	private KeyButton decimal = new KeyButton( ".", Color.DARK_GRAY);

	/**
	 * Constructs a calculator with all it's various components and layout  
	 * @param title The title to be used to describe the calculator instance
	 */
	
	public Calculator(String title) {
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(calcWidth, calcHeight);
		this.setLayout(null);
		//TODO create and place panels for layout

		//display panel positioned top full width 100 high
		display.setBackground(Color.BLACK);
		display.setBounds(0, 0, 400, 100);
		//adding label for output display
		display.add(window);
		this.add(display);
		
		//**************** keypad panel ***************************************
		//keypad panel (3x4) grid layout
		keypad.setBackground(Color.black);
		keypad.setBounds(0, 100, 300, 400);
		keypad.setLayout(new GridLayout(4, 3));
		
		//add the keypad buttons to the keypad
		keypad.add(one);
		keypad.add(two);
		keypad.add(three);
		keypad.add(four);
		keypad.add(five);
		keypad.add(six);
		keypad.add(seven);
		keypad.add(eight);
		keypad.add(nine);
		keypad.add(clear);
		keypad.add(zero);
		keypad.add(decimal);
		
		//add action listener to keypad buttons
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		clear.addActionListener(this);
		decimal.addActionListener(this);
		
		//add keypad panel to the calculator
		this.add(keypad);
		
		//***************** equals panel *************************************
		//equals panel hold just the equals button
		equals.setBackground(Color.gray);
		equals.setBounds(0, 500, 300, 100);
		equals.setLayout(new GridLayout(1, 1));
		
		//add equals button to the panel
		equals.add(equal);
		
		//add action listener to equals button
		equal.addActionListener(this);
		
		this.add(equals);
		
		//*************************** operators ***************************
		//operator panel will run vertically along the right side 1 x 5 
		operators.setBackground(Color.yellow);
		operators.setBounds(300, 100, 100, 500);
		operators.setLayout(new GridLayout(5, 1));
		
		//add operator buttons to the operator panel
		operators.add(add);
		operators.add(subtract);
		operators.add(multiply);
		operators.add(divide);
		operators.add(percent);
		
		// add action listener to operators
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		percent.addActionListener(this);
		
		this.add(operators);//add the panel operators to the calculator frame
		
		//this needs to go last
		this.setVisible(true);//setting the visibility of the calculator to true
	}
	
	/**
	 * Method handling action events getting the ActionCommand for the button pushed
	 * this will handle the logic for what should be happening when buttons are pushed.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//get the expression as built so far
		StringBuilder expression = window.getExpression();
		//collect the current input value
		String currentInput = e.getActionCommand();
		//create array to hold the first and second opperands and the opperator
		String[] opperands = new String[3];
		double result = 0.0;
		
	}
		
	
}

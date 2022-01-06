package roch0251.calculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class Window extends JTextArea {

	private StringBuilder expression = new StringBuilder();
	
	public Window() {
		this.setFont(new Font("Arial", Font.BOLD, 25));
		this.setForeground(Color.WHITE);
		this.setEditable(false);
		this.setLineWrap(true);
		this.setBounds(0, 0, 400, 100);
    	this.setBackground(Color.black);
	}

	public StringBuilder getExpression() {
		return expression;
	}

	public void setExpression(StringBuilder expression) {
		this.expression = expression;
	}
	
	
}

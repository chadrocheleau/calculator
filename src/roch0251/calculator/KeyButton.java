package roch0251.calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class KeyButton extends JButton {
	
	public KeyButton (String label, Color color) {
		this.setText(label);
		this.setFont(new Font("Arial", Font.BOLD, 25));
		this.setForeground(Color.WHITE);
		this.setBackground(color);
		this.setVisible(true);
	}
	
}

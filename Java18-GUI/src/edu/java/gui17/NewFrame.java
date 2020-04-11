package edu.java.gui17;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewFrame extends JFrame{
	
	private static NewFrame frame;
	
	public static NewFrame getInstance(JLabel label) {
		if(frame == null) {
			frame = new NewFrame(label);
		}
		return frame;
	}
	
	private JTextField textField;
	
	public NewFrame(JLabel label) {
		setBounds(1, 1, 500, 500);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(47, 107, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Àü¼Û");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sendData = textField.getText();
				label.setText(sendData);
			}
		});
		btnNewButton.setBounds(275, 106, 97, 23);
		getContentPane().add(btnNewButton);
		
	}
}

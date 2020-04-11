package edu.java.gui09;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GuiMain09 {

	private JFrame frame;
	private JCheckBox chMusic, chMovie, chReading;
	private TextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain09 window = new GuiMain09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GuiMain09() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Font font = new Font("±¼¸²", Font.BOLD,32);
		chMusic = new JCheckBox("À½¾Ç");
		chMusic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printSelected();
			}
		});
		chMusic.setFont(font);
		chMusic.setBounds(8, 6, 110, 50);
		frame.getContentPane().add(chMusic);
		
		chMovie = new JCheckBox("¿µÈ­");
		chMovie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printSelected();
			}
		});
		chMovie.setFont(font);
		chMovie.setBounds(122, 6, 110, 50);
		frame.getContentPane().add(chMovie);
		
		chReading = new JCheckBox("µ¶¼­");
		chReading.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printSelected();
			}
		});
		chReading.setFont(font);
		chReading.setBounds(236, 6, 110, 50);
		frame.getContentPane().add(chReading);
		
		textArea = new TextArea();
		textArea.setFont(new Font("±¼¸²", Font.PLAIN,32));
		textArea.setBounds(8, 64, 414, 188);
		frame.getContentPane().add(textArea);
		
		
		
	} // end initialize()

	private void printSelected() {
		String result = "À½¾Ç : " + chMusic.isSelected() + "\n"
				+ "¿µÈ­ : " + chMovie.isSelected() + "\n"
				+ "µ¶¼­ : " + chReading.isSelected();
		textArea.setText(result);
				
	}
	
} // end GuiMain09




















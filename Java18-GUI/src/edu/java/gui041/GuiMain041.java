package edu.java.gui041;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain041 {

	private JFrame frame;
	private JTextField textNumber1, textNumber2, numberOutput;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain041 window = new GuiMain041();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	/**
	 * Create the application.
	 */
	public GuiMain041() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setBounds(12, 10, 245, 76);
		lblNumber1.setOpaque(true); // 배경색 설정을 위해 true로 설정
		lblNumber1.setBackground(Color.WHITE);
		lblNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber1.setFont(new Font("굴림", Font.BOLD, 48));
		frame.getContentPane().add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setBounds(12, 127, 245, 76);
		lblNumber2.setOpaque(true); // 배경색 설정을 위해 true로 설정
		lblNumber2.setBackground(Color.WHITE);
		lblNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber2.setFont(new Font("굴림", Font.BOLD, 48));
		frame.getContentPane().add(lblNumber2);
		
		textNumber1 = new JTextField();
		textNumber1.setBounds(269, 10, 633, 76);
		textNumber1.setFont(new Font("굴림", Font.PLAIN,30));
		frame.getContentPane().add(textNumber1);
		textNumber1.setColumns(10);
		
		textNumber2 = new JTextField();
		textNumber2.setBounds(269, 127, 633, 76);
		textNumber2.setFont(new Font("굴림", Font.PLAIN,30));
		frame.getContentPane().add(textNumber2);
		textNumber2.setColumns(10);
		
		JButton btnInsertPlus = new JButton("+");
		btnInsertPlus.setBounds(12, 268, 122, 100);
		btnInsertPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(textNumber1.getText());
				double number2 = Double.parseDouble(textNumber2.getText());
				double plus = number1 + number2 ;
				numberOutput.setText(Double.toString(plus));
			}
		});			
		btnInsertPlus.setFont(new Font("굴림",Font.PLAIN,48));
		frame.getContentPane().add(btnInsertPlus);
		
		JButton buttonM = new JButton("-");
		buttonM.setBounds(275, 268, 122, 100);
		buttonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(textNumber1.getText());
				double number2 = Double.parseDouble(textNumber2.getText());
				double ms = number1 - number2 ;
				numberOutput.setText(Double.toString(ms));
			}
		});
		buttonM.setFont(new Font("굴림", Font.PLAIN, 48));
		frame.getContentPane().add(buttonM);
		
		JButton buttonMp = new JButton("*");
		buttonMp.setBounds(520, 268, 122, 100);
		buttonMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(textNumber1.getText());
				double number2 = Double.parseDouble(textNumber2.getText());
				double mp = number1 * number2 ;
				numberOutput.setText(Double.toString(mp));
			}
		});
		buttonMp.setFont(new Font("굴림", Font.PLAIN, 48));
		frame.getContentPane().add(buttonMp);
		
		JButton buttonDi = new JButton("/");
		buttonDi.setBounds(780, 268, 122, 100);
		buttonDi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(textNumber1.getText());
				double number2 = Double.parseDouble(textNumber2.getText());
				try {
					double di = number1 / number2 ;
					numberOutput.setText(Double.toString(di));					
				}catch(Exception e1) {
					System.out.println("0은 나눌수 없습니다.");
				}
			}
		});
		buttonDi.setFont(new Font("굴림", Font.PLAIN, 48));
		frame.getContentPane().add(buttonDi);
		
		numberOutput = new JTextField();
		numberOutput.setBounds(12, 368, 890, 100);
		frame.getContentPane().add(numberOutput);
		numberOutput.setColumns(10);
		
		
		
		
		
		
		
		
		
	} // end initialize

} // GuiMain04




















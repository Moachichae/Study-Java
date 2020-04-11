package edu.java.gui04;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GuiMain04 {

	private JFrame frame;
	private JTextField textNumber1, textNumber2;
	private JButton btnPlus, btnMinus, btnMultiple, btnDivide;
	private JScrollPane scrollPane;
	private JTextArea textOutput;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain04 window = new GuiMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain04() {
		initialize();
	}
	

	private void initialize() {
		Font frameFont = new Font("굴림", Font.BOLD | Font.ITALIC, 48); 
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setFont(frameFont);
		lblNumber1.setBounds(12, 10, 280, 70);
		frame.getContentPane().add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
		lblNumber2.setBounds(12, 90, 280, 70);
		frame.getContentPane().add(lblNumber2);
		
		textNumber1 = new JTextField();
		textNumber1.setFont(frameFont);
		textNumber1.setBounds(304, 10, 368, 70);
		frame.getContentPane().add(textNumber1);
		textNumber1.setColumns(10);
		
		textNumber2 = new JTextField();
		textNumber2.setFont(frameFont);
		textNumber2.setBounds(304, 90, 368, 70);
		frame.getContentPane().add(textNumber2);
		textNumber2.setColumns(10);
		
		btnPlus = new JButton("+");
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("btnPlus : mouseClicked()");
				String s1 = textNumber1.getText();
				String s2 = textNumber2.getText();
				System.out.println(s1);
				System.out.println(s2);
				// 문자열을 숫자로 변환
				double x = Double.parseDouble(s1);
				double y = Double.parseDouble(s2);
				
				// 덧셈 결과
				String result = x + " + " + y + " = " + (x + y) + "\n";
//				textOutput.setText(result);
				textOutput.append(result);
			}
		});
		
		btnPlus.setFont(frameFont);
		btnPlus.setBounds(12, 170, 100, 100);
		frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btnMinus : actionPerformed()");
				String s1 = textNumber1.getText();
				String s2 = textNumber2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				double x = Double.parseDouble(s1);
				double y = Double.parseDouble(s2);
				
				String result = x + " - " + y + " = " + (x - y) + "\n";
				textOutput.append(result);
			}
		});
		btnMinus.setFont(frameFont);
		btnMinus.setBounds(192, 170, 100, 100);
		frame.getContentPane().add(btnMinus);
		
		btnMultiple = new JButton("*");
		btnMultiple.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { 
				// KeyEvent : 사용자가 누른 키의 정보를 가지고 있음
				if (e.getKeyCode() == KeyEvent.VK_ENTER) { 
					System.out.println("엔터 누름");
					double x = Double.parseDouble(textNumber1.getText());
					double y = Double.parseDouble(textNumber2.getText());
					String result = x + " X " + y + " = " + (x * y) + "\n";
					textOutput.append(result);
				}
			}
		});
		btnMultiple.setFont(frameFont);
		btnMultiple.setBounds(386, 170, 100, 100);
		frame.getContentPane().add(btnMultiple);	
		
		btnDivide = new JButton("/");
		btnDivide.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		btnDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnDivide.setFont(frameFont);
		btnDivide.setBounds(572, 170, 100, 100);
		frame.getContentPane().add(btnDivide);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 280, 660, 222);
		frame.getContentPane().add(scrollPane);
		
		textOutput = new JTextArea();
		textOutput.setFont(new Font("Monospaced", Font.PLAIN, 48));
		scrollPane.setViewportView(textOutput);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setRowHeaderView(textPane);
		
		
	} // end initialize()
} // end GuiMain04











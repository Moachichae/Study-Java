package edu.java.gui13;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {
	private JPanel contentPane;
	
	public MyFrame() {
		initialize();
	}
	
	private void initialize() {
		// JFrame.EXIT_ON_CLOSE : ���α׷� ��ü ����
		// JFrame.DISPOSE_ON_CLOSE : ���� â�� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	} // end initialize();
	
	
} // end MyFrame

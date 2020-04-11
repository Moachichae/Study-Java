package edu.java.gui05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class GuiMain05 {
	
	private JFrame frame;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();  // ��ư �׷쿡 �� JButton���� �ϳ��� ������ �������־����
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {				
				
			@Override
			public void run() {
				try {
					GuiMain05 window = new GuiMain05();
					window.frame.setVisible(true);					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}		
			
		});
		

	} // end main()

	public GuiMain05() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnAgree = new JRadioButton("����");
		rdbtnAgree.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnAgree.getText()); // getText : rdbtnAgree ��  text ��������				
			}
		});
		buttonGroup.add(rdbtnAgree);
		rdbtnAgree.setBounds(8, 26, 121, 23);
		rdbtnAgree.setSelected(true); // ��ư�� ���¸� �����ϴ� �޼ҵ� 
									// true : �ʱ⿡ ��ư�� ���������� false: ��ư�� ��������������
		frame.getContentPane().add(rdbtnAgree);
		
		JRadioButton rdbtnReject = new JRadioButton("�ź�");
		rdbtnReject.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnReject.getText());				
			}
		});
		
		buttonGroup.add(rdbtnReject);
		rdbtnReject.setBounds(133, 26, 121, 23);		
		frame.getContentPane().add(rdbtnReject);
		
		textArea= new JTextArea();
		textArea.setBounds(8, 51, 506, 272);
		frame.getContentPane().add(textArea);
		
		
		
	}
} // end GuiMain05

package edu.java.gui07;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiMain07 {

	private JFrame frame;
	private static final String[] STRINGS = {
		"1. �̿���",
		"2. ������",
		"3. ������",
		"4. ������",
		"5. ������"
	} ;
	int index ;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain07 window = new GuiMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	
	public GuiMain07() {
		initialize();
	}

	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Font font = new Font("����", Font.BOLD, 48);
		JLabel lblOuput = new JLabel("���� ���");
		lblOuput.setFont(font);
		lblOuput.setBounds(12, 10, 410, 69);
		lblOuput.setText(STRINGS[0]);
		frame.getContentPane().add(lblOuput);
	
		JButton btnPrev = new JButton("����");
		btnPrev.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) { 
				if( index > 0 ) { // ���� �ε����� 0���� ũ�� 
					index--; // �ٸ� ��ġ���� ���Ǵ� ������ ��� ������ �����ؾ� ��					
				} else { // ���� �ε����� 0�� �Ǹ�
					index = STRINGS.length - 1 ; // �迭�� ���� ū �ε��� ��ȣ�� ����
				}
				lblOuput.setText(STRINGS[index]);				
			}
		});
		btnPrev.setFont(font);
		btnPrev.setBounds(12, 89, 141, 80);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("����");
		btnNext.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(index < STRINGS.length -1 ) {
					index++;
				} else {
					index = 0;
				}
				lblOuput.setText(STRINGS[index]);
			}
		});
		btnNext.setFont(font);
		btnNext.setBounds(281, 89, 141, 80);
		frame.getContentPane().add(btnNext);
		
	} // end initialize()

} // end GuiMain07












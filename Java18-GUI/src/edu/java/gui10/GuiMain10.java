package edu.java.gui10;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiMain10 {

	private JFrame frame;
	private JLabel lblOutput;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain10 window = new GuiMain10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // and main()

	
	public GuiMain10() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Font font = new Font("����",Font.PLAIN,34	);
		lblOutput = new JLabel("New Label");
		lblOutput.setFont(font);
		lblOutput.setBounds(12, 10, 410, 47);
		frame.getContentPane().add(lblOutput);
		
		int btnWidth = 110;
		int btnHeight = 40;
		
		font = new Font("����",Font.PLAIN,24);
		btn1 = new JButton("��ư1");
		// �͸� Ŭ���� ����� �̺�Ʈ �ڵ鷯 ���
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				lblOutput.setText(btn1.getText() + "Ŭ��");
			}
		});
		btn1.setFont(font);
		btn1.setBounds(12, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("��ư2");
		// ����(Lambda) ǥ������ ����� �̺�Ʈ �ڵ鷯 ���
		btn2.addActionListener((e) -> {
			lblOutput.setText(btn2.getText() + "Ŭ��");
		});
		btn2.setFont(font);
		btn2.setBounds(166, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn2);
		
		// MyListener Ŭ������ �ν��Ͻ� ����
		ActionListener l = new MyListener(); // ������
		btn3 = new JButton("��ư3");
		btn3.addActionListener(l);
		btn3.setFont(font);
		btn3.setBounds(312, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("��ư4");
		btn4.addActionListener(l);
		btn4.setFont(font);
		btn4.setBounds(12, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("��ư5");
		btn5.setFont(font);
		btn5.setBounds(166, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("��ư6");
		btn6.setFont(font);
		btn6.setBounds(312, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn6);
		
		
		
	} // and initialize
	
	// ActionListener �������̽��� �����ϴ� ���� Ŭ���� ����
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) { // e : ��ü�� ����
			// actionPerformed()�� �Ű����� e�� ���ؼ�
			// � ��ü�� Ŭ���� ���� �� ã�� �� ����.		
			Object src = e.getSource(); // ��ü�� ������ ������
			if(src instanceof JButton) { // �̺�Ʈ ��ü�� JButton Ÿ���̸� 
				JButton btn = (JButton) src;
				if(btn == btn3) {
					lblOutput.setText("btn3 : MyListener ��ü");
				}else {
					lblOutput.setText("btn4 : MyListener ��ü");
				}
			}
		}
		
	} // end MyListener

} // end GuiMain10

















package edu.java.gui08;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiMain08 {

	private JFrame frame;
	// ���� �ε��� ����
	private int index;
	// �̹������� ����� ��ġ(���)�� ���ڿ��� ����
	private static final String[] IMAGES = {
		"res/flower1.png", 
		"res/flower2.png", 
		"res/flower3.png", 
		"res/flower4.png", 
		"res/flower5.png", 
	};
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain08 window = new GuiMain08();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiMain08() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Font font = new Font("����", Font.BOLD, 48);
		JLabel lblImage = new JLabel();
		lblImage.setBounds(93, 10, 256, 256);
		lblImage.setIcon(new ImageIcon(IMAGES[index]));
		
		frame.getContentPane().add(lblImage);

		JButton btnPrev = new JButton("����");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) { // ���� �ε����� 0���� ũ��
					index--; // �ٸ� ��ġ���� ���Ǵ� ������ ��� ������ �����ؾ� ��					
				} else { // ���� �ε����� 0�� �Ǹ�
					index = IMAGES.length - 1; // �迭�� ���� ū �ε��� ��ȣ�� ����
				}
				lblImage.setIcon(new ImageIcon(IMAGES[index]));
			}
		});
		btnPrev.setFont(font);
		btnPrev.setBounds(12, 305, 141, 80);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("����");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < IMAGES.length - 1) {
					index++;
				} else {
					index = 0;
				}
				lblImage.setIcon(new ImageIcon(IMAGES[index]));
			}
		});
		btnNext.setFont(font);
		btnNext.setBounds(281, 305, 141, 80);
		frame.getContentPane().add(btnNext);
		
	} // end initialize()

} // end GuiMain08



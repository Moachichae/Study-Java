package edu.java.gui03;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiMain03 {

	private JFrame frame;
	private JTextField textName, textPhone, textEmail, textOutput;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain03 window = new GuiMain03();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()


	public GuiMain03() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setOpaque(true); // 배경색 설정을 위해 true로 설정
		lblName.setBackground(Color.pink);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD, 48));
		lblName.setBounds(12, 10, 245, 76);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setOpaque(true);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("굴림", Font.BOLD, 48));
		lblPhone.setBackground(Color.ORANGE);
		lblPhone.setBounds(12, 96, 245, 76);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("굴림", Font.BOLD, 48));
		lblEmail.setBackground(Color.BLUE);
		lblEmail.setBounds(12, 182, 245, 76);
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("굴림", Font.PLAIN,30));
		textName.setBounds(269, 10, 633, 76);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("굴림", Font.PLAIN,30));
		textPhone.setBounds(269, 96, 633, 76);
		frame.getContentPane().add(textPhone);
		textPhone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("굴림", Font.PLAIN,30));
		textEmail.setBounds(269, 182, 633, 76);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textOutput = new JTextField();
		textOutput.setBounds(12, 378, 890, 100);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
		
		JButton btnInsert = new JButton("정보 출력");
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스 클릭했을 때 동작할 기능 구현
				String name = textName.getText();
				String phone = textPhone.getText();
				String email = textEmail.getText();
				String msg = "이름 : " + name + "\n"
						+ "전화번호 : " + phone + "\n"
						+ "이메일 : " + email;
				textOutput.setText(msg);
				textArea.setText(msg);
			}
		});
		btnInsert.setFont(new Font("굴림",Font.PLAIN,48));
		btnInsert.setBounds(12, 268, 890, 100);
		frame.getContentPane().add(btnInsert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 479, 890, 123);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN,20));
		textArea.setEditable(false); // 편집 불가
		scrollPane.setViewportView(textArea);
		
		
		
	} // end initialize()
} // end GuiMain02

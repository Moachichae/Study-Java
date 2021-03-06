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
		
		Font font = new Font("굴림",Font.PLAIN,34	);
		lblOutput = new JLabel("New Label");
		lblOutput.setFont(font);
		lblOutput.setBounds(12, 10, 410, 47);
		frame.getContentPane().add(lblOutput);
		
		int btnWidth = 110;
		int btnHeight = 40;
		
		font = new Font("굴림",Font.PLAIN,24);
		btn1 = new JButton("버튼1");
		// 익명 클래스 사용한 이벤트 핸들러 등록
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				lblOutput.setText(btn1.getText() + "클릭");
			}
		});
		btn1.setFont(font);
		btn1.setBounds(12, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("버튼2");
		// 람다(Lambda) 표현식을 사용한 이벤트 핸들러 등록
		btn2.addActionListener((e) -> {
			lblOutput.setText(btn2.getText() + "클릭");
		});
		btn2.setFont(font);
		btn2.setBounds(166, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn2);
		
		// MyListener 클래스의 인스턴스 생성
		ActionListener l = new MyListener(); // 다형성
		btn3 = new JButton("버튼3");
		btn3.addActionListener(l);
		btn3.setFont(font);
		btn3.setBounds(312, 67, btnWidth, btnHeight);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("버튼4");
		btn4.addActionListener(l);
		btn4.setFont(font);
		btn4.setBounds(12, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("버튼5");
		btn5.setFont(font);
		btn5.setBounds(166, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("버튼6");
		btn6.setFont(font);
		btn6.setBounds(312, 117, btnWidth, btnHeight);
		frame.getContentPane().add(btn6);
		
		
		
	} // and initialize
	
	// ActionListener 인터페이스를 구현하는 내부 클래스 정의
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) { // e : 객체의 정보
			// actionPerformed()의 매개변수 e를 통해서
			// 어떤 객체가 클릭된 것인 지 찾을 수 있음.		
			Object src = e.getSource(); // 객체의 정보를 가져옴
			if(src instanceof JButton) { // 이벤트 객체가 JButton 타입이면 
				JButton btn = (JButton) src;
				if(btn == btn3) {
					lblOutput.setText("btn3 : MyListener 객체");
				}else {
					lblOutput.setText("btn4 : MyListener 객체");
				}
			}
		}
		
	} // end MyListener

} // end GuiMain10

















package edu.java.gui02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain02 {

	private JFrame frame;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain02 window = new GuiMain02();
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
	public GuiMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int width = 760;
		JLabel lblOutput = new JLabel("\uC218\uC694\uC77C\uC785\uB2C8\uB2E4");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setHorizontalTextPosition(SwingConstants.LEADING);
		lblOutput.setForeground(Color.BLUE);
		lblOutput.setFont(new Font("맑은 고딕", Font.PLAIN, 29));
		lblOutput.setBounds(12, 10, width, 100);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("돋움체", Font.ITALIC, 34));
		textInput.setBounds(12, 120, width, 100);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JButton btnInput = new JButton("\uC785\uB825");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 버튼을 클릭했을 때 해야 할 기능 구현
				// JTextField에 입력된 내용을 읽어서 JLabel에 씀
				String msg = textInput.getText();
				lblOutput.setText(msg);
			}
		});
		btnInput.setFont(new Font("궁서체", Font.PLAIN, 27));
		btnInput.setBounds(12, 230, 760, 100);
		frame.getContentPane().add(btnInput);
	}
}

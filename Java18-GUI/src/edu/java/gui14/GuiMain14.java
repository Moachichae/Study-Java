package edu.java.gui14;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class GuiMain14 {

	private JFrame frame;
	private JTextField txtInputId; // ���̵� �Է� ����
	private JPanel topPanel; // �α���, �α׾ƿ�, ���̵� ���� �Է��ϴ� �ǳ�
	private JPanel contentPane; // ������ �� �����Ǵ� �⺻ �ǳ�(��ư �� ����)
	private JLabel lblInfo;
	private JButton btnLogin, btnLogout;
	private boolean isLogin = false; // �α׾ƿ�, �α��λ��¸� üũ�ϱ� ���� ����
	private JPanel loginPanel; // �α��� ���� �� ���̴� �ǳ�
	private JPanel logoutPanel; // �α׾ƿ� ���� �� ���̴� �ǳ�
	private Component currentComponent; // ���� ������ �ִ� ���۳�Ʈ Ȯ�� ����
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain14 window = new GuiMain14();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	
	public GuiMain14() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0,0));
		// BorderLayout�� 5���� �������� �����Ͽ� ����ϴ� ���̾ƿ�
		
		
		topPanel = new JPanel();
		// topPanel�� ��ġ�� ���ʿ� ��ġ
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,null,null));
		topPanel.setLayout(new GridLayout(1,0,0,0)); //new GridLayout() : ���� ���̸� ���������ʾƵ� �ڵ����� �� ä���� 
		
		/*topPanel�� �� ���۳�Ʈ*/
		
		txtInputId = new JTextField();
		topPanel.add(txtInputId);
		txtInputId.setColumns(10);
		
		
		btnLogin = new JButton("�α���");
		btnLogin.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				if(isLogin == false) { // �α׾ƿ� ������ �� ����
					lblInfo.setText(txtInputId.getText() + "ȯ���մϴ�.");
					
					// ���� �ǳ� ����
					frame.getContentPane().remove(currentComponent);
					frame.revalidate(); // ���۳�Ʈ �����
					frame.repaint(); // ���۳�Ʈ �ٽ� �׸�
					
					// �α��� ���� �� ������ �ǳ� �߰�
					loginPanel = new JPanel();
					JLabel lblLogin = new JLabel("�α��� �Ǿ����ϴ�.");
					loginPanel.add(lblLogin);
					frame.getContentPane().add(loginPanel, BorderLayout.CENTER);
					frame.revalidate();
					frame.repaint();
					
					// ���� ���۳�Ʈ ������ �α��� ���� ����
					currentComponent = loginPanel;
					isLogin = true;
					
					
				}
			}
		});
		topPanel.add(btnLogin);
		
		btnLogout = new JButton("�α׾ƿ�");
		btnLogout.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isLogin == true) { // �α��� ������ �� ����
					// ���� �ǳ� ���� 
					frame.getContentPane().remove(currentComponent);
					frame.revalidate();
					frame.repaint();
					
					// �α׾ƿ� ���� �� ������ �ǳ� �߰�
					logoutPanel = new JPanel();
					JLabel lblLogout = new JLabel("�α׾ƿ� �Ǿ����ϴ�.");
					logoutPanel.add(lblLogout);
					frame.getContentPane().add(logoutPanel,BorderLayout.CENTER);
					frame.revalidate();
					frame.repaint();
					
					// ���� ���۳�Ʈ ������ �α��� ���� ����
					currentComponent = logoutPanel;
					isLogin = false;
				}
				
			}
		});
		topPanel.add(btnLogout);
		
		/* �⺻ �ǳ� ����*/
		contentPane = new JPanel();
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		// ���� ���۳�Ʈ�� �ǳ� ����
			currentComponent = contentPane;
			frame.getContentPane().add(contentPane,BorderLayout.CENTER);
			lblInfo = new JLabel("�ȳ��ϼ���");
			contentPane.add(lblInfo);
		
		
		
		
		
	} // end initialize()

} // end GuiMain14















package edu.java.gui11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class GuiMain11 {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain11 window = new GuiMain11();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	
	public GuiMain11() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JFileChooser :  ������ ������ �� �ִ� �˾� â
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					System.out.println("���� ����");
					File selected = chooser.getSelectedFile();
					System.out.println(selected.getAbsolutePath());
				}else {
					System.out.println("���");
				}
				
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ConfirmDialog:
				// Yes(Ȯ��) - No(�ƴϿ�) - Cancel(���) ��ư�� ���� ���̾�α�
				int result = 
//						JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?");
						JOptionPane.showConfirmDialog(null,
								"�����Ͻðڽ��ϱ�?",
								"Ȯ��",
								JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION) {
					// ���α׷� ����:
					// System.exit(0); ���� ����
					// System.exit(0 �̿��� ����); ������ ����
					System.exit(0);
				} else if(result == JOptionPane.NO_OPTION) {
					System.out.println("���");
				}
				
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �޼����� Ok ��ư�� �ִ� ���̾�α� : MessageDialog
//				JOptionPane.showMessageDialog(null, "���� 1.0");		
				// �Ű����� parentComponent :
				//		MessageDialog�� �θ� ���۳�Ʈ�� ����
				//		������ �Ǿ� ������, ���̾�α״� �θ� â�� ����� ����
				//		null�� �Ǿ� ������, ȭ���� �߾ӿ� ����
				JOptionPane.showConfirmDialog(frame, 
						"���� 1.0",
						"����",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnHelp.add(mntmAbout);
	} // end initialize

} // end GuiMain11















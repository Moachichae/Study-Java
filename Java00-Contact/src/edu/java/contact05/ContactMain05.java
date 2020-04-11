package edu.java.contact05;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




public class ContactMain05 {

	private JFrame frame;
	// DAO : �Լ��� ��� �� �����͸� ����/�б⸦ �����ϴ� Ŭ����(�ν��Ͻ�)
	private static ContactDAO dao;
	private JTextField txtName,txtPhone,txtEmail,txtIndex;
	private JTextArea txtAreaInfo, txtAreaLog;
	private JButton btnInput,btnUpdate,
	btnDelete,btnInsert,btnAllSearch,btnSearch;
	
	/* ���� ���̺��� ����ϱ� ���� ��� ���� ���� */
	private JTable table;
	private String[] colNames = {"No", "�̸�", "����ó", "�̸���"};
	private Object[] records = new Object[colNames.length];
	private DefaultTableModel tableModel;
	
	

	
	
	public static void main(String[] args) {
		dao = ContactDAOImple.getInstance(); // �̱��� �ν��Ͻ� �ҷ�����
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	
	public ContactMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();		
		frame.setBounds(100, 100, 786, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Font lblFont = new Font("����",Font.PLAIN,44);
		int lblWidth = 176;
		int lblHeight = 55;
		JLabel lblNewLabel = new JLabel("����ó ���α׷� Version 0.5");
				
		
		lblNewLabel.setFont(lblFont);
		lblNewLabel.setBounds(12, 10, 746, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("�̸�");
		lblName.setFont(lblFont);
		lblName.setBounds(12, 86, lblWidth, lblHeight);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		lblPhone.setFont(lblFont);
		lblPhone.setBounds(12, 151,lblWidth, lblHeight);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("�̸���");
		lblEmail.setFont(lblFont);
		lblEmail.setBounds(12, 216, lblWidth, lblHeight);
		frame.getContentPane().add(lblEmail);
		
		Font txtFont = new Font("����", Font.PLAIN,34);
		int txtWidth = 286;
		int txtHeight = 55;
		txtName = new JTextField();
		
		txtName = new JTextField();
		txtName.setFont(txtFont);
		txtName.setBounds(200, 86, txtWidth, txtHeight);
		frame.getContentPane().add(txtName);
		
		txtPhone = new JTextField();
		txtPhone.setFont(txtFont);
		txtPhone.setBounds(200, 151, txtWidth, txtHeight);
		frame.getContentPane().add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.setFont(txtFont);
		txtEmail.setBounds(200, 216, txtWidth, txtHeight);
		frame.getContentPane().add(txtEmail);
		
			
		
		
		
		Font btnFont = new Font("����", Font.PLAIN,24);		
		
		btnInput = new JButton("�Է�");
		btnInput.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btnInput.setFont(btnFont);
		btnInput.setBounds(12, 281, 110, 46);
		frame.getContentPane().add(btnInput);
		
		btnInsert = new JButton("���");
		btnInsert.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();	
				
			}
		});
		btnInsert.setFont(btnFont);
		btnInsert.setBounds(134, 281, 110, 46);
		frame.getContentPane().add(btnInsert);
		
		btnSearch = new JButton("�˻�");
		btnSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectContactByIndex();				
				
			}
		});
		btnSearch.setFont(btnFont);
		btnSearch.setBounds(256, 281, 110, 46);
		frame.getContentPane().add(btnSearch);
		
		btnUpdate = new JButton("����");
		btnUpdate.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
				
			}
		});
		btnUpdate.setFont(btnFont);
		btnUpdate.setBounds(12, 337, 110, 46);
		frame.getContentPane().add(btnUpdate);
		
		btnDelete = new JButton("����");
		btnDelete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
				
			}
		});		
		btnDelete.setFont(btnFont);
		btnDelete.setBounds(134, 337, 110, 46);
		frame.getContentPane().add(btnDelete);
		
		btnAllSearch = new JButton("��ü�˻�");
		btnAllSearch.addActionListener(e -> {
			selectAllContacts();
		});
			
				
		
		
		btnAllSearch.setFont(btnFont);
		btnAllSearch.setBounds(256, 337, 190, 46);
		frame.getContentPane().add(btnAllSearch);
		
		txtIndex = new JTextField("��ȣ�Է�");
		txtIndex.setFont(new Font("����", Font.PLAIN,17));
		txtIndex.setBounds(378, 281, 108, 46);
		frame.getContentPane().add(txtIndex);	
		txtIndex.setColumns(5);
		
		
		JScrollPane scrollPane = new JScrollPane();		
		scrollPane.setBounds(12, 393, 480, 95);
		frame.getContentPane().add(scrollPane);
		
		txtAreaInfo = new JTextArea();
		txtAreaInfo.setFont(new Font("����", Font.PLAIN, 16));
		scrollPane.setViewportView(txtAreaInfo);
		
		JScrollPane scrollPane_1 = new JScrollPane();		
		scrollPane_1.setBounds(12, 498, 480, 95);
		frame.getContentPane().add(scrollPane_1);
		
		txtAreaLog = new JTextArea();
		txtAreaLog.setFont(new Font("����", Font.PLAIN, 16));
		scrollPane_1.setViewportView(txtAreaLog);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(510, 281, 248, 307);
		frame.getContentPane().add(scrollPane_2);
		
		// ���̺� �⺻ �ʱ�ȭ
		tableModel = new DefaultTableModel(colNames,0); // �� ����
		table = new JTable(tableModel); // �� ���̺� ����
		table.setFont(new Font("����", Font.PLAIN,15));
		scrollPane_2.setViewportView(table);
		
		
		
		
		
		
		
		

		
		
		
	} // end initialize()
	
	private void insertContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		
		if(name.equals("")) { // �̸��� �ƹ��͵� �Էµ��� ������
			txtAreaLog.setText("[����ó ����] �̸��� �Է����ּ���.");
			return; // �Լ� ����
		}
		
		ContactVO vo = new ContactVO(name, phone, email);
		int result = dao.insert(vo);
		if(result > 0) {
			txtAreaLog.setText("����ó ��� ����!");
			clearTextFields();
		}else {
			txtAreaLog.setText("����ó ��� ����!");
		}
	} // end insertContact()
	
	private void selectContactByIndex() {
		try {
			// �ε��� ���� �޾ƿͼ�(���ڿ�) int ���·� ��ȯ
			int index = Integer.parseInt(txtIndex.getText());
			ContactVO contact = dao.select(index);
			
			txtAreaInfo.setText(contact.toString());			
		} catch(NullPointerException e) {
			txtAreaLog.setText("����ó�� �������� �ʽ��ϴ�.");
		} catch(NumberFormatException e) {
			txtAreaLog.setText("�ε����� ����� �Է��ϼ���");
		}
	} // end selectContactByIndex()
	
	private void updateContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		int index = 0;
		try {
			index = Integer.parseInt(txtIndex.getText());			
		} catch(NumberFormatException e){
			txtAreaLog.setText("�ε����� ����� �Է��ϼ���.");
		}
		
		if(name.equals("")) {
			txtAreaLog.setText("[����ó ����] �̸��� �Է����ּ���.");
			return;
		}
		
		ContactVO vo = new ContactVO(name,phone,email);
		int result = dao.update(index, vo);
		if (result > 0) {
			txtAreaLog.setText("����ó ���� ����!");
			clearTextFields();
		} else {
			txtAreaLog.setText(index + "�� ����ó�� �������� �ʽ��ϴ�.");
		}
	} // end updateContact
	
	private void deleteContact() {
		int index = Integer.parseInt(txtIndex.getText());
		int result = dao.delete(index);
		if(result > 0) {
			txtAreaLog.setText(index + "�� ����ó ���� ����!");
		} else {
			txtAreaLog.setText(index + "�� ����ó�� �������� �ʽ��ϴ�.");
		}
	} // end deleteContact()
	
	private void selectAllContacts() {
		ArrayList<ContactVO> list = dao.select();
		
		if(list.size() == 0) {
			txtAreaLog.setText("����ó�� �������� �ʽ��ϴ�.");
			return;
		}
		
		StringBuffer buffer = new StringBuffer();		
			tableModel.setRowCount(0);
		for(int i = 0; i < list.size();i++) {
			buffer.append(list.get(i).toString());
			// ���̺� �� ��ҵ�(��ȣ, �̸�, ��ȭ��ȣ, �̸���)�� ���̺� �𵨿� ����			
			records[0] = i;
			records[1] = list.get(i).getName();
			records[2] = list.get(i).getPhone();
			records[3] = list.get(i).getEmail();
			tableModel.addRow(records);				
		}
		
		txtAreaInfo.setText(buffer.toString());
		
	}
	
	// �ؽ�Ʈ �ʵ� �ʱ�ȭ �Լ�
	private void clearTextFields() {
		txtName.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
	}
	
} // end ContactMain05












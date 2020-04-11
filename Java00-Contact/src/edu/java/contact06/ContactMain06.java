package edu.java.contact06;

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




public class ContactMain06 {

	private JFrame frame;
	// DAO : 함수의 기능 및 데이터를 저장/읽기를 수행하는 클래스(인스턴스)
	private static ContactDAO dao;
	private JTextField txtName,txtPhone,txtEmail,txtNameSearch;
	private JTextArea txtAreaInfo, txtAreaLog;
	private JButton btnInput,btnUpdate,
	btnDelete,btnInsert,btnAllSearch,btnSearch;
	
	/* 스윙 테이블을 사용하기 위한 멤버 변수 선언 */
	private JTable table;
	private String[] colNames = {"No", "이름", "연락처", "이메일"};
									
	private Object[] records = new Object[colNames.length];
	private DefaultTableModel tableModel;
	
	

	
	
	public static void main(String[] args) {
		dao = ContactDAOImple.getInstance(); // 싱글톤 인스턴스 불러오기
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	
	public ContactMain06() {
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
		
		Font lblFont = new Font("굴림",Font.PLAIN,44);
		int lblWidth = 176;
		int lblHeight = 55;
		JLabel lblNewLabel = new JLabel("연락처 프로그램 Version 0.");
				
		
		lblNewLabel.setFont(lblFont);
		lblNewLabel.setBounds(12, 10, 746, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("이름");
		lblName.setFont(lblFont);
		lblName.setBounds(12, 86, lblWidth, lblHeight);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setFont(lblFont);
		lblPhone.setBounds(12, 151,lblWidth, lblHeight);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setFont(lblFont);
		lblEmail.setBounds(12, 216, lblWidth, lblHeight);
		frame.getContentPane().add(lblEmail);
		
		Font txtFont = new Font("굴림", Font.PLAIN,34);
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
		
			
		
		
		
		Font btnFont = new Font("굴림", Font.PLAIN,24);		
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btnInput.setFont(btnFont);
		btnInput.setBounds(12, 281, 110, 46);
		frame.getContentPane().add(btnInput);
		
		btnInsert = new JButton("등록");
		btnInsert.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();	
				
			}
		});
		btnInsert.setFont(btnFont);
		btnInsert.setBounds(134, 281, 110, 46);
		frame.getContentPane().add(btnInsert);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectContactByIndex();				
				
			}
		});
		btnSearch.setFont(btnFont);
		btnSearch.setBounds(256, 281, 110, 46);
		frame.getContentPane().add(btnSearch);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
				
			}
		});
		btnUpdate.setFont(btnFont);
		btnUpdate.setBounds(12, 337, 110, 46);
		frame.getContentPane().add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
				
			}
		});		
		btnDelete.setFont(btnFont);
		btnDelete.setBounds(134, 337, 110, 46);
		frame.getContentPane().add(btnDelete);
		
		btnAllSearch = new JButton("전체검색");
		btnAllSearch.addActionListener(e -> {
			selectAllContacts();
		});
			
				
		
		
		btnAllSearch.setFont(btnFont);
		btnAllSearch.setBounds(256, 337, 190, 46);
		frame.getContentPane().add(btnAllSearch);
		
		txtNameSearch = new JTextField("이름입력");
		txtNameSearch.setFont(new Font("굴림", Font.PLAIN,17));
		txtNameSearch.setBounds(378, 281, 108, 46);
		frame.getContentPane().add(txtNameSearch);	
		txtNameSearch.setColumns(5);
		
		
		JScrollPane scrollPane_Info = new JScrollPane();		
		scrollPane_Info.setBounds(12, 393, 480, 95);
		frame.getContentPane().add(scrollPane_Info);
		
		txtAreaInfo = new JTextArea();
		txtAreaInfo.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane_Info.setViewportView(txtAreaInfo);
		
		JScrollPane scrollPane_Log = new JScrollPane();		
		scrollPane_Log.setBounds(12, 498, 480, 95);
		frame.getContentPane().add(scrollPane_Log);
		
		txtAreaLog = new JTextArea();
		txtAreaLog.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane_Log.setViewportView(txtAreaLog);
		
		
		JScrollPane scrollPane_Table = new JScrollPane();
		scrollPane_Table.setBounds(510, 281, 248, 307);
		frame.getContentPane().add(scrollPane_Table);
		
		// 테이블 기본 초기화
		tableModel = new DefaultTableModel(colNames, 0); // 모델 설정
		table = new JTable(tableModel); // 모델 테이블에 적용
		table.setFont(new Font("굴림", Font.PLAIN,15));
		scrollPane_Table.setViewportView(table);
		
		
		
		
		
		
		
		

		
		
		
	} // end initialize()
	
	private void insertContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		
		if(name.equals("")) { // 이름이 아무것도 입력되지 않으면
			txtAreaLog.setText("[연락처 저장] 이름을 입력해주세요.");
			return; // 함수 종료
		}
		
		ContactVO vo = new ContactVO(name, phone, email);
		int result = dao.insert(vo);
		if(result > 0) {
			txtAreaLog.setText("연락처 등록 성공!");
			clearTextFields();
		}else {
			txtAreaLog.setText("연락처 등록 실패!");
		}
	} // end insertContact()
	
	private void selectContactByIndex() {
		try {
			// 인덱스 값을 받아와서(문자열) int 형태로 변환
			String nameSearch = txtNameSearch.getText();
			ContactVO contact = dao.select(nameSearch);
			
			txtAreaInfo.setText(contact.toString());			
		} catch(NullPointerException e) {
			txtAreaLog.setText("이름이 존재하지 않습니다.");
		} 
	} // end selectContactByIndex()
	
	private void updateContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		String nameSearch = null;
		try {
			nameSearch =txtNameSearch.getText();			
		} catch(NullPointerException e){
			txtAreaLog.setText(nameSearch +" 연락처가 존재하지 않습니다.");
		}
		
		if(name.equals("")) {
			txtAreaLog.setText("[연락처 수정] 이름을 입력해주세요.");
			return;
		}
		
		ContactVO vo = new ContactVO(name,phone,email);
		int result = dao.update(nameSearch, vo);
		if (result > 0) {
			txtAreaLog.setText("연락처 수정 성공!");
			clearTextFields();
		} else {
			txtAreaLog.setText(nameSearch + " 연락처가 존재하지 않습니다.");
		}
	} // end updateContact
	
	private void deleteContact() {
		String nameSearch = txtNameSearch.getText();
		int result = dao.delete(nameSearch);
		if(result > 0) {
			txtAreaLog.setText(nameSearch + " 연락처 삭제 성공!");
			clearTextFields();
		} else {
			txtAreaLog.setText(nameSearch + " 연락처가 존재하지 않습니다.");
		}
		// TODO : 보조 txt  변경 : 번 연락처가 존재하지않습니다.
	} // end deleteContact()
	
	private void selectAllContacts() {
		ArrayList<ContactVO> list = dao.select();
		
		if(list.size() == 0) {
			txtAreaLog.setText("연락처가 존재하지 않습니다.");
			return;
		}
		
		StringBuffer buffer = new StringBuffer();		
			tableModel.setRowCount(0);
		for(int i = 0; i < list.size();i++) {
			buffer.append(list.get(i).toString());
			// 테이블 각 요소들(번호, 이름, 전화번호, 이메일)을 테이블 모델에 저장			
			records[0] = i;
			records[1] = list.get(i).getName();
			records[2] = list.get(i).getPhone();
			records[3] = list.get(i).getEmail();
			tableModel.addRow(records);				
		}
		
		txtAreaInfo.setText(buffer.toString());
		
	}
	
	
	// 텍스트 필드 초기화 함수
	private void clearTextFields() {
		txtNameSearch.setText("이름입력");
		txtName.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
	}
	
} // end ContactMain05












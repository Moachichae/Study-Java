package edu.java.contact04;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;



public class ContactDAOImple implements ContactDAO {
	// Ŭ������ ��ġ �� �̸� ����
	private static String className = ContactDAOImple.class.getName();
	
	// Singleton ���� ����
	// 1. private static �ڱ��ڽ� Ÿ�� ��� ���� ����
	private static ContactDAOImple instance = null;

	// 2. private ������
	private ContactDAOImple() {
		// �����Ͱ� ����� ������ �����ϱ� ����
		// ContactDAOImple �����ڸ� �ҷ�����
		// ���� ��ο� ������ �����Ѵ�.
		initDataDir();
		initDataFile();
	}

	// 3. public static �ڱ��ڽ��� �����ϴ� �޼ҵ�
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}

	// �ɹ� ����(�ʵ�)
	public ArrayList<ContactVO> list; // list�� ����ϱ� ������ �ν��Ͻ��� ����
	
	// �����͸� ������ ������ ���� �̸� ����
	private static final String DATA_DIR = "data"; // �����
	private static final String DATA_FILE = "contact.data";
	
	
	// ������ ������ ������ ����ϴ� File ��ü ����
	private File dataDir;
	private File dataFile;
	
	public int getSize() {
		return list.size();
	}
	
	// TODO : ������ ������ �ִ� �� �˻��ϰ�, ������ ���� ����
	private void initDataDir() {
		dataDir = new File(DATA_DIR);
		System.out.println("���� ��� : " + dataDir.getPath());
		System.out.println("���� ��� : " + dataDir.getAbsolutePath());
		
		if(!dataDir.exists()) { // ������ ������
			if(dataDir.mkdir()) {
				System.out.println("<���� ���� ����>");
			} else {
				System.out.println("<���� ���� ����>");
			}
		} else { // ������ ������
			System.out.println("<������ �̹� ����>");
		}
		
	} // end initDataDir()
	
	// TODO : ������ ������ �ִ� �� ���� �� �˻��ϰ�,
	// ���� ���, ArrayList �ν��Ͻ��� ����(list = new ArrayList();)
	// �ִ� ���, ���Ͽ��� �����͸� �о ArrayList�� ä��
	private void initDataFile() {
		String filePath = DATA_DIR + File.separator + DATA_FILE;
		dataFile = new File(filePath);
		System.out.println("���� ��� : " + dataFile.getPath());
		System.out.println("���� ��� : " + dataFile.getAbsolutePath());
		
		if(!dataFile.exists()) { // ������ ������ ������
			System.out.println("<���ο� ������ ���� ����>");
			list = new ArrayList<ContactVO>();
		} else { // ������ ������ ������
			System.out.println("<���� ������ ����>");
			readDataFromfile();
		}
	} // end initDataFile()
	
	// TODO : FileInputStream, BufferedInputStream, ObjectInputStream
	// �� ����Ͽ� data\contact.data ���Ͽ��� ArrayList ��ü�� �����͸� �о
	// ��� ���� list�� ����
	// �޼ҵ� �ϼ� �� initDataFile()���� ȣ��
	private void readDataFromfile() {
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
//			in = new FileInputStream("data/contact.data");
			in = new FileInputStream(dataFile);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
						
			list = (ArrayList<ContactVO>) oin.readObject();
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} // end readDataFromfile()
	
	// TODO : FileOutputStream, BufferedOutputStream, ObjectOutputStream
	// �� �̿��Ͽ� ��� ���� list�� ������ data\contact.data ���Ͽ� ��
	// �޼ҵ� �ϼ� �� insert(), update(), delete()���� ȣ��
	private void writeDataToFile() {
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream(dataFile);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(list);
			// ����� ��Ȳ�� list�� contact.data�� �����Ѵ�.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} // end writeDataToFile()
	
	

	@Override
	public int insert(ContactVO vo) {
		System.out.println(className + " - insert()");
		System.out.println("vo data - " + vo);		
		list.add(vo);
		// �ٲ� ������ ���Ͽ� ��
		writeDataToFile();
		return 1;
	}

	@Override
	public ArrayList<ContactVO> select() {
		return list;
	}

	@Override
	public ContactVO select(int index) {
		if (index >= 0 && index < list.size()) {
			return list.get(index);
		} else {
			return null;			
		}
	}

	@Override
	public int update(int index, ContactVO vo) {
		if (index >= 0 && index < list.size()) {
			list.set(index, vo);
			writeDataToFile();
			return 1;
		} else {
			return 0;			
		}
	}
	
	@Override
	public int delete(int index) {
		if (index >= 0 && index < list.size()) {
			list.remove(index);
			writeDataToFile();
			return 1;
		} else {
			return 0;			
		}
	}

} // end ContactDAOImple


















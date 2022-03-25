package pert4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	ResultSet rs;
	JComboBox<String> combo;
//	public Main() {
//		// TODO Auto-generated constructor stub
		dbConnection db = new dbConnection();
//
//		//Insert statement source code method ada di dbconnection.java;
////		db.insertuser("Elvin", "123", "AA001");
////		db.insertuser("Vincent", "123", "AA002");
//		
////		Select statement source code methoda da di dbconnection.java
//		rs = db.selectalluser();
//		Vector<Vector<Object>> records = new Vector<>();
//		
//		try {
//			while (rs.next()) {
//				Vector<Object> record = new Vector<Object>();				
//				record.add(rs.getObject(1));
//				record.add(rs.getObject(2));
//				record.add(rs.getObject(3));
//				record.add(rs.getObject(4));
//				records.add(record);
//				System.out.println("Passwordnya adalah: " + rs.getObject("PASSWORD"));
//				System.out.println("addressIdnya adalah: " + rs.getObject(4));
//				System.out.println("Namanya adalah " + rs.getObject(1));
//				
//				System.out.println("=================================\n");
//				for (Vector<Object> vector: records) {
//					for (Object object : vector) {
//						System.out.println(object);
//					}
//				}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//Update username, password
////		db.updateUser("Elvin Sestomi", "elvin123", 2);
//		
//		//Delete user
////		db.deleteAddress("AA003");
//		
//		Vector<String> column = new Vector<String>();
//		column.add("username");
//		column.add("Password");
//		column.add("UserId");
//		column.add("AddressId");
//		
//		DefaultTableModel tm = new DefaultTableModel(records, column);
//		JTable table = new JTable(tm) {
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
//		table.getTableHeader().setReorderingAllowed(false);
//		JScrollPane jsp = new JScrollPane(table);
//		
//		add(jsp);
//		
//		setVisible(true);
//		setResizable(false);
//		setTitle("Contoh Jtable");
//		setSize(500,200);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//	}
	
	public Main() {
		
		
		combo = new JComboBox<>(new Vector<String>(db.getIduser()));
		
		add(combo);
		
		
		
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = String.valueOf(combo.getSelectedItem().toString());
				System.out.println("Ini id" + id);
				db.getDatauser(id);
			}
		});
		
		add(submit);
		
		setVisible(true);
		setResizable(false);
		setTitle("Contoh JCombobox");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

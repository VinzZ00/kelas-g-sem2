package Pert2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class loginPage extends JFrame {

	JLabel header;
	JPanel north, center, south;
	
	JLabel Username, Password;
	JTextField usernameField;
	JPasswordField passField;
	
	JButton Login;
	
	public loginPage() {
		
		//header
		header = new JLabel("Login Page");
		header.setFont(new Font("Serif", Font.BOLD, 30));
		
		north = new JPanel();
		north.add(header);
		
		//body
		center = new JPanel(new GridLayout(2,2,0,10));
		
		Username = new JLabel("User Name");
		Password = new JLabel("Password");
		
		usernameField = new JTextField();
		passField = new JPasswordField();
		passField.setEchoChar('*');
		
		center.add(Username);		
		center.add(usernameField);		
		center.add(Password);		
		center.add(passField);
		
		center.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.black), "Form", TitledBorder.LEFT, TitledBorder.ABOVE_TOP));
		
		//south 
		south = new JPanel();
		
		Login = new JButton("LOGIN");
		
		Login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String username = usernameField.getText();
				String password = String.valueOf(passField.getPassword());
				
				System.out.println(username);
				System.out.println(password);
			}
		});
		
		south.add(Login);
		
		
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setVisible(true);
		setTitle("Login Page");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] Args) {
		new loginPage();
	}
}

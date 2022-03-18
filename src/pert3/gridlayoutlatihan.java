package pert3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gridlayoutlatihan extends JPanel implements ActionListener{
	
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	Font font = new Font("Serif", Font.PLAIN, 25);
	
	public gridlayoutlatihan() {
		// TODO Auto-generated constructor stub
		init();
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		
//		getContentPane().setBackground(Color.black);
		setBackground(Color.black);
		
//		setVisible(true);
//		setResizable(false);
//		setTitle("LearnAboutLayout");
//		setSize(500,500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3, 10, 10));
//		setLocationRelativeTo(null);
		
	}

	private void init() {
		// TODO Auto-generated method stub
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		
		button5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				button5.setBackground(Color.blue);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ini di mouse press");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				button5.setBackground(Color.gray);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				button5.setBackground(Color.gray.darker());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
//				if (e.getSource() == button5) {
					button5.setText("Ini button 5");	
//				}
			}
		});
		
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);
		button5.setFont(font);
		button6.setFont(font);
		button7.setFont(font);
		button8.setFont(font);
		button9.setFont(font);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			button1.setText("Ini button 1");
		}
		if (e.getSource() == button2) {
			button2.setText("Ini button 2");
		}
		if (e.getSource() == button3) {
			button3.setText("Ini button 3");
		}
		if (e.getSource() == button4) {
			button4.setText("Ini button 4");
		}
		
		if (e.getSource() == button6) {
			
		}
		if (e.getSource() == button7) {
			
		}
		if (e.getSource() == button8) {
			
		}
		if (e.getSource() == button1) {
			
		}
	}
	
	
}

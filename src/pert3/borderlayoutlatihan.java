package pert3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class borderlayoutlatihan extends JPanel {

	JButton[] arrbutton = new JButton[5];
	JPanel center;
	
	JButton north, south, east, west;
	public borderlayoutlatihan() {
		// TODO Auto-generated constructor stub
		init();
		setLayout(new BorderLayout(10,10));
		
		JTextField field = new JTextField();
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println(field.getText());
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println(field.getText());
				}
			}
		});
		
		add(arrbutton[0], BorderLayout.NORTH);
		add(arrbutton[1], BorderLayout.EAST);
		add(arrbutton[2], BorderLayout.WEST);
		add(field, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
		
//		BorderLayout bl = (BorderLayout) this.getLayout();
//		bl.setHgap(20);
//		bl.setVgap(20);
		
	
		
//		setVisible(true);
//		setResizable(false);
//		setTitle("LearnAboutLayout");
//		setSize(500,500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new BorderLayout());
//		setLocationRelativeTo(null);
		
	}
	
	private void init() {
		// TODO Auto-generated method stub
		
		center = new JPanel(new BorderLayout(10,10));
		center.setBorder(new EmptyBorder(10,10,10,10));
		south = new JButton("South");
		north = new JButton("North");
		east = new JButton("East");
		west = new JButton("West");
		
		arrbutton[0] = new JButton("NORTH");
		arrbutton[1] = new JButton("EAST");
		arrbutton[2] = new JButton("WEST");
		arrbutton[3] = new JButton("CENTER");
		arrbutton[4] = new JButton("SOUTH");
		
		center.add(south, BorderLayout.SOUTH);
		center.add(arrbutton[3], BorderLayout.CENTER);
		center.add(east, BorderLayout.EAST);
		center.add(west, BorderLayout.WEST);
		center.add(north, BorderLayout.NORTH);
	}

}

package pert3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowlayoutlatihan extends JPanel{
	
//	JFrame flowlayout = new JFrame(); 
	JButton[] but = new JButton[26];
	
	public flowlayoutlatihan() {
		// TODO Auto-generated constructor stub
		
		for (int i = 0; i < but.length; i++) {
			but[i] = new JButton(String.valueOf(i+1));
			but[i].setPreferredSize(new Dimension(75,30));
		}
		
		for (JButton jButton : but) {
			add(jButton);
		}
		
//		flowlayout.setVisible(true);
//		flowlayout.setResizable(false);
//		flowlayout.setTitle("LearnAboutLayout");
//		flowlayout.setSize(500,500);
//		flowlayout.setDefaultCloseOperation(flowlayout.EXIT_ON_CLOSE);
////		FlowLayout fl = ;
////		fl.setHgap(20);
//		flowlayout.setLayout(new FlowLayout(FlowLayout.RIGHT,20,0));
//		flowlayout.setLocationRelativeTo(null);
		
	}

}

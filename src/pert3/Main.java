package pert3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main extends JFrame{

	JPanel grid = new gridlayoutlatihan();
	JPanel border = new borderlayoutlatihan();
	JPanel flow = new flowlayoutlatihan();
	
	JTabbedPane tab = new JTabbedPane();
	
	public Main() {
		// TODO Auto-generated constructor stub
//		new gridlayoutlatihan();
//		new borderlayoutlatihan();
//		new flowlayoutlatihan();
		
		tab.add(grid, "Ini Grid layout");
		tab.add(border, "Ini border layout");
		tab.add(flow, "Ini flowlayout");
		
		add(tab);
		
		setVisible(true);
		setResizable(false);
		setTitle("Learn 3 layout");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

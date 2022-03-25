package latihanPert5;

import pert5.ThreadA;

public class Main {

	int a = 0, b = 10;
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		Thread train1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					a = i;
					System.out.println("Detik ke " + i);
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread train2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 10; i > 0; i--) {
					b = i;
					System.out.println("ini train b detik ke " + i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread checker = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
//				int scond = 0;
				do {
					int train1 = a;
					int train2 = b; 
					System.out.println(a + " , " + b); 
					if (train1 == train2) {
						System.out.println("Di detik ke " + a);
						System.exit(0);
					}
				} while (true);
			}
		});
		checker.setDaemon(true);
		
		checker.start();
		train1.start();
		train2.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

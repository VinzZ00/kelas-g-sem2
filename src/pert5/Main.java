package pert5;

import java.util.Scanner;

public class Main {

	Scanner	sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		
		Thread Ascending = new ThreadA(sc);
		Thread Descending = new Thread(new ThreadB());
		Descending.setDaemon(true);
		Thread daemon = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					System.out.println("Ini Daemon Thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Ascending.start();
		try {
			Ascending.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Descending.start();
		daemon.setDaemon(true);
		daemon.start();
		
		System.out.println("Print");
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Ascending ke-" + i);
////			if (i == 5) {
////				int[] input = new int[2];
////				for (int j = 0; j < input.length; j++) {
////					System.ou	t.print("Masukan angka:");
////					input[j] = sc.nextInt(); sc.nextLine();
////				}
////				int hasil  = input[0]/input[1];
////				System.out.println("hasil pembagian 2 input anda adalah " + hasil);
////				
////			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
//		for (int i = 10; i > 0; i--) {
//			System.out.println("Ini descending ke-" + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

package pert5;

import java.util.Scanner;

public class ThreadA extends Thread {

	Scanner sc;
	
	public ThreadA(Scanner sc) {
		// TODO Auto-generated constructor stub
		this.sc = sc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Ascending ke-" + i);
			//Simulasi error
			if (i == 5) {
				stop();
//				interrupt();
//				int[] input = new int[2];
//				for (int j = 0; j < input.length; j++) {
//					System.out.println("Masukan angka:");
//					input[j] = sc.nextInt(); sc.nextLine();
//				}
//				int hasil  = input[0]/ input[1];
//				System.out.println("hasil pembagian 2 input anda adalah " + hasil);
//				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Ascending Selesai");
	}	
}

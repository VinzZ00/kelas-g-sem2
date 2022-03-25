package pert5;



public class ThreadB implements Runnable{

	public ThreadB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 10; i > 0; i--) {
			System.out.println("Ini descending ke-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Descending Selesai");
	}

}

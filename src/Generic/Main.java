package Generic;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		Anumber<Integer> numberinteger = new Anumber<Integer>(10);
		System.out.println(numberinteger.object1);
		float a = (float) 2.5;
		Anumber<Float> floatNumber = new Anumber<Float>(a);
		System.out.println(numberinteger.addition(floatNumber));
		
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}

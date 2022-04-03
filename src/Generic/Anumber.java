package Generic;

public class Anumber <T extends Number> {

	T object1;
	
	
	public Anumber(T object1) {
		// TODO Auto-generated constructor stub
		this.object1 = object1;
	}

	public Integer addition(Anumber<T> b) {
		
		int c = object1.intValue() + b.object1.intValue();
			
		return c ;
	}
	
}

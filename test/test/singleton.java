package test;

public class singleton {
	private  static singleton singletonObject = new singleton();
	private singleton() {
		
	}
	public static singleton getIstance() {
		if(singletonObject==null) {
			singletonObject = new singleton();
		}
		return singletonObject;
	}
	
}

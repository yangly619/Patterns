package test;

public class demo {
	public static void main(String[] args) {
		//singleton s = singleton.getIstance();
		prototype p1 = new prototype("01","typ21");
		prototype p2 = p1.clone();
		System.out.println(p2.getType());
	
	   }
}

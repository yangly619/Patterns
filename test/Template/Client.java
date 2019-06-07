package Template;

public class Client {
	public static void main(String[] args) {
		bankTemplate t = new extractTransca(); 
		t.process();
		bankTemplate t2 = new ingresarTransac(); 
		t.process();
	}
}

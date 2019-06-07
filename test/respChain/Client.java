package respChain;

public class Client {
	public static void main(String[] args) {
		Request r = new Request("yang",11,"ill");
		Handle h1 = new Handle01();
		Handle h2 = new Handle02();
		h1.setNext(h2);
		h1.handleRequest(r);
	}
}

package state;

public class Client {
	public static void main(String[] args) {
		Context c = new Context();
		c.setState(new freeState());
		c.setState(new reserved());
		
	}
}

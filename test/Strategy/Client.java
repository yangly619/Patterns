package Strategy;

public class Client {
	public static void main(String[] args) {
		IStrategy st1 = new halfPriceStrategy();
		IStrategy st2 = new nonDiscountStrategy();
		
		context c = new context(st1);
		c.getPrice(200);
		c.setStrategy(st2);
		c.getPrice(200);
		
	}
}

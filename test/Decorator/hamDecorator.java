package Decorator;

public class hamDecorator extends PancakeDecorator {

	public hamDecorator(Ipancake p) {
		super(p);
	}
	public void cook() {
		System.out.println("加了一根火腿 ");
		super.cook();
	}

}

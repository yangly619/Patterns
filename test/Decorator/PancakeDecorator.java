package Decorator;

public class PancakeDecorator implements Ipancake {
	private Ipancake p;
	public PancakeDecorator(Ipancake p) {
		this.p = p;
	}

	@Override
	public void cook() {
		p.cook();
		
	}

}

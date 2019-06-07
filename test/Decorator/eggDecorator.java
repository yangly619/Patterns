package Decorator;

public class eggDecorator extends PancakeDecorator {

	public eggDecorator(Ipancake p) {
		super(p);
	}
	public void cook() {
		System.out.println("加了一个鸡蛋，");
        super.cook();
	}
}

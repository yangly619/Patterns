package Decorator;

public class Client {
	public static void main(String[] args) {
		pancake p = new pancake();
		PancakeDecorator egg = new eggDecorator(new hamDecorator(p));
		egg.cook();
	}
}

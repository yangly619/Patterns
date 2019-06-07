package Observer;

public class Client {
	public static void main(String[] args) {
		Observer ob1 = new observer1("ob1");
		Observer ob2 = new observer1("ob2");
		Subject sub = new Subject("sub");
		sub.registerObs(ob1);
		sub.registerObs(ob2);
		sub.changeState("newname");
		
	}
}

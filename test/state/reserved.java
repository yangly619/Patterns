package state;

public class reserved  implements State {

	@Override
	public void handle() {
		System.out.println("now is reserved ");
		
	}

}
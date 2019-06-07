package Observer;

public class observer1 extends Observer {
	private String name;
	
	public observer1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void update(String name) {
		System.out.println("obs1 is updated");
		this.name = name;
		System.out.println(getName());
	}

}

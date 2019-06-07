package Observer;

public class observer2 extends Observer  {
private String name;
	
	public observer2 (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void update(String name) {
		System.out.println("obs2 is updated");
		this.name = name;
		System.out.println(getName());
	}

}

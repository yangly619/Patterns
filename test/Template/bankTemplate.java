package Template;

public abstract class bankTemplate {
	//具体方法
	public void takeNumber() {
		System.out.println("take a number: ");
	}
	//钩子方法， 办理具体业务
	public abstract void transact();
	
	public void evaluate() {
		System.out.println("feedback: ");
	}
	//模版方法， 把基本操作组合到一起，子类一般不能重写
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}

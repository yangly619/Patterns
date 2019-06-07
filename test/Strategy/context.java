package Strategy;
/*
 * 处理策略
 */

public class context {
	private IStrategy strategy;
	//构造器注入
	public context( IStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void setStrategy (IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void getPrice(double standardP) {
		this.strategy.getPrice(standardP); 
	}
}

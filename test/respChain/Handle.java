package respChain;

public abstract class Handle {
	public abstract void handleRequest(Request request);
	//便于子类访问
	protected Handle nextHandle;
	
	
	
	public void setNext(Handle nextHandle) {
		this.nextHandle = nextHandle;
	}
	
	
}

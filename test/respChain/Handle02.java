package respChain;

public class Handle02 extends Handle {
	

	@Override
	public void handleRequest(Request r) {
		if(r.getLeave_days() < 10) {
			System.out.println("request accepted");
		}else
			if(this.nextHandle != null) {
				System.out.println("pass to next");
				this.nextHandle.handleRequest(r);
			}else 
				System.out.println("can not handle");
	}
	

}
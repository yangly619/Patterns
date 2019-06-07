package respChain;

public class Request {
	private String empNum;
	private int leave_days;
	private String reason;
	
	public Request(String empNum, int leave_days, String reason) {
		super();
		this.empNum = empNum;
		this.leave_days = leave_days;
		this.reason = reason;
	}
	
	public String getEmpNum() {
		return empNum;
	}
	
	public int getLeave_days() {
		return leave_days;
	}
	
	public String getReason() {
		return reason;
	}
	
	
}

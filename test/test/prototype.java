package test;

public class prototype implements Cloneable {
	private String id;
	private String type;
	
	public String getType(){
	      return type;
	   }
	   
	   public String getId() {
	      return id;
	   }
	   
	   public void setId(String id) {
	      this.id = id;
	   }
	   public prototype(String id,String type) {
		   this.id = id;
		   this.type =type;
	   }
	public prototype clone() {
		prototype clone = null;
	      
	    try {
			clone = (prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	      return clone;
	   
	}
}

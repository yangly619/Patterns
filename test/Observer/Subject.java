package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private String name;
	public Subject(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	private List<Observer> obs_list = new ArrayList<Observer>();
	public Subject() {
		
	}
	public void registerObs(Observer obs) {
		obs_list.add(obs);
	}
	
	public void removeObs(Observer obs) {
		obs_list.remove(obs);
	}
	
	public void changeState(String newName) {
		this.name = newName;
		notifyAllObs(newName);
	}
	
	public void notifyAllObs(String name) {
		for (Observer ob : obs_list) {
			ob.update(name);
		}
	}
	
}

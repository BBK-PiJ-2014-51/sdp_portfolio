package observer;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Commentary, Subject {

	private String commentary;
	private String eventDetails;
	private List<Observer> observers;
	
	public CommentaryObject(ArrayList<Observer> observers, String event) {
		this.eventDetails = event;
		this.observers = observers;
	}

	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob: observers){
			ob.update(commentary);
		}

	}

	@Override
	public String subjectDetails() {
		return eventDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.commentary = desc;
		notifyObservers();
	}

}

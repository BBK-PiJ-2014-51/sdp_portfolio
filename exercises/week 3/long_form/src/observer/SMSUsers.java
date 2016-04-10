package observer;

public class SMSUsers implements Observer {

	private Subject subject;
	private String handle;
	private String msg;
	
	public SMSUsers(Subject subject, String name) {
		this.handle = name;
		this.subject = subject;
	}

	@Override
	public void update(String desc) {
		this.msg = desc;
		System.out.print(handle);
		System.out.print(" - " + msg);
	}

	@Override
	public void subscribe() {
		subject.subscribeObserver(this);

	}

	@Override
	public void unSubscribe() {
		subject.unSubscribeObserver(this);
	}

}

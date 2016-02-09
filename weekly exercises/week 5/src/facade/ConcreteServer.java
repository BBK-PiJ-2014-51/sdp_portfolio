package facade;

public class ConcreteServer implements ScheduleServer {

	@Override
	public void startBooting() {
		System.out.println("booting");

	}

	@Override
	public void readSystemConfigFile() {
		System.out.println("reading");

	}

	@Override
	public void init() {
		System.out.println("init");

	}

	@Override
	public void initializeContext() {
		System.out.println("init context");

	}

	@Override
	public void initializeListeners() {
		System.out.println("init listeners");

	}

	@Override
	public void createSystemObjects() {
		System.out.println("creating objects");

	}

	@Override
	public void releaseProcesses() {
		System.out.println("releasing");

	}

	@Override
	public void destory() {
		System.out.println("destroying");

	}

	@Override
	public void destroySystemObjects() {
		System.out.println("destroying more");

	}

	@Override
	public void destoryListeners() {
		System.out.println("destroying again");

	}

	@Override
	public void destoryContext() {
		System.out.println("still destroying");

	}

	@Override
	public void shutdown() {
		System.out.println("shutting down");

	}

}

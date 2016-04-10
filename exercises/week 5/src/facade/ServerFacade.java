package facade;

public class ServerFacade {
	private ScheduleServer server;
	
	public ServerFacade(){
		this.server = new ConcreteServer();
	}
	
	public void start(){
		server.startBooting();
		server.readSystemConfigFile();
		server.init();
		server.initializeContext();
		server.initializeListeners();
		server.createSystemObjects();
	}
	
	public void stop(){
		server.releaseProcesses();
		server.destory();
		server.destroySystemObjects();
		server.destoryListeners();
		server.destoryContext();
		server.shutdown();
	}
	
	
}

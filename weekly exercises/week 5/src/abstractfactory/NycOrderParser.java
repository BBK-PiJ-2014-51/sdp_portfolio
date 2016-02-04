package abstractfactory;

public class NycOrderParser implements XMLParser {

	String factoryMsg;
	
	public NycOrderParser(String string) {
		factoryMsg = string;
	}

	@Override
	public String parse() {
		return factoryMsg + "\nNYC Order XML Message";		
	}

}

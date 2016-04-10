package abstractfactory;

public class LondonFeedbackParser implements XMLParser {

	String factoryMsg;
	
	public LondonFeedbackParser(String string) {
		factoryMsg = string;
	}

	@Override
	public String parse() {
		return factoryMsg + "\nLondon Feedback XML Message";		
	}
}

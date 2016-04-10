package abstractfactory;

public class LondonFactoryParser implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		if(parserType.equals("LondonFEEDBACK"))			
			return new LondonFeedbackParser("London Parsing feedback XML...");
		
		return null;
	}

}

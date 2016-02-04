package abstractfactory;

public class NYCFactoryParser implements AbstractParserFactory{

	@Override
	public XMLParser getParserInstance(String parserType) {
		if(parserType.equals("NYCORDER"))			
			return new NycOrderParser("NYC Parsing order XML...");
		
		return null;
	}

}

package abstractfactory;

public class ParserFactoryProducer {

	public static AbstractParserFactory getFactory(String string) {
		if(string.equals("NYCFactory"))
			return new NYCFactoryParser();
		else if(string.equals("LondonFactory"))
			return new LondonFactoryParser();
		return null;
	}

}

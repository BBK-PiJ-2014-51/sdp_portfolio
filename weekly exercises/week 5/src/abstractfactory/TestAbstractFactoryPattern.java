package abstractfactory;

public class TestAbstractFactoryPattern {

	/*
	  A factory pattern can be used to encapsulate the bits that create instances.
	  An abstract factory pattern is useful when the factory itself should be abstract, not
	  just the object it is creating.
	 
	 */
	public static void main(String[] args) {
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
		XMLParser parser = parserFactory.getParserInstance("NYCORDER");
		String msg = "";
		msg = parser.parse();
		System.out.println(msg);
		System.out.println("************************************");
		parserFactory = ParserFactoryProducer.getFactory("LondonFactory");
		parser = parserFactory.getParserInstance("LondonFEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
	}
	
	/* expected output
	 
	 	NYC Parsing order XML...
		NYC Order XML Message
		************************************
		London Parsing feedback XML...
		London Feedback XML Message
	 
	 */

}

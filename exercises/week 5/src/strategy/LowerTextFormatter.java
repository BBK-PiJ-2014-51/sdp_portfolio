package strategy;

public class LowerTextFormatter implements TextFormatter{

	@Override
	public String formatText(String text) {		
		return text.toLowerCase();
	}

}

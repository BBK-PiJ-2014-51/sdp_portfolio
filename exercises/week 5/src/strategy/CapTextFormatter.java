package strategy;

public class CapTextFormatter implements TextFormatter{

	@Override
	public String formatText(String text) {		
		return text.toUpperCase();
	}

}

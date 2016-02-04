package strategy;

public class TextEditor implements TextPublisher {

	TextFormatter formatter;
	
	public TextEditor(TextFormatter formatter){
		this.formatter = formatter;
	}
	
	@Override
	public void publishText(String text) {
		System.out.println(formatter.formatText(text));
	}

}

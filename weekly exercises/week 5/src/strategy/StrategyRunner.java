package strategy;

public class StrategyRunner {

	/**
	 * Demonstrates the strategy pattern
	 * The strategy pattern works by declaring a local member type which will be instantiated by a sub class
	 * which will handle the desired functionality.
	 * The strategy pattern is useful for adding functionality to existing classes without modifying them.
	 * @param args
	 */
	public static void main(String[] args) {
		TextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing text in caps formatter");
		formatter = new LowerTextFormatter();
		editor = new TextEditor(formatter);
		editor.publishText("Testing text in lower formatter");
	}

}

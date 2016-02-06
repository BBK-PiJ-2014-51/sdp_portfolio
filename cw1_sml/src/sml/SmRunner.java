package sml;

public class SmRunner {

	public static void main(String[] args) {
        
		String test = "test3.sml";
        
 
        Machine m = new Machine();
        Translator t = new Translator(test);
        t.readAndTranslate(m.getLabels(), m.getProg());
//
//        Labels labels = m.getLabels();
//        for (String label: labels){
//        	
//        }
        
        System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        System.out.println(m);

        System.out.println("Beginning program execution.");
        m.execute();
        System.out.println("Ending program execution.");

        System.out.println("Values of registers at program termination:");
        System.out.println(m.getRegisters() + ".");
        
	}

}

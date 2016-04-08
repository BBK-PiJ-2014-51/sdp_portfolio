package test;

import sml.Machine;
import sml.Translator;

public class SmRunner {

	public static void main(String[] args) {

		String scriptPath = "test/test2.sml";


        Machine m = new Machine();
        Translator t = new Translator(scriptPath);
        t.readAndTranslate(m.getLabels(), m.getProg());


        System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        System.out.println(m);

        System.out.println("Beginning program execution.");
        m.execute();
        System.out.println("Ending program execution.");

        System.out.println("Values of registers at program termination:");
        System.out.println(m.getRegisters() + ".");

	}

	public Machine testSmlScript(String scriptPath) {

		Machine m = new Machine();
        Translator t = new Translator(scriptPath);

        t.readAndTranslate(m.getLabels(), m.getProg());
        m.execute();

        return m;
	}



}

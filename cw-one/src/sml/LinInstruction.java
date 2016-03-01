package sml;

/**
 * This class ....
 *
 * @author someone
 */

public class LinInstruction extends Instruction {
	
	public LinInstruction(String label, int result, int op1, int op2, String l2) {
        super(label, "lin", result, op1, op2, l2);

    }

    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(result, op1);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + result + " value is " + op1;
    }
}

package sml;

/**
 * This class ....
 *
 * @author someone
 */

public class AddInstruction extends Instruction {

    public AddInstruction(String label, int result, int op1, int op2, String l2) {
        super(label, "add", result, op1, op2, l2);

    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 + value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " + " + op2 + " to " + result;
    }
}

package sml;

public class OutInstruction extends Instruction {
	

	public OutInstruction(String label, int result, int op1, int op2) {
        super(label, "out", result, op1, op2);

    }

    @Override
    public void execute(Machine m) {
    	op1 = m.getRegisters().getRegister(result);
        System.out.println(op1);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + result + " value is " + op1;
    }

}

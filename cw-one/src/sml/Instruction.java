package sml;

/**
 * This class is the superclass of the classes for machine instructions
 *
 * @author someone
 */

public abstract class Instruction {
    protected String label;
    protected String opcode;
    
    protected int result;
    protected int op1;
    protected int op2;
    protected String l2;
    
    private static Class[] parameterTypes = null;
    
    public Instruction(String l, String op, int reg, int op1, int op2, String l2) {
        this.label = l;
        this.opcode = op;
        this.result = reg;
        this.op1 = op1;
        this.op2 = op2;
        this.l2 = l2;
        
    }

    // = the representation "label: opcode" of this Instruction
    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    // Execute this instruction on machine m.
    public abstract void execute(Machine m);

	public static Class[] getParameterTypes() {
		if (parameterTypes == null){
			parameterTypes = new Class[5];
			parameterTypes[0] = String.class;
			parameterTypes[1] = int.class;
			parameterTypes[2] = int.class;
			parameterTypes[3] = int.class;
			parameterTypes[4] = String.class; 
		}
		
		return parameterTypes;
	}
}

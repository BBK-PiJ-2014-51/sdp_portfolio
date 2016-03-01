package sml;

public class BnzInstruction extends Instruction {

	public BnzInstruction(String label, int result, int op1, int op2, String l2) {
        super(label, "bnz", result, op1, op2, l2);
	}

	@Override
	public void execute(Machine m) {
		if(result != 0){
			Labels inSet = m.getLabels();
			System.out.println(inSet);
			System.out.println(l2);
			System.out.println(inSet.indexOf(l2));
			m.setPc(inSet.indexOf(l2));
			Instruction ins = m.getProg().get(m.getPc());
			ins.execute(m);
			System.out.println(m.getPc());
		}
	}
	
	@Override
    public String toString() {
		String toString = "s1 is ";
		if (result != 0)
			toString += "not ";
		toString += "0";
		if(result != 0)
			toString += " so branching to instruction " + l2;
		else
			toString += " so moving to next instruction";
		
        return super.toString() + " " + toString;
    }

}

package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sml.Machine;

public class SmlMultInstScriptsTest {
	
	private SmRunner scriptRunner;
	private ByteArrayOutputStream outStream;

	@Before
	public void setUp() throws Exception {
		scriptRunner = new SmRunner();
		outStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outStream));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(null);
	}

	@Test
	public void testBnzResult(){
		Machine m = scriptRunner.testSmlScript("test/basicBnz.sml");
		assertEquals(m.getRegisters().getRegister(1), 10000);
	}
	
	@Test
	public void testBnzCounter(){
		Machine m = scriptRunner.testSmlScript("test/basicBnz.sml");
		assertEquals(m.getRegisters().getRegister(3), 0);
	}
	
	@Test
	public void testKeithsFactorialProgram(){
		Machine m = scriptRunner.testSmlScript("test/test2.sml");
		int result = Integer.parseInt(outStream.toString().substring(0, 3));
		assertEquals(result, 720);
	}

}
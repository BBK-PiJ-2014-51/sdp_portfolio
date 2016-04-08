package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sml.Machine;
import sml.Translator;

public class SmlSimpleInstScriptsTest {

	private SmRunner scriptRunner = new SmRunner();
	
	private ByteArrayOutputStream outStream;

	@Before
	public void setUp() throws Exception {
		outStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outStream));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(null);
	}

	@Test
	public void testAdd(){
		Machine m = scriptRunner.testSmlScript("test/basicAdd.sml");
		assertEquals(m.getRegisters().getRegister(3), 4);
	}

	@Test
	public void testSub(){
		Machine m = scriptRunner.testSmlScript("test/basicSub.sml");
		assertEquals(m.getRegisters().getRegister(3), 2);
	}

	@Test
	public void testMul(){
		Machine m = scriptRunner.testSmlScript("test/basicMul.sml");
		assertEquals(m.getRegisters().getRegister(4), 35);
	}

	@Test
	public void testDiv(){
		Machine m = scriptRunner.testSmlScript("test/basicDiv.sml");
		assertEquals(m.getRegisters().getRegister(5), 21);
	}

	@Test
	public void testLin(){
		Machine m = scriptRunner.testSmlScript("test/basicLin.sml");
		assertEquals(m.getRegisters().getRegister(1), 101);
	}

	@Test
	public void testOut(){
		Machine m = scriptRunner.testSmlScript("test/basicOut.sml");
		int result = Integer.parseInt(outStream.toString().substring(0, 2));
		assertEquals(result, 39);
	}

}

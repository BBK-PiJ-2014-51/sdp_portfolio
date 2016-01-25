package Adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class XpaytoPayDAdapterTest {

	@Test
	public void test() {
		XpaytoPayDAdapter a = new XpaytoPayDAdapter();
		a.setCardCVVNo((short) 12);
		short sh = a.getCardCVVNo();
		assertEquals(12, sh);
		
		a.setCardExpYear("12");
		String yr = a.getCardExpYear();
		assertEquals("12", yr);
	}

}

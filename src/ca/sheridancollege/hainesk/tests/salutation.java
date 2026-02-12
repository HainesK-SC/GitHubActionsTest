package ca.sheridancollege.hainesk.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class salutation {
	public String sayGoodbye()
	{
		return "Goodbye";
	}
	
	@Test
	public void testSayGoodbye()
	{
		salutation s = new salutation();
		assertEquals("Goodbye", s.sayGoodbye());
	}
}

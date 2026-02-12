package ca.sheridancollege.hainesk.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testGreet {

	public String greet()
	{
		return "Hello";
	}

	
	@Test
	public void testGreetMethod()
	{
		testGreet tg = new testGreet();
		assertEquals("Hello!", tg.greet());
	}

}

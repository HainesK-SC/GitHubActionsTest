package ca.sheridancollege.hainesk.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPassword {
	public static boolean checkLength(String password)
	{
		boolean result = false;
		if(password.length() > 8)
		{
			result = true;
		}
		return result;
	}
	
	@Test
	public void testPasswordLenGood()
	{
		System.out.println("Testing PasswordLenGood");
		String password = "12345678910";
		assertTrue(TestPassword.checkLength(password));
	}
	
	@Test
	public void testPasswordLenBad()
	{
		System.out.println("Testing PasswordLenBad");
		String password = "1234567";
		assertFalse(TestPassword.checkLength(password));
	}
	
	@Test
	public void testPasswordLenBoundary()
	{
		System.out.println("Testing PasswordLenBoundary");
		String password = "12345678";
		assertFalse(TestPassword.checkLength(password));
	}
}

package edu.luc.cs.laufer.cs313.occurences;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.luc.cs.laufer.cs313.occurences.DefaultToken;
import edu.luc.cs.laufer.cs313.occurences.Token;

/**
 * @author laufer
 * 
 */
public class TestDefaultToken {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.DefaultToken#DefaultToken(java.lang.String, int)}.
	 */
	@Test
	public void testDefaultToken() {
		new DefaultToken("abc", 5);
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.DefaultToken#DefaultToken(java.lang.String, int)}.
	 */
	@Test
	public void testDefaultTokenNegative() {
		try {
			new DefaultToken("abc", -1);
			fail("expected failed assertion > 0");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.DefaultToken#DefaultToken(java.lang.String, int)}.
	 */
	@Test
	public void testDefaultTokenNull() {
		try {
			new DefaultToken(null, 77);
			fail("expected failed assertion != 0");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.DefaultToken#getLine()}.
	 */
	@Test
	public void testGetWord() {
		Token token = new DefaultToken("abc", 5);
		assertEquals("abc", token.getWord());
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.DefaultToken#getWord()}.
	 */
	@Test
	public void testGetLine() {
		Token token = new DefaultToken("abc", 5);
		assertEquals(5, token.getLine());
	}

}

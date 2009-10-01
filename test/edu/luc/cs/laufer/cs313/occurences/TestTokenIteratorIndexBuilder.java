package edu.luc.cs.laufer.cs313.occurences;

import static edu.luc.cs.laufer.cs313.occurences.Constants.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import edu.luc.cs.laufer.cs313.occurences.DefaultIndexImpl;
import edu.luc.cs.laufer.cs313.occurences.Index;
import edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIndexBuilder;
import edu.luc.cs.laufer.cs313.occurences.Token;
import edu.luc.cs.laufer.cs313.occurences.TokenIteratorIndexBuilder;

/**
 * @author laufer
 * 
 */
public class TestTokenIteratorIndexBuilder {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.TokenIteratorIndexBuilder#TokenIteratorIndexBuilder(java.util.Iterator)}.
	 */
	@Test
	public void testTokenIteratorIndexBuilder() {
		try {
			new StreamTokenizerIndexBuilder(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.TokenIteratorIndexBuilder#build(edu.luc.cs.laufer.cs313.occurences.Index)}.
	 */
	@Test
	public void testBuild() throws Exception {
		Index index = new DefaultIndexImpl();
		TokenIteratorIndexBuilder builder = new TokenIteratorIndexBuilder(index);
		builder.buildFrom(stringToList(s7).iterator());
		assertEquals(s7index, index);
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.TokenIteratorIndexBuilder#build(edu.luc.cs.laufer.cs313.occurences.Index)}.
	 */
	@Test
	public void testBuild2() throws Exception {
		Index index = new DefaultIndexImpl();
		TokenIteratorIndexBuilder builder = new TokenIteratorIndexBuilder(index);
		builder.buildFrom(stringToList(s8).iterator());
		assertEquals(s8index, index);
	}

	/**
	 * Converts a string to a list of tokens.
	 * 
	 * @param string
	 *            the input string
	 * @return the resulting list of tokens
	 */
	private List<Token> stringToList(final String string) {
		// TODO your job
		// follow Main.main but put the tokens into a suitable list
		return null;
	}
}

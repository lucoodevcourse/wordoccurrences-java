package edu.luc.cs.laufer.cs313.occurences;

import static org.junit.Assert.fail;

import org.junit.Test;

import edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIteratorAdapter;

/**
 * @author laufer
 * 
 */
public class TestStreamTokenizerIteratorAdapter {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIteratorAdapter#StreamTokenizerIteratorAdapter(java.io.StreamTokenizer)}.
	 */
	@Test
	public void testStreamTokenizerIteratorAdapter() {
		try {
			new StreamTokenizerIteratorAdapter(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIteratorAdapter}.
	 */
	@Test
	public void testBuild() {
		// TODO your job: create a TIIB, then build the index from a STIA wrapped
		// around a StreamTokenizer
		fail("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIteratorAdapter}.
	 */
	@Test
	public void testBuild2() {
		// TODO your job: see testBuild()
		fail("not yet implemented");
	}

}

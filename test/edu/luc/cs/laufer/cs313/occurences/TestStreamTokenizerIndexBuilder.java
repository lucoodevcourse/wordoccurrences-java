package edu.luc.cs.laufer.cs313.occurences;

import static edu.luc.cs.laufer.cs313.occurences.Constants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.StreamTokenizer;
import java.io.StringReader;

import org.junit.Test;

import edu.luc.cs.laufer.cs313.occurences.DefaultIndexImpl;
import edu.luc.cs.laufer.cs313.occurences.Index;
import edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIndexBuilder;

/**
 * @author laufer
 * 
 */
public class TestStreamTokenizerIndexBuilder {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIndexBuilder#StreamTokenizerIndexBuilder(java.io.StreamTokenizer)}.
	 */
	@Test
	public void testStreamTokenizerIndexBuilder() {
		try {
			new StreamTokenizerIndexBuilder(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIndexBuilder#build(edu.luc.cs.laufer.cs313.occurences.Index)}.
	 */
	@Test
	public void testBuild() {
		Index index = new DefaultIndexImpl();
		StreamTokenizerIndexBuilder builder = new StreamTokenizerIndexBuilder(index);
		builder.buildFrom(new StreamTokenizer(new StringReader(s7)));
		assertEquals(s7index, index);
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs313.occurences.StreamTokenizerIndexBuilder#build(edu.luc.cs.laufer.cs313.occurences.Index)}.
	 */
	@Test
	public void testBuild2() {
		Index index = new DefaultIndexImpl();
		StreamTokenizerIndexBuilder builder = new StreamTokenizerIndexBuilder(index);
		builder.buildFrom(new StreamTokenizer(new StringReader(s8)));
		assertEquals(s8index, index);
	}

}

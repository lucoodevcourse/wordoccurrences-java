package edu.luc.cs.laufer.cs313.occurences;

import java.util.Iterator;

/**
 * An index builder that populates an index from a source represented by an
 * iterator over tokens.
 * 
 * @author laufer
 */
public class TokenIteratorIndexBuilder {

	/**
	 * Constructs a builder for the given index.
	 * 
	 * @param index
	 *            the Index to be built
	 */
	public TokenIteratorIndexBuilder(final Index index) {
		if (index == null)
			throw new IllegalArgumentException("index == null");
		// TODO your job; also add any necessary fields
	}

	/**
	 * Builds the index from the given source.
	 * 
	 * @param source
	 *            the Iterator over Tokens from which to build the index
	 */
	public void buildFrom(final Iterator<Token> source) {
		if (source == null)
			throw new IllegalArgumentException("source == null");
		// TODO your job
	}
}

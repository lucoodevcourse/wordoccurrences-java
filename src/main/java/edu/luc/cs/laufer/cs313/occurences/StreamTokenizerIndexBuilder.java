package edu.luc.cs.laufer.cs313.occurences;

import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * An index builder that populates an index from a source represented by a
 * StreamTokenizer.
 * 
 * @author laufer
 * 
 */
public class StreamTokenizerIndexBuilder {

	/**
	 * Constructs a builder for the given index.
	 * 
	 * @param index
	 *            the Index to be built
	 */
	public StreamTokenizerIndexBuilder(final Index index) {
		if (index == null)
			throw new IllegalArgumentException("index == null");
		// TODO your job; also add any necessary fields
	}

	/**
	 * Builds the index from the given source.
	 * 
	 * @param source
	 *            the StreamTokenizer from which to build the index
	 */
	public void buildFrom(StreamTokenizer source) {
		if (source == null)
			throw new IllegalArgumentException("source == null");
		try {
			// TODO your job
			if (false)
				throw new IOException(); // TODO get rid of this when done
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}

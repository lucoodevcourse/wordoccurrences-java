package edu.luc.cs.laufer.cs313.occurences;

import java.io.StreamTokenizer;
import java.io.StringReader;

import edu.luc.cs.laufer.cs313.occurences.DefaultIndexImpl;
import edu.luc.cs.laufer.cs313.occurences.Index;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Index index = new DefaultIndexImpl();

		String in = "politics without without principle\npleasure without conscience";
		StreamTokenizer s = new StreamTokenizer(new StringReader(in));
		s.ordinaryChar('.');

		int token;
		while ((token = s.nextToken()) != StreamTokenizer.TT_EOF) {
			if (token == StreamTokenizer.TT_WORD) {
				index.add(s.sval, s.lineno());
			}
		}

		System.out.println(index);
	}

}

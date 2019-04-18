package ar.com.eduardo;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.com.eduardo.compressor.CompressionAlgorithm;
import ar.com.eduardo.compressor.LettersGroupCompressionAlgorithm;

public class LettersGroupCompressionAlgorithmTest {

	@Test
	public void testCompressSoloMayusculas() {
		CompressionAlgorithm compressionAlgorithm = new LettersGroupCompressionAlgorithm();
		String text = "AAABBAAAAABBBCCCCCCCCAAAAA";
		String compressedString = compressionAlgorithm.compress(text);
		assertTrue(compressedString.equals("3A2B5A3B8C5A"));
	}
	
	@Test
	public void testCompressMayusculasYMinusculas() {
		CompressionAlgorithm compresAlgorithm = new LettersGroupCompressionAlgorithm();
		String text = "AAaaCcCC";
		String compressedString = compresAlgorithm.compress(text);
		assertTrue(compressedString.equals("4A4C"));
	}

}

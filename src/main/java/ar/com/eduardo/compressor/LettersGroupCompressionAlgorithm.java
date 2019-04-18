package ar.com.eduardo.compressor;

public class LettersGroupCompressionAlgorithm implements CompressionAlgorithm {

	@Override
	public String compress(String text) {
		if(text == null || text.isEmpty()) { return text; }
		
		text = text.toUpperCase();
		StringBuilder strBuilder = new StringBuilder();
		
		int charCount = 0;
		Character lastChar = null;
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(lastChar != null && letter != lastChar) {
				// cambio de letra, armo la cadena con la compresion
				strBuilder.append(charCount + String.valueOf(lastChar));
				// reset contador
				charCount = 1;
			}else {
				charCount++;
			}
			lastChar = letter;
		}
		// agrego al final el ultimo grupo de letras
		strBuilder.append(charCount + String.valueOf(lastChar));
		return strBuilder.toString();
	}

}

package ar.com.eduardo.compressor;

public class Compressor {

	private CompressionAlgorithm compressionAlgorithm;
	
	public Compressor(CompressionAlgorithm compressionAlgorithm) {
		super();
		this.compressionAlgorithm = compressionAlgorithm;
	}

	public String compress(String text) {
		return compressionAlgorithm.compress(text);
	}

}

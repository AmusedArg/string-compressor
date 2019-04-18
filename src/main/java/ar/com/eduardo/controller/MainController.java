package ar.com.eduardo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

import ar.com.eduardo.compressor.Compressor;
import ar.com.eduardo.compressor.LettersGroupCompressionAlgorithm;

@RestController
public class MainController {
	
	@RequestMapping("/")
    public String index() {
        return "home";
    }
	
	@GetMapping("/candidate")
    public String candidate() {
        return "Eduardo Pereyra";
    }
	
	@PostMapping("/compress")
    public String compress(@RequestBody(required = true) Map<String, Object> payload) {
		String value = "";
		
		if(payload.get("value") != null) {
			value = payload.get("value").toString();
		}
		
		Compressor compressor = new Compressor(new LettersGroupCompressionAlgorithm());
		String compressedString = compressor.compress(value);
		
		JsonObject response = new JsonObject();
		response.addProperty("compressed", compressedString);
		
		return response.toString();
    }
}

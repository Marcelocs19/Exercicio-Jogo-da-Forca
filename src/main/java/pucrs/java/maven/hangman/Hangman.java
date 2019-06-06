package pucrs.java.maven.hangman;

import java.util.ArrayList;
import java.util.List;


public class Hangman {
	
	private String secret;
	private String word;
	private List<String> misses;
	
	public Hangman(String secret) {
		super();
		this.secret = secret;
		this.misses = new ArrayList<String>();
		generateInitialWord();
	}

	private void generateInitialWord() {
		word = "";
		for(int i = 0; i < this.secret.length(); i++) {
			word += "-";
		}
	}

	public String getWord() {
		return word;
	}

	public void guess(String letter) {
		//FIXME: comparar letter e secret!
		letter = letter.toLowerCase();
		misses.add(letter);
		
	}

	public List<String> getMisses() {
		return misses;
	}


	
	
}

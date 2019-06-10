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
		for (int i = 0; i < this.secret.length(); i++) {
			word += "-";
		}
	}

	public String getWord() {
		return word;
	}

	public void guess(String letter) {
		// FIXME: comparar letter e secret!
		String vetorSecret[] = new String[secret.length()];
		String vetorWord[] = new String[word.length()];
		List<Integer> posicao = new ArrayList<Integer>();
		letter = letter.toLowerCase();
		vetorSecret = secret.split("");
		vetorWord = word.split("");
		
		for (int i = 0; i < vetorSecret.length; i++) {
			if (vetorSecret[i].equals(letter)) {
				posicao.add(i);
				vetorWord[i] = letter;
			}
		}

		if (posicao.isEmpty()) {
			misses.add(letter);
		}
		else {
			word = "";
			for(int i = 0; i < vetorWord.length; i++) {
				word += vetorWord[i];
			}
		}
	}

	public List<String> getMisses() {
		return misses;
	}

}

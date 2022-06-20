package by.mikem.jonline.module4.aggregation.task01.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sentence {
	private List<Word> words;
	
	public Sentence() {		
		this.words = new ArrayList<Word>();
	}

	public Sentence(List<Word> words) {		
		this.words = words;
	}
	
	public Sentence(Word...words) {		
		this.words = Arrays.asList(words);
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		return Objects.hash(words);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(words, other.words);
	}

	@Override
	public String toString() {
		return String.format("Sentence [words=%s]", words);
	}
}

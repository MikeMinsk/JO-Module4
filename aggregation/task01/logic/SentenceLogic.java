package by.mikem.jonline.module4.aggregation.task01.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.aggregation.task01.entity.Sentence;
import by.mikem.jonline.module4.aggregation.task01.entity.Word;

public class SentenceLogic {

	public void addWord(Sentence sentence, Word word) {
		sentence.getWords().add(word);
	}

	public boolean removeWord(Sentence sentence, Word word) {
		return sentence.getWords().remove(word);
	}

	public Sentence addSentence(String string) {
		return new Sentence(convertStringsToWords(splitString(string)));
	}

	private String[] splitString(String string) {
		return string.split(" ");
	}

	private List<Word> convertStringsToWords(String[] strings) {
		List<Word> words = new ArrayList<Word>();

		for (String string : strings) {
			words.add(new Word(string));
		}

		return words;
	}
}

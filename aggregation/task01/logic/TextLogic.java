package by.mikem.jonline.module4.aggregation.task01.logic;

import by.mikem.jonline.module4.aggregation.task01.entity.Sentence;
import by.mikem.jonline.module4.aggregation.task01.entity.Text;

public class TextLogic {	

	public void addSentence(Text text, Sentence sentence) {
		text.getSentences().add(sentence);
	}
	
	public boolean removeWord(Text text, Sentence sentence) {
		return text.getSentences().remove(sentence);
	}
}

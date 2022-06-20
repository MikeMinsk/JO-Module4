package by.mikem.jonline.module4.aggregation.task01.main;

import by.mikem.jonline.module4.aggregation.task01.entity.Sentence;
import by.mikem.jonline.module4.aggregation.task01.entity.Text;
import by.mikem.jonline.module4.aggregation.task01.entity.Word;
import by.mikem.jonline.module4.aggregation.task01.logic.SentenceLogic;

public class Main01 {

	public static void main(String[] args) {
		SentenceLogic sentenceLogic = new SentenceLogic();
		Sentence header = new Sentence();
		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();
		Sentence sentence4 = new Sentence();
		Sentence sentence5 = new Sentence();
		Sentence sentence6 = new Sentence();
		Sentence sentence7 = new Sentence();

		header = sentenceLogic.addSentence("Илон Маск за день обеднел почти на $17 млрд");

		sentence1 = sentenceLogic
				.addSentence("Не успели работники американской компании отойти от недавнего письма о запрете удаленки,"
						+ " как Илон Маск прислал руководителям подразделений новое.");

		sentence2 = sentenceLogic.addSentence("Глава Tesla сообщил, что у него «очень плохие предчувствия», "
				+ "поэтому он планирует уволить каждого десятого сотрудника компании.");

		sentence3 = sentenceLogic.addSentence(
				"В сообщении, которое попало к Reuters, указано «приостановить прием на работу по всему миру».");

		sentence4 = sentenceLogic.addSentence("По словам Илона Маска, Tesla планирует сократить штат на 10%, "
				+ "так как во многих областях он стал «раздут».");

		sentence5 = sentenceLogic.addSentence("«Это не относится к тем, кто на самом деле строит автомобили, "
				+ "аккумуляторы или устанавливает солнечные батареи», — уточняет он в электронном письме.");

		sentence6 = sentenceLogic.addSentence("На этот раз без работы могут остаться не менее 10 тыс. человек.");

		sentence7 = sentenceLogic.addSentence(" Согласно отчетности, "
				+ "на конец прошлого года в головной компании и ее дочерних фирмах числилось около 100 тыс. сотрудников.");

		Text poorMask = new Text(sentence1, sentence2, sentence3, sentence4, sentence5, sentence6, sentence7);

		poorMask.setHeader(header);
		
		
		printText(poorMask);
	}

	private static void printText(Text text) {
		printSentence(text.getHeader());
		
		System.out.println("");

		for (Sentence sentence : text.getSentences()) {
			printSentence(sentence);
		}
	}

	private static void printSentence(Sentence sentence) {
		for (Word word : sentence.getWords()) {
			System.out.print(word.getWord() + " ");
		}
	}
}

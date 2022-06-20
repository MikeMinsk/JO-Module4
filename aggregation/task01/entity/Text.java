package by.mikem.jonline.module4.aggregation.task01.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Text {
	private Sentence header;
	private List<Sentence> sentences;
	
	public Text() {	
		this.header = new Sentence();
		this.sentences = new ArrayList<Sentence>();
	}

	public Text(List<Sentence> sentences, Sentence header) {
		this.header = header;
		this.sentences = sentences;
	}
	
	public Text(Sentence...sentences) {		
		this.sentences = Arrays.asList(sentences);
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public Sentence getHeader() {
		return header;
	}

	public void setHeader(Sentence header) {
		this.header = header;
	}

	@Override
	public int hashCode() {
		return Objects.hash(header, sentences);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(header, other.header) && Objects.equals(sentences, other.sentences);
	}

	@Override
	public String toString() {
		return String.format("Text [header=%s, sentences=%s]", header, sentences);
	}
}

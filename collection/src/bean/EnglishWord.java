package bean;

public class EnglishWord implements Comparable<Object> {
	private String word;
	private String mean;
	private String partOfSpeech;
	private String note;

	public EnglishWord() {
	}

	public EnglishWord(String word, String mean, String partOfSpeech, String note) {
		this.word = word;
		this.mean = mean;
		this.partOfSpeech = partOfSpeech;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getPartOfSpeech() {
		return partOfSpeech;
	}

	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "EnglishWord [word=" + word + ", mean=" + mean + ", partOfSpeech=" + partOfSpeech + "]";
	}

	@Override
	public int compareTo(Object o) {
		EnglishWord that = (EnglishWord) o;

		return this.getWord().compareToIgnoreCase(that.getWord());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(this instanceof EnglishWord)) {
			return false;
		}
		EnglishWord that = (EnglishWord) obj;
		return getWord() == that.getWord();

	}

}

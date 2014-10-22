import java.util.*;

public class MCQuestion implements Question {

	private char answer;
	private String phrase;

	public MCQuestion(String p, char a) {
		phrase = p;
		answer = a;
	}

	@Override
	public char respond() {
		Random rand = new Random();
		int response = rand.nextInt(4);
		if (response == 0)
			return 'A';
		else if (response == 1)
			return 'B';
		else if (response == 2)
			return 'C';
		else
			return 'D';
	}

	public void setQuestion(String p) {

		phrase = p;
	}

	public void setAnswer(char a) {

		answer = a;

	}

	@Override
	public String getPhrase() {
		// TODO Auto-generated method stub
		return phrase;
	}

	@Override
	public char getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}
}

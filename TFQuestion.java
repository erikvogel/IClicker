import java.util.*;

public class TFQuestion implements Question {

	private char answer;
	private String phrase;

	public TFQuestion(String p, char a) {
		phrase = p;
		answer = a;
	}

	public char respond() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int response = rand.nextInt(2);
		if (response == 0)
			return 'T';
		else
			return 'F';

	}

	@Override
	public void setQuestion(String p) {
		// TODO Auto-generated method stub
		phrase = p;
	}

	@Override
	public void setAnswer(char a) {
		// TODO Auto-generated method stub
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

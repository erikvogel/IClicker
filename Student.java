
public class Student {
	
	private int id;
	
	private char answer;
	
	public Student(int i){
		id = i;
	}
	public void respond(Question q){
		answer = q.respond();
	}
	public void setID(int i){
		id = i;
	}
	public int getID(){
		return id;
	}
	public void setAnswer(char a){
		answer = a;
	}
	public char getAnswer(){
		return answer;
	}
	
}

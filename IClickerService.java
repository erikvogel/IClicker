import java.util.*;
public class IClickerService {

	private Student[] group;
	private int[] results;
	private Question question;
	
	public IClickerService(int groupSize){
		Random rand = new Random();
		group = new Student[rand.nextInt(50)];
		for (int i = 0; i < group.length; i++)
			group[i] = new Student(rand.nextInt(1000));
	}
	
	public void setMCQuestion(String p, char a){
		question = new MCQuestion(p, a);
		results = new int[4];
		initResults();
	}
	public void setTFQuestion(String p, char a){
		question = new TFQuestion(p, a);
		results = new int[4];
		initResults();
	}
	public void groupAnswer(){
		
		for (int i = 0; i < group.length; i++){
			group[i].respond(question);
			if (group[i].getAnswer() == 'A' || group[i].getAnswer() == 'T')
				results[0]++;
			else if (group[i].getAnswer() == 'B' || group[i].getAnswer() == 'F')
				results[1]++;
			else if (group[i].getAnswer() == 'C')
				results[2]++;
			else
				results[3]++;
			
		}
	}
	public void singleAnswer(int id){
		for (int i = 0; i < group.length; i++){
			if (group[i].getID() == id){
				group[i].respond(question);
				if (group[i].getAnswer() == 'A' || group[i].getAnswer() == 'T')
					results[0]++;
				else if (group[i].getAnswer() == 'B' || group[i].getAnswer() == 'F')
					results[1]++;
				else if (group[i].getAnswer() == 'C')
					results[2]++;
				else
					results[3]++;
				return;
			}
		}
	}
	
	public void initResults(){
		for (int i = 0; i < results.length; i++){
			results[i] = 0;
		}
	}
	public int[] getResults(){
		return results;
	}
	public Student[] getGroup(){
		return group;
	}
	public void displayQuestion(){
		String q = question.getPhrase();
		System.out.println(q + "\n");
	}
	public void displayResults(){
		System.out.println("A/True: " + results[0]);
		System.out.println("B/False: " + results[1]);
		System.out.println("C: " + results[2]);
		System.out.println("D: " + results[3] +"\n");
	}
}


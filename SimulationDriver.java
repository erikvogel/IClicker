
public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			IClickerService group1 = new IClickerService(50); // class of 50 students
			group1.setMCQuestion("What color is a fire truck?\nA. blue\nB. yellow\nC. red\nD. green", 'C'); //Mult Choice
			group1.groupAnswer();
			group1.displayQuestion();
			group1.displayResults();
			
			IClickerService group2 = new IClickerService(50); // 
			group2.setTFQuestion("A blue Whale is a fish.\nT or F?", 'B');
			group2.groupAnswer();
			group2.displayQuestion();
			group2.displayResults();
	}

}

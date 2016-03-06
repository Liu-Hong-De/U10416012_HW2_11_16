//U10416012 劉宏德
import java.util.*;

public class MultiplicationQuiz {
	public static void main(String args[]) {
		//store the answer when user answer the question
		ArrayList<Integer> ansList = new ArrayList<Integer> ();
		
		//generate num1 and num2
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//show question
		System.out.println("What is " + num1 + " + " + num2 " ?");
		
		//get first answer and put it into the answer list
		int ans = input.nextInt();
		ansList.add(ans);
		
		//check user's answer is true or false
		while(num1 + num2 != ans) {
			System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 " ?");
			ans = input.nextInt();
			ansList.add(ans);
		}
		
		//if answer is true print out "You got it"
		System.out.println("You got it!");
	}
}

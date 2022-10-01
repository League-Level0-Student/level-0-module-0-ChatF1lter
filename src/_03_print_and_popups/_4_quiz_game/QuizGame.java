package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int count=0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
String Question1 = "What's 1 + 1?";		
String two = "Correct!";				
String Question2 = "What's 2837*376?";
String answer = "Correct! (Don't use a calculator next time)";
String Question3 = "Did you cheat at all?";
String no = "Liar! YOU LOSE";
String oh = "Ok, that's fair";
String answer2 = "Ok I'll trust you on this one";
// 2.  Ask the user a question 
String input = JOptionPane.showInputDialog(Question1);				
				// 3.  Use an if statement to check if their answer is correct
if(input.equals("2")) {		
	JOptionPane.showMessageDialog(null,two);
	count +=50;
}
				// 4.  if the user's answer was correct, add one to their score 
 input = JOptionPane.showInputDialog(Question2);
if(input.equals("1066712")) {		
	JOptionPane.showMessageDialog(null,answer);
	count +=50;	
}		
if(input.equals("huh")) {
	JOptionPane.showMessageDialog(null,oh);
	count +=100;
}
// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
input = JOptionPane.showInputDialog(Question3);
if(input.equals("no")) {		
	JOptionPane.showMessageDialog(null,no);
	count +=-100;		
}
if(input.equals("not on question 2")) {
	JOptionPane.showMessageDialog(null,answer2);
	count +=0;
}
		// After all the questions have been asked, tell the user their final score 
JOptionPane.showMessageDialog(null,count + " points total");
	}	
}

package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
String yes = "You will rule the world!";
String no = "Sign up for classes at The League!";
String prompt = "Do you know how to write code?";
		// 2. If they say "yes", tell them they will rule the world.
String input = JOptionPane.showInputDialog(prompt);
		// 3. Otherwise, tell them to sign up for classes at The League.

if(input.equals("yes")) {
 JOptionPane.showMessageDialog(null,yes);
 }


if(input.equals("no")) {
	JOptionPane.showMessageDialog(null,no);
	}
}
}

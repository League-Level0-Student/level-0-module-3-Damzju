//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String user = JOptionPane.showInputDialog("You like the bananananana?");
		//2. if they say no, 
		if(user.equalsIgnoreCase("no")) {
			//tell them they are crazy 
		JOptionPane.showMessageDialog(null, "Rude.");
		}
			//and end quiz
		//3. if they say yes
		if(user.equalsIgnoreCase("yes")) {
		//	ask them what is their favorite hobby
		  JOptionPane.showInputDialog("what is your favorite hobby?");
		}
	
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		//	show a pop up that says â€œYou are bananas!â€?
	
	}

}

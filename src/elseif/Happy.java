package elseif;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String hap = JOptionPane.showInputDialog("Is you happy?");

		if (hap.equalsIgnoreCase("yesh")) {
			JOptionPane.showMessageDialog(null, "Keep the doo w/e you coo");
		}else{
			hap = JOptionPane.showInputDialog("Do you want to be happy?");
			
			if (hap.equalsIgnoreCase("No"))
				JOptionPane.showMessageDialog(null, "Alright then.");
			else {JOptionPane.showMessageDialog(null, "Change smth");
			}
			
		}
	}
	}

	/*if (hap.equalsIgnoreCase("Yes")){
		JOptionPane.showMessageDialog(null, "Change something reee");
	}*/

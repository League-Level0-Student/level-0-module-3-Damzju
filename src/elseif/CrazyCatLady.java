//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String input = JOptionPane.showInputDialog("how many cats?");
		// 2. Convert their answer into an int
	int numCats = Integer.parseInt(input);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
	if(numCats>=3) {
		JOptionPane.showMessageDialog(null, "u crazy dawg");
	}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
if(numCats<3) {
	playVideo("www.youtube.com/kadshi2398uasdiu");
}
if(numCats>0) {
	playVideo("www.youtube.com/123ioasdiuoh12e98uasd");
}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(numCats==0) {
			
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


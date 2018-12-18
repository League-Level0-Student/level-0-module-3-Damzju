package elseif;
import javax.swing.JOptionPane;
public class Horoscope {
public static void main(String[] args) {
	String ree = JOptionPane.showInputDialog("Wut is yo sign of stars?");
		if(ree.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Driven, Calculating, Ambitious");
		}
		if(ree.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		if(ree.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		if(ree.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
		if(ree.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
		}
		if(ree.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
		}
		if(ree.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
		}
		if(ree.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
		}
		if(ree.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
		}
		if(ree.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
		}
		if(ree.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		}
		if(ree.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
		}
}
}

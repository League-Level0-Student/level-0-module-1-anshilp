package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog("When is your birthday?"); 
		
		if (birthday.equalsIgnoreCase("July 8th, 2020")) {
			JOptionPane.showConfirmDialog(null, "Happpy Birthday");
			
		}
		
		else {JOptionPane.showConfirmDialog(null, "Happy UnBirthday");}
	}
	
}

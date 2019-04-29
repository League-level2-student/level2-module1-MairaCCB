package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();

		frame.setVisible(true);
		frame.setTitle("Guest Book");
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);

		b1.setText("Add Name");
		b2.setText("View Names");
		frame.pack();

		// When the add name button is clicked, display an input dialog that asks the user to enter a name. 
		
		// Add that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays all the names added to the list. 
		// Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}
}

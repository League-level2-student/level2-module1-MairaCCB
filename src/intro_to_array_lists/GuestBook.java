package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
		static JFrame frame = new JFrame();
		static JPanel panel = new JPanel();
		static JButton b1 = new JButton();
		static JButton b2 = new JButton();
		static String name;
		static ArrayList<String> guestNames = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		

		frame.setVisible(true);
		frame.setTitle("Guest Book");
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);

		b1.setText("Add Name");
		b2.setText("View Names");
		
		frame.pack();

		// When the add name button is clicked, display an input dialog that asks the user to enter a name. 
		GuestBook people = new GuestBook();
		people.anYthing();
		// Add that name to an ArrayList. 
		
		guestNames.add("Guest #1: Bob Banders");
		guestNames.add(" Guest #2: Sandy Summers");
		guestNames.add(" Guest #3: Greg Ganders");
		guestNames.add(" Guest #4: Donny Doners");
		guestNames.add(" Guest #5: " + name);
		
		
		//When the "View Names" button is clicked, display a message dialog that displays all the names added to the list. 
		// Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
		
	}

	public void anYthing() {
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(b1 == buttonPressed) {
			name = JOptionPane.showInputDialog("Enter a name");
		}
		
		else if(b2 == buttonPressed) {
			JOptionPane.showMessageDialog(null, guestNames);
		}
	}
}

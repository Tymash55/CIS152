import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * 
 * @author Tyler Maschoff
 * CIS152 Final Project
 */

public class GolfCourseGUI extends JFrame{
	//JFrame Text box
	JTextArea  golfCourseTextArea = new JTextArea();
	JScrollPane sp = new JScrollPane();
	//JFrame Labels
	JLabel courseLabel = new JLabel("Golf Course: ");
	JTextField courseTextField = new JTextField(15);
	
	JLabel cityLabel = new JLabel("City Located: ");
	JTextField cityTextField = new JTextField(8);
	
	JLabel holesLabel = new JLabel("# of Holes: ");
	JTextField holesTextField = new JTextField(5);
	
	JLabel choicesLabel = new JLabel("State");
	JTextField choicesTextField = new JTextField(15);
	
	private JTextField parTextField = new JTextField(5);
	JLabel parLabel = new JLabel("Par: ");
	private JTextField scoreTextField = new JTextField(5);
	JLabel scoreLabel = new JLabel("Score: ");
	JLabel TitleLabel = new JLabel("Golf Course Scoring Profile", JLabel.CENTER);
	//Create buttons 
	JButton addButton = new JButton("Add Golf Course");
	JButton deleteButton = new JButton("Delete Golf Course");
	JButton sortButton = new JButton("Sort By Best Score");
	JButton sortButton2 = new JButton("Sort By Location");
	JButton exitButton = new JButton("Exit");
	JButton choicesButton = new JButton("OK");
	
	//User Selects state
	String[] choices = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL",
			"GA", "HI", "ID", "IL", "IN", "IA", "KA", "KY", "LA", "ME", "MD", "MS", "MO", 
			"MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", 
			"SC", "SD", "TN", "TX", "UT", "VT", "VA", "WN", "WV", "WS", "WY"};
	final JComboBox<String> cb = new JComboBox<String>(choices);
	

	
	
	
	
	//Linked list for Courses
	List<GolfCourse> golfCourseLinkedList = new LinkedList<GolfCourse>();
	
	public GolfCourseGUI() {
		//Create JPanels
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JPanel gridPanel = new JPanel(new GridLayout(2, 1));
		JPanel gridPanel2 = new JPanel(new GridLayout(2, 1));

		golfCourseTextArea.setEditable(false);
		golfCourseTextArea.setBackground(Color.DARK_GRAY);
		golfCourseTextArea.setForeground(Color.white);

		// Adding buttons, labels and text fields to the window
		TitleLabel.setForeground(Color.white);
		TitleLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel1.setBackground(Color.DARK_GRAY);
		panel2.setBackground(Color.lightGray);
		panel3.setBackground(Color.lightGray);
		gridPanel2.setBackground(Color.DARK_GRAY);
		panel1.add(TitleLabel);
		
		//panel1.add(cb);
		//panel1.add(choicesButton);
		//panel1.add(choicesTextField);
		
		//Add labels and textboxes to panels
		panel2.add(courseLabel);
		panel2.add(courseTextField);
		panel2.add(cityLabel);
		panel2.add(cityTextField);
		panel2.add(choicesLabel);
		panel2.add(cb);
		panel2.add(holesLabel);
		panel2.add(holesTextField);
		panel2.add(parLabel);
		panel2.add(parTextField);
		panel2.add(scoreLabel);
		panel2.add(scoreTextField);


		panel3.add(addButton);
		panel3.add(deleteButton);
		
		panel3.add(sortButton);
		panel3.add(sortButton2);
		panel3.add(exitButton);

		gridPanel.add(panel1);
		gridPanel.add(panel2);
		gridPanel2.add(panel3);

		add(gridPanel, BorderLayout.NORTH);
		add(golfCourseTextArea, BorderLayout.CENTER);
		add(gridPanel2, BorderLayout.SOUTH);
		
		//buttons
		addButton.addActionListener(event -> addGolfCourse());
		
		deleteButton.addActionListener(event -> deleteGolfCourse());
		sortButton.addActionListener(event -> sortGolfCourse());
		sortButton2.addActionListener(event -> sortGolfCourseByState());
		exitButton.addActionListener(event -> exitOut());
		choicesButton.addActionListener(event -> choicesSelected());
		
	}
	private void choicesSelected() {
		choicesTextField.setText("You Selected: " +cb.getSelectedItem());
	}
	//Exit Program
	private void exitOut() {
		System.exit(0);
	}
	/**
	 * Sort List by State Name
	 */
	private void sortGolfCourseByState() {
		golfCourseLinkedList.sort(Comparator.comparing(GolfCourse::getState));
		displayAll();
	}
	
	/*
	 * Sort By best scores
	 */
	private void sortGolfCourse() {
		golfCourseLinkedList.sort(Comparator.comparing(GolfCourse::getUnderPar));
		displayAll();
	}
	
	/*
	 * Delete an entry
	 */
	private void deleteGolfCourse() {
		//check if golfCourse is already added
		if(courseInLinkedList(courseTextField.getText()) == true) {
			JOptionPane.showMessageDialog(null, "Golf Course: " + courseTextField.getText() + " is not on the list.");
		}
		//add course to list
		else {
			for(int i = 0; i < golfCourseLinkedList.size(); i++) {
				String currentCourse = golfCourseLinkedList.get(i).getName();
				if(currentCourse.compareToIgnoreCase(courseTextField.getText()) == 0) {
					golfCourseLinkedList.remove(i);
				}
			}
			JOptionPane.showMessageDialog(null, "Golf Course " + courseTextField.getText() + " has been deleted.");
			
			courseTextField.setText("");
			cityTextField.setText("");
			holesTextField.setText("");
			parTextField.setText("");
			scoreTextField.setText("");
			}
	}
	
	/*
	 * Display the list 
	 */
	private void displayAll() {
		golfCourseTextArea.setText("");
		for(GolfCourse course : golfCourseLinkedList) {
			golfCourseTextArea.append(course + "\n");
		}
	}

	private boolean courseInLinkedList(String name) {
		boolean isInList = true;
		for(GolfCourse course : golfCourseLinkedList) {
			if(course.getName().compareToIgnoreCase(name) == 0) {
				isInList = false;
			}
		}
		return isInList;
	}
	/**
	 * Add Golf course used for the add Button.
	 * Adds users input to the list
	 */
	private void addGolfCourse() {
		//check if golfCourse is already added
		String parS = parTextField.getText();
		 int par = Integer.parseInt(parS);
		 String scoreS = scoreTextField.getText();
		 int score = Integer.parseInt(scoreS);
		 String state = cb.getSelectedItem().toString();
		 int underPar = score - par;

		if(courseInLinkedList(courseTextField.getText()) == false) {
			JOptionPane.showMessageDialog(null, "Golf Course: " + courseTextField.getText() + " is already on the list.");
		}
		//add course to list
		else {
			golfCourseLinkedList.add(new GolfCourse(courseTextField.getText(), cityTextField.getText(),state, holesTextField.getText(), par,score, underPar));
			

			
			courseTextField.setText("");
			cityTextField.setText("");
			holesTextField.setText("");
			parTextField.setText("");
			scoreTextField.setText("");
		}
		displayAll();
	}
	/**
	 * 
	 * @param head
	 * private void selectionSort(node head) {
		String parS = parTextField.getText();
		 int par = Integer.parseInt(parS);
		 String scoreS = scoreTextField.getText();
		 int score = Integer.parseInt(scoreS);
		 int underPar = score - par;
		 
	}
	 */
	
	
	

}

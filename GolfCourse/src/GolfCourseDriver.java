import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * 
 * @author Tyler Maschoff
 * Date: 5/4/2021
 * CIS152 Final Project
 * Golf Course Profile
 * The purpose of this application is for Golfers to keep track of the rounds they play and to be able to sort by best score
 * and by location of the golf course.
 *
 */

public class GolfCourseDriver {
	public static void main(String [] args) {
		GolfCourseGUI application = new GolfCourseGUI();

		application.setTitle("Sorting Golf Courses");
		application.setVisible(true);
		application.setSize(1200,550);
		application.setLocation(200, 100);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

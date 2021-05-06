import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * 
 * @author Tyler Maschoff
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

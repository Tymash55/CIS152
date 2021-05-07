import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.*;
import java.lang.reflect.Field;

import javax.swing.JTextField;

class GolfCourseTest {
	
	private GolfCourse gTest;
	
	@BeforeEach
	public void setUp() throws Exception{
		gTest = new GolfCourse();
	}
	//Some people test getters and setters so I decided to as well. Most people assume they are correct and dont make test functions for them
	//Invalid to be expected for setter
	@Test
	@DisplayName("Test Set Course")
	public void testSetCourse() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//when
		gTest.setName("Ankeny G&C");
		
		//then
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields did not match", field.get(gTest), "Ankeny G&C");
	}

	//Expected to be invalid for getters
	@Test
	@DisplayName("Test Get Course")
	public void testGetCourse() throws NoSuchFieldException, IllegalAccessException {
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(gTest, "magic_name");
		
		//when
		final String result = gTest.getName();
		assertEquals("field was not retreived properly", result, "magic_name");
	}
	//Invalid to be expected for setter
	@Test
	@DisplayName("Test Set City")
	public void testSetCity() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//when
		gTest.setCity("Ankeny");
		
		//then
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields did not match", field.get(gTest), "Ankeny");
	}

	//Expected to be invalid for getters
	@Test
	@DisplayName("Test Get City")
	public void testGetCity() throws NoSuchFieldException, IllegalAccessException {
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(gTest, "magic_name");
		
		//when
		final String result = gTest.getCity();
		assertEquals("field was not retreived properly", result, "magic_name");
	}
	//Invalid to be expected for setter
	@Test
	@DisplayName("Test Set State")
	public void testSetState() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//when
		gTest.setState("IA");
		
		//then
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields did not match", field.get(gTest), "IA");
	}

	//Expected to be invalid for getters
	@Test
	@DisplayName("Test Get Holes")
	public void testGetState() throws NoSuchFieldException, IllegalAccessException {
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(gTest, "magic_name");
		
		//when
		final String result = gTest.getState();
		assertEquals("field was not retreived properly", result, "magic_name");
	}
	//Invalid to be expected for setter
	@Test
	@DisplayName("Test Set Holes")
	public void testSetHoles() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//when
		gTest.setHoles("18");
		
		//then
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields did not match", field.get(gTest), "18");
	}

	//Expected to be invalid for getters
	@Test
	@DisplayName("Test Get Holes")
	public void testGetHoles() throws NoSuchFieldException, IllegalAccessException {
		final Field field = gTest.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(gTest, "magic_name");
		
		//when
		final String result = gTest.getName();
		assertEquals("field was not retreived properly", result, "magic_name");
	}
	
	@Test
	public void testGolfCourseGUI() {
		System.out.println("Golf Course GUI");
		String[] args = null;
		GolfCourseDriver.main(args);
		//TODO review the test code and remove the defualy call to fail
		fail("This is a Test");
	}
	
	public class TestUtils{
		//static int counter;
		
		
	}
	@SuppressWarnings("null")
	@Test
	public void testInputJTextField() {
		GolfCourseGUI GUI;
		JTextField inputTest = null;
		String expResult;
		
		//start test scenario
		GUI = new GolfCourseGUI();
		GUI.setVisible(true);
		
		//reference JTextField Componenet
		//inputTest = (JTextField)TestUtils();
		inputTest.setText("Testing");
		
		inputTest.postActionEvent();
		expResult = "Testing?";
		assertEquals(expResult,inputTest.getText());
	}


}

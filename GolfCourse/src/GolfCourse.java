/**
 * 
 * @author Tyler Maschoff
 *CIS152 Final
 *
 */
public class GolfCourse {
	private String name;
	private String city;
	private String state;
	private String holes;
	private int par;
	private int score;
	private int underPar;
	
	//Constructor
	public GolfCourse() {
		super();
	}
	public GolfCourse(String name, String city, String state, String holes, int par, int score) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.holes = holes;
		this.par = par;
		this.score = score;
	}
	public GolfCourse(String name, String city, String state, String holes, int par, int score, int underPar) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.holes = holes;
		this.par = par;
		this.score = score;
		this.underPar = underPar;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPar() {
		return par;
	}
	public void setPar(int par) {
		this.par = par;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getUnderPar() {
		return underPar;
	}
	public void setUnderPar(int underPar) {
		this.underPar = underPar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHoles() {
		return holes;
	}
	public void setHoles(String holes) {
		this.holes = holes;
	}
	@Override
	public String toString() {
		return "GolfCourse [name=" + name + ", city=" + city + ", state=" + state + ", holes=" + holes + ", par=" + par
				+ ", score=" + score + ", underPar=" + underPar + "]";
	}


	

}

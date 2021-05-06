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
	
	/**
	 * 
	 * @param name
	 * @param city
	 * @param state
	 * @param holes
	 * @param par
	 * @param score
	 */
	public GolfCourse(String name, String city, String state, String holes, int par, int score) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.holes = holes;
		this.par = par;
		this.score = score;
	}
	
	/**
	 * 
	 * @param name
	 * @param city
	 * @param state
	 * @param holes
	 * @param par
	 * @param score
	 * @param underPar
	 */
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
	/**
	 * Get State
	 * @return state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * set state
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * get par for course
	 * @return par
	 */
	public int getPar() {
		return par;
	}
	
	/**
	 * Set par for course
	 * @param par
	 */
	public void setPar(int par) {
		this.par = par;
	}
	
	/**
	 * get score
	 * @return score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * set score
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 *  get underPar
	 * @return user score under par
	 */
	public int getUnderPar() {
		return underPar;
	}
	
	/**
	 * set users under par
	 * @param underPar
	 */
	public void setUnderPar(int underPar) {
		this.underPar = underPar;
	}
	
	/**
	 *  return name of course
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set name of course
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get city golf course is located
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * set city 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * return number of holes
	 * @return holes
	 */
	public String getHoles() {
		return holes;
	}
	
	/**
	 * set number of holes
	 * @param holes
	 */
	public void setHoles(String holes) {
		this.holes = holes;
	}
	
	@Override
	public String toString() {
		return "GolfCourse [name=" + name + ", city=" + city + ", state=" + state + ", holes=" + holes + ", par=" + par
				+ ", score=" + score + ", underPar=" + underPar + "]";
	}


	

}

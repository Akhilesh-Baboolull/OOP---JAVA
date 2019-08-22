/**
 * 
 */

/**
 * @author Akhilesh
 *
 */
public class Person {
	
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	/*Constructor*/
	
	/**
	 * Default Constructor
	 */
	
	public Person() {
		
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = null;
		this.gender = '-';
		this.height = 0.0;
		this.weight = 0.0;
	}
	
	/**
	 * 
	 * @param dob
	 * @param weight
	 */
	public Person(String dob, double weight) {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = dob;
		this.gender = '-';
		this.height = 0.0;
		this.weight = weight;
	

		
	}
	
	/**
	 * 
	 * Overloaded 7 para Constructors
	 * @param nid
	 * @param fName
	 * @param lName
	 * @param dob
	 * @param gender
	 * @param height
	 * @param weight
	 * 
	 */
	public Person(String nid, String fName, String lName, String dob, char gender, double height, double weight) {
		this.nid = nid;
		this.firstName = fName;
		this.lastName = lName;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	
	
	/***Getters****/
	
	/**
	 * Method to return NID
	 * @return Gets NID of person
	 */
	public String getNid() {
		return this.nid;
		
	}
	/**
	 * Method to return Full Name
	 * @return Gets FirstName And LastName
	 */
	public String getName() {
		return (this.firstName + " " + this.lastName);
		
	}
	
	/**
	 * Method to return Date Of Birth of Person
	 * @return Gets DOB of person
	 */
	public String getDob() {
		return this.dob;
		
	}
	
	/**
	 * Method to return Gender of Person
	 * @return Gets Gender of Person
	 */
	
	public char getGender() {
		return this.gender;
		
	}
	
	/**
	 * Method to return Height
	 * @return Gets Height of Person
	 */
	
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * Method to return Weight
	 * @return Gets Weight of Person
	 */
	
	public double getWeight() {
		return this.weight;
	}
	
	public double calcBmi(double height, double weight) {
		
		return (weight/ Math.pow((height/100), 2));
	}
	
		/*Setters*/
	
	/**
	 * Method to set First Names
	 * @param firstName
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	

	
	/**
	 * Method to set Last Name
	 * @param lastName
	 */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	/**
	 * Method to set Date Of Birth Of person
	 * @param dob
	 */
	
	public void setDob(String dob){
		this.dob = dob;
	}
	
	/**
	 * Method to set return Gender
	 * @param gender
	 */
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/**
	 * Method to set height
	 * @param height
	 */
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Method to set weight
	 * @param weight
	 */
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [nid=" + nid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public boolean equals(Person p) {
		
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
}

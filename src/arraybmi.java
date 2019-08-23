import java.util.Scanner;
/**
 * 
 */

/**
 * @author Akhilesh
 *
 */
public class arraybmi {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		double inputHeight;
		double inputWeight;
		
		System.out.println("How many students are there? ");
		int size = key.nextInt();
		
		Person[] dbaStuds1 = new Person[size];
		
		dbaStuds1[0] = new Person("S2540033802882", "John", "Smith", "25/07/2019", 'M', 184, 55);
		
		System.out.println("BMI of person: " + dbaStuds1[0].calcBmi());
		
		
		/**********************************************************************************************************/
		//Use of Static Method
		//Independent of object
		System.out.println("Enter Height: ");
		inputHeight = key.nextDouble();
		
		System.out.println("Enter Height: ");
		inputWeight = key.nextDouble();
		
		System.out.println("BMI = " + Person.calcBmi(inputHeight, inputWeight));
		
		key.close();
		
	}

}

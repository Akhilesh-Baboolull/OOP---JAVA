import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Number of Persons: " + Person.getCounter());
		
		
		/*Instantiation of p1*/
		Person p1 = new Person();
		
		System.out.println("Number of Persons: " + Person.getCounter());
		System.out.println(p1.toString());
		
		/**************************************************************************/
		
		Person p2 = new Person("B010282007007B", "James", "Bond", "01/02/82", 'M', 190.70, 85.4);
		
		System.out.println(p2.toString());
		System.out.println("Number of Persons: " + Person.getCounter());
		
		System.out.println("The BMI is " + p2.calcBmi());
		
		
		/*Now James Bond Becomes Jay Kumar*/
		
		p2.setFirstName("Jay");
		p2.setLastName("Kumar");
		
		System.out.println(p2.toString());
		
		/*Jay Kumar Becomes overweight*/
		
		p2.setWeight(170.50);
		
		System.out.println(p2.toString());
		
		System.out.println("The BMI is " + p2.calcBmi());
		
		/*************************************************************************/
		
		Person p3 = new Person("B010282007007B", "James", "Bond", "01/02/82", 'M', 190.70, 85.4);
		
		System.out.println("Number of Persons: " + Person.getCounter());
		if (p2.equals(p3)){
			System.out.println("same Person");		
		}
		else {
			System.out.println("Different Person");
		}
		
		/********************************************************************************************/
		
		Person[] dbaStuds = new Person[5];
		
		dbaStuds[2] = new Person("22/08/2019", 3.0);
		System.out.println("Number of Persons: " + Person.getCounter());
				
		System.out.println(dbaStuds[2]);
		
		dbaStuds[4] = new Person("B2507000802882", "Yougesh", "Baboolull", "25/07/2019", 'M', 1.84, 55);
		System.out.println("Number of Persons: " + Person.getCounter());
		
		System.out.println(dbaStuds[4]);
		
		/********************************************************************************************/
		
		System.out.println("How many students are there? ");
		int size = key.nextInt();
		
		Person[] dbaStuds1 = new Person[size];
		
		for (int i=0; i <size; i++) {
			dbaStuds1[i] = new Person();
		}
		System.out.println("Number of Persons: " + Person.getCounter());
		
		for (int i=0; i <size; i++) {
			System.out.println(dbaStuds1[i].toString());
		}
		
		for(int i=0; i < size; i++) {
		//input values into the array of object person
			System.out.println("Enter NID " + (i+1) + ": ");
			String nid = key.next();
			
			System.out.println("Enter First Name" + (i+1) + ": ");
			String fname = key.next();
			
			System.out.println("Enter last name" + (i+1) + ": ");
			String lname = key.next();
			
			System.out.println("Enter Date Of Birth" + (i+1) + ": ");
			String dob = key.next();
			
			System.out.println("Enter Gender" + (i+1) + ": ");
			char gender = key.next().charAt(0);
			
			System.out.println("Enter height" + (i+1) + ": ");
			double height = key.nextDouble();
			
			System.out.println("Enter weight" + (i+1) + ": ");
			double weight = key.nextDouble();
		
			dbaStuds1[i] = new Person(nid, fname, lname, dob, gender, height, weight);
		}
		
		double bmiOfStuds;
		for(int i=0; i <size; i++) {
			bmiOfStuds = dbaStuds1[i].calcBmi();
			System.out.println("The BMI of student " + (i+1) + "is " + bmiOfStuds);
		}
		
		
		key.close();
	}
	
}

import java.util.Scanner;
public class ScannerDeeper {
	public static void main(String args[]) {
		
		// We are going to start declaring Scanner and writing one string.
		Scanner sc = new Scanner(System.in);
		String tr = "We have a true in this line";
		Scanner st = new Scanner(tr);
		String ex = "example line!";
		Scanner sn = new Scanner(ex);
		
		// Now, we are going to put a line to ask information to the user.
		System.out.println("Enter your full name:");
		
		// next() is a method that only reads a line until it founds a space.
		String name = sc.next();
		String surname = sc.next();
		
		// Here is going to appear this message putting the variables we defined with next().
		System.out.println("So your name is " + name + " and your surname is " + surname);
		
		// hasNext() is a method that returns true if a following element exists.
		System.out.println("Ok! Hi " + name + " " + surname + "! This is the 1.6 exercise from Moodle!");   
		System.out.println("We have a line after this, so this is " + sn.hasNext());
		
		// nextLine() is a method that reads all the line until it founds a line break.
		System.out.println("This is a " + sn.nextLine());
		
		// nextBoolean() method returns boolean data type which corresponds to the interpreted boolean value of the scanner input.
		System.out.println("Now, we are going to find a boolean!");
		while (st.hasNext()) {

	         // If the next token is boolean, print found and the boolean.
	         if (st.hasNextBoolean()) {
	            System.out.println("Found :" + st.nextBoolean());
	         }

	         // If a boolean is not found, print "Not Found" and the token.
	         System.out.println("Not Found :" + st.next());
		}
		
		// We don't have any line after this command, so now hasNext() is going to return false.
		System.out.println("We don't have any line after this, so this is " + sn.hasNext());
	}
}
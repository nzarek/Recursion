/*****************************************************************/
/*Program:  Recursion                                            */
/*CIS163AA                                                       */
/*Nicholas Zarek                                                 */
/*12/05/2017                                                     */
/*this program demonstrates recursion with a number guessing game*/
/*****************************************************************/
public class NicholasZarek_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int unkownNumber = (int)(Math.random() * 99.0D + 1.0D);
	    java.util.Scanner keyboard = new java.util.Scanner(System.in);
	    int userNum;
	    do {
	      System.out.print("Enter a number between 1 and 100: ");
	      userNum = keyboard.nextInt();
	      if (userNum == unkownNumber) {
	        System.out.println("You have entered the correct number!");
	      } else if (userNum < unkownNumber)
	      {
	        System.out.println("Your guess is less than the unknown number, try again.");
	      } else if (userNum > unkownNumber)
	      {
	        System.out.println("Your guess is greater than the unknown number, try again"); }
	    } while (userNum != unkownNumber);
	    keyboard.close();
	}

}

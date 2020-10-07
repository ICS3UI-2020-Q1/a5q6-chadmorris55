import java.util.Scanner;
/**
 * prints a box of stars with equal height and width to whatever number was given
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //asks user for number and records it top use later
    System.out.println("Please enter a number between 1 and 10");
    int number = input.nextInt();
    //prints out a star each time the count is belwo or equal to the given number
     for (int countB = 1; countB <= number; countB++){
     for (int countA = 1; countA <= number; countA++){
      System.out.print("*");
      }
      System.out.println();
      }
  }
}

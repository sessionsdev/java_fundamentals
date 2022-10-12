package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

  public static void main(String[] args) {

    // write completed here
    // create scanner
    Scanner scanner = new Scanner(System.in);
    // prompt user
    System.out.print("Enter a number between 1 and 12 for month: ");
    // assign input to variable as int
    int number = scanner.nextInt();

    scanner.close();

    switch (number) {
      case 1 -> System.out.println("Jan");
      case 2 -> System.out.println("Feb");
      case 3 -> System.out.println("March");
      case 4 -> System.out.println("April");
      case 5 -> System.out.println("May");
      case 6 -> System.out.println("June");
      case 7 -> System.out.println("July");
      case 8 -> System.out.println("Aug");
      case 9 -> System.out.println("Sept");
      case 10 -> System.out.println("Oct");
      case 11 -> System.out.println("Nov");
      case 12 -> System.out.println("Dec");
      default -> System.out.println("ERROR");
    }
  }

}

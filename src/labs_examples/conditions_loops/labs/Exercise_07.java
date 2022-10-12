package labs_examples.conditions_loops.labs;

import java.sql.Array;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
  public static void main(String[] args) {
    // write completed here
    // create scanner
    Scanner scanner = new Scanner(System.in);
    String vowels = "aeiouAEIOU";

    // assign input to variable as int


    // do we have a vowel?
    boolean vowelFound = false;

    // while no vowel
    while (!vowelFound) {
      System.out.print("Enter a word with a vowel: ");

      // get word from user
      String word = scanner.nextLine();

      for (int i = 0; i < word.length(); i++) {

        // for each letter
        char c = word.charAt(i);

        // if vowels string contains letter end loop
        if (vowels.contains(Character.toString(c))) {
          System.out.println("Vowel: "+ c +" found in word: " + word);
          vowelFound = true;
          break;
        }
      }

      // if still no vowel, print error continue loop
      if (!vowelFound) {
        System.out.println("No vowel found.");
      }
    }

    scanner.close();







    Scanner prompt = new Scanner(System.in);
    System.out.print("Type in a word: ");
    String w = prompt.next();
    int i = 0;
    // signals that we're doing something with each letter
    while (i < w.length()) {

      // w = happy
      if (vowels.indexOf(w.charAt(i)) > -1) {
        System.out.println("The word is: " + w);
        System.out.println("The first vowel is: " + w.charAt(i));
        break;
      }

      i++;
    }
  }








}

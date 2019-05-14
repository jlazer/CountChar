// Justin Lazarski 2019
// Iterate through a string and count the characters.
import java.util.Scanner;
public class CountChar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String userInput = "";
    int numChar;
    int i;

    System.out.println("Please enter a string: ");
    userInput = input.nextLine();
    numChar = 0;

    for(i = 0; i <= userInput.length() - 1; i++) {
      char c = userInput.charAt(i);
      numChar += 1;
      System.out.println(c);
    }
    System.out.println("Number of characters in string: " + numChar);

  }
}

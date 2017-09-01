import java.util.*;
import java.util.Scanner;

public class ReadInput {
  public static void main (String[] args){
    // Declaration
    String username = input();
    output(username);
    //newString();
  }

  public static String input() {
    Scanner console = new Scanner(System.in);
    System.out.print("enter a username: ");
    String name = console.nextLine();

    System.out.println("This is what you entered: " + name);
    return name;
  }

  public static void output(String outputUserLogin){
    System.out.println("This is the String in output method: " +
                        outputUserLogin + " works");
  }
}

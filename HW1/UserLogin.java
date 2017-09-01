import java.util.*;
import java.util.Scanner;

public class UserLogin{
  public static void main (String[] args){
    greetUser();
    String username = readUser();
  }

  public static void greetUser(){
    System.out.println("This program validates a user name. \n" +
                        "The following requirements must be met: \n" +
                        "Contains at least one special Character \n" +
                        "Contains at least one digit \n" +
                        "Contains at least one uppercase letter \n" +
                        "Have at least 5 characters in length.");
  }

  public static String readUser(){
    // Read input from the User
    Scanner console = new Scanner(System.in);
    System.out.print("enter a username: ");
    String name = console.nextLine();
    System.out.println("This is the username you entered: " + name);
    return name;
  }

  public static void checkCase(){
    // Check if all cases are met
  }

  public static void checkLength(){
    // Check if the length is met
  }

  public static void checkValidty(){
    // Check if the user name is valid
  }

  public static void printUser(String loginValidity){
    // Notify user if username is valid or not
  }

  public static void addToReport(){
    // Concatonate with reports
  }

  public static void printReport(){
    // Write to an output file
  }

}

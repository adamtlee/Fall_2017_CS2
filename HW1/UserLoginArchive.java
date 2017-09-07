import java.util.*;
import java.util.Scanner;

public class UserLoginArchive{
  public static void main (String[] args){
    greetUser();
    String username = readUser();
    checkCase(username);
    checkLength(username);
    checkValidty(username);
  }

  public static void greetUser(){
    System.out.println("This program validates a user name. \n" +
                        "The following requirements must be met: \n" +
                        "Contains at least one special Character(!,#,@,#)\n" +
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

  public static void checkCase(String validate){
    // Check if all cases are met

    // Make an array of scenarios with special characters, and numbers.
    System.out.println("Todo CheckCase on: " + validate);
    if (validate.contains("$")){
      System.out.println("It has a $");
    } else {
      System.out.println("No Special Characters");
    }
  }

  public static String checkLength(String validateLength){
    // Check if the length is met
    if(validateLength.length() >= 5 ){
      System.out.println("Pass: The username " + validateLength + " passed checkLength()");
      return validateLength;
    } else {
      System.out.println("Fail: The username " + validateLength + "  is not valid");
    }
    return null;
  }

  public static void checkValidty(String s){
    // Check if the user name is valid
    String specialChars = "[" + "!@#$" +"]";
    if (s.matches(specialChars)){
      System.out.println("Pass: The String " + s + " contains a special Character.");
    } else {
      System.out.println("Fail: The String " + s + " does not contain any required special characters.");
    }
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

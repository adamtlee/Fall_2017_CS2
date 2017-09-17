import java.util.*;
import java.util.Scanner;
import java.io.*;

public class UserLogin{
    public static void main(String[] args) throws IOException{
      String fileName = "output.txt";
      BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

      // Greet the user
      greetUser();
      // ask for username
      String username = readUser();
      // Create Instance Object
      UserLogin test = new UserLogin();
      // Method Calls
      test.checkCase(username);
      test.checkLength(username);
      test.printUser(username);
      // test.printReport(username, fileName, writer);
      // test.checkValidty();

  }

  // Prompt User with directions
  public static void greetUser(){
    System.out.println("This program validates a username. \n" +
                        "The following requirements must be met: \n" +
                        "Contains at least one special Character(!,#,@,#)\n" +
                        "Contains at least one digit \n" +
                        "Contains at least one uppercase letter \n" +
                        "Have at least 5 characters in length.");
  }

  // Take Username from the User
  public static String readUser(){
    String s;
    // Read input from the User
    String LoginFromUser;
    ArrayList<String> usernames = new ArrayList<String>();
    // set up input stream from the keyboard
    Scanner input = new Scanner(System.in);
    while(true){
      s = input.next();
      if (s.equals("exit")){
        break;
      } else {
        usernames.add(s);
      }
      System.out.println(usernames + "\n");
      //input.close();
    }

    return s;
    //System.out.println("This is the username you entered: " + LoginFromUser);
    //return LoginFromUser;
  }

  // Check cases
  public static void checkCase(String username){
    // Check the Username for an Uppercase Letter
    boolean valid = true;

    String upperCase = "(.*[A-Z].*)";
    if(!username.matches(upperCase)){
        System.out.println("Username must contain at least one capital letter.");
        valid = false;
    }

    // Check the Username for a Number
    String numbers = "(.*[0-9].*)";
    if(!username.matches(numbers)){
        System.out.println("Username must contain at least one number.");
        valid = false;
    }

    // Check the Username for the special Characters
    String specialChars = "(.*[ ! # @ $ ].*)";
    if(!username.matches(specialChars)){
        System.out.println("Username must contain at least one special character.");
        valid = false;
    }

    // Check the Username for no blank space
    String space = "(.*[   ].*)";
    if(username.matches(space)){
        System.out.println("Username cannot contain a space.");
        valid = false;
    }

    if(valid){
      System.out.println("Username Passed checkCase");
    }

  }

  // Check the Length of the Username > 5
  public static void checkLength(String username){
     boolean valid = true;
     if(username.length() < 5){
        System.out.println("Username is not five characters long.");
        valid = false;
    }
    if(valid){
      System.out.println("Username Passed checkLength");
    }
  }

  // Prompt User if Username is Valid or Not
  public static void checkValidty(boolean valid){
    if(valid){
      System.out.println("True from checkValidity method");
    } else {
      System.out.println("Denied from checkValidity");
    }
  }

  // Print Information to Console
  public static void printUser(String LoginValidity){
    System.out.println("Login: " + LoginValidity);
    System.out.println("");
  }

  // Add to Report?
  public static void addToReport(){
    // Todo
  }
  /*
  // Write to an output file
  public static void printReport(String username, String fileName, FileWriter output) throws IOException {
    final String OUTPUT_FILE = "output.txt";
    FileWriter output = new FileWriter(OUTPUT_FILE);
    PrintWriter outputFile = new PrintWriter(output);
    output.write("Login: " + username);
    output.close();
  }
  */

}

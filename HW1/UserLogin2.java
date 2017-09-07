import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserLogin2{
    public static void main(String[] args) {

      // Greet the user
      greetUser();

      // ask for username
      String username = readUser();

      Scanner input = new Scanner (System.in);

      checkCase(username);
  }
  public static void greetUser(){
    System.out.println("This program validates a username. \n" +
                        "The following requirements must be met: \n" +
                        "Contains at least one special Character(!,#,@,#)\n" +
                        "Contains at least one digit \n" +
                        "Contains at least one uppercase letter \n" +
                        "Have at least 5 characters in length.");
  }

  public static String readUser(){
    // Read input from the User
    String LoginFromUser;
    // set up input stream from the keyboard
    Scanner input = new Scanner(System.in);
    System.out.print("enter a username: ");
    LoginFromUser = input.next();
    System.out.println("This is the username you entered: " + LoginFromUser);
    return LoginFromUser;
  }
  public static void checkCase(String username){
    System.out.println("CheckCase Method");
    boolean valid = true;
    if(username.length() < 5){
        System.out.println("Username is not five characters long.");
        valid = false;
    }
    String upperCase = "(.*[A-Z].*)";
    if(!username.matches(upperCase)){
        System.out.println("Username must contain at least one capital letter.");
        valid = false;
    }
    String numbers = "(.*[0-9].*)";
    if(!username.matches(numbers)){
        System.out.println("Username must contain at least one number.");
        valid = false;
    }
    String specialChars = "(.*[ ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)";
    if(!username.matches(specialChars)){
        System.out.println("Username must contain at least one special character.");
        valid = false;
    }
    String space = "(.*[   ].*)";
    if(username.matches(space)){
        System.out.println("Username cannot contain a space.");
        valid = false;
    }
    if(valid){
        System.out.println("Username is valid.");
    }
  }

  public static void printUser(String LoginValidity){
    try{
      PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
      writer.println("Login: " + LoginValidity);

    } catch (IOException e){
      System.out.println("Error: " + e);
    }
  }
}

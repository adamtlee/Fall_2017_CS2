import java.util.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.*;

public class UserLogin2{
    public static void main(String[] args) throws IOException{
      String fileName = "output.txt";
      BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
      // Greet the user
      greetUser();

      // ask for username
      String username = readUser();
      checkCase(username, fileName, writer);
      writer.close();
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
  public static void checkCase(String username, String fileName, BufferedWriter writer)throws IOException{
    boolean valid = true;
    if(username.length() < 5){
        System.out.println("Username is not five characters long.");
        writer.write("Username is not five characters long." + "\n");
        valid = false;
    }
    String upperCase = "(.*[A-Z].*)";
    if(!username.matches(upperCase)){
        System.out.println("Username must contain at least one capital letter.");
        writer.write("Username must contain at least one capital letter." + "\n");
        valid = false;
    }
    String numbers = "(.*[0-9].*)";
    if(!username.matches(numbers)){
        System.out.println("Username must contain at least one number.");
        writer.write("Username must contain at least one number." + "\n");
        valid = false;
    }
    String specialChars = "(.*[!#@$].*)";
    if(!username.matches(specialChars)){
        System.out.println("Username must contain at least one special character.");
        writer.write("Username must contain at least one special character." + "\n");
        valid = false;
    }
    String space = "(.*[   ].*)";
    if(username.matches(space)){
        System.out.println("Username cannot contain a space.");
        writer.write("Username cannot contain a space." + "\n");
        valid = false;
    }
    if(valid){
        System.out.println("The Username you entered is: " + username);
        System.out.println("The Username is valid.");
        writer.write("The Username you entered is: " + username  + "\n");
        writer.write("The Username is valid." + "\n");
    } else {
      System.out.println("The Username you entered is: " + username);
        System.out.println("Username is not valid");
        writer.write("The Username you entered is: " + username  + "\n");
        writer.write("Username is not valid" + "\n");
    }
  }
}

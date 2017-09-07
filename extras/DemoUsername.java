import java.util.*;

public class DemoUsername{
    // moreloa
    public static void main(String[] args) {

      //declare variables
      String username;       // variable for username
      String confirminputUsername;

      // set up input stream from the keyboard
      Scanner input = new Scanner (System.in);

      // ask for username

      System.out.print("Enter inputUsername : ");
      username = input.next();
      passCheck(username);
      /*
      System.out.print("Please confirm your Username : ");
      confirminputUsername = input.next();


       if(username.matches(confirminputUsername)){
          System.out.println("Username successfully created.");
      } else {
          System.out.println("Username do not match.");
      }
      */


  }

  public static void passCheck(String username){
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
      /*
      if(username.startsWith("?")){
          System.out.println("Username cannot start with '?'.");
          valid = false;

      }
      if(username.startsWith("!")){
          System.out.println("username cannot start with '!'.");
          valid = false;
      }*/
      if(valid){
          System.out.println("Username is valid.");
      }
  }
}

import java.util.*;

public class DemoPassword{
    public static void main(String[] args) {

      //declare variables
      String inputPassword;       // variable for password
      String confirmPassword;

      // set up input stream from the keyboard
      Scanner input = new Scanner (System.in);

      // ask for password
      System.out.print("Password : ");
      inputPassword = input.next();
      passCheck(inputPassword);

      System.out.print("Please confirm your password : ");
      confirmPassword = input.next();


      if(inputPassword.matches(confirmPassword)){
          System.out.println("Password successfully created.");
      } else {
          System.out.println("Passwords do not match.");
      }


  }

  public static void passCheck(String password){
      boolean valid = true;
      if(password.length() < 8){
          System.out.println("Password is not eight characters long.");
          valid = false;
      }
      String upperCase = "(.*[A-Z].*)";
      if(!password.matches(upperCase)){
          System.out.println("Password must contain at least one capital letter.");
          valid = false;
      }
      String numbers = "(.*[0-9].*)";
      if(!password.matches(numbers)){
          System.out.println("Password must contain at least one number.");
          valid = false;
      }
      String specialChars = "(.*[ ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)";
      if(!password.matches(specialChars)){
          System.out.println("Password must contain at least one special character.");
          valid = false;
      }
      String space = "(.*[   ].*)";
      if(password.matches(space)){
          System.out.println("Password cannot contain a space.");
          valid = false;
      }
      if(password.startsWith("?")){
          System.out.println("Password cannot start with '?'.");
          valid = false;

      }
      if(password.startsWith("!")){
          System.out.println("Password cannot start with '!'.");
          valid = false;
      }
      if(valid){
          System.out.println("Password is valid.");
      }
  }
}

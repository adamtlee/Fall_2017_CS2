import java.util.*;

public class RegexDemo{
  public static void main(String[] args) {
      // @#!
      String str = "blah #";
      String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;

      if ( str.matches(specialCharacters)) {
           System.out.println("string '"+str + "' contains only special character");
      } else {
           System.out.println("string '"+str + "' doesn't contains only special character");
      }
  }
}

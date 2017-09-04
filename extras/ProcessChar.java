import java.util.*;
import java.util.Scanner;
public class ProcessChar{
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("enter a username: ");
    String name = console.nextLine();
    System.out.println("This is the username you entered: " + name);

      if(name.contains("$") || name.contains("%") || name.contains("!") || name.contains("$")){
        System.out.println("It contins a special character");
      } else {
        System.out.println("No Special Characters");
      }
  }
}

// Scrap
//for(int i = 0; i < name.length(); i++){
//System.out.println(name.charAt(i));
//}

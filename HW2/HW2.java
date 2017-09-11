import java.util.*;
import Borders;

public class HW2 {
  public static void main (String[] args){
    HW2 runnable = new HW2();
    runnable.promptUser();
  }

  public static void promptUser(){
    System.out.println("Enter the text file you would like to read: ");
    System.out.println("Countries bordering Germany: ");
    System.out.println("Countries that have a population greater than 100 million: ");
    System.out.println("Countries that border Germany & have a population greater than 100 million: ");
  }
}

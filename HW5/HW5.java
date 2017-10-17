import java.util.*;
import java.io.*;
import java.util.Scanner;

public class HW5 {
  public static void main (String[] args) throws IOException{
    Scanner user_input = new Scanner(System.in);
    String input_file, output_file;

    System.out.print("Enter a text file: ");
    System.out.flush();
    String input = user_input.nextLine().trim();
    File input_data_file = new File(input);
    Scanner reader = new Scanner(input_data_file);

    while (reader.hasNextLine()){
      String txt = reader.nextLine();
      System.out.println(txt);
    }
    System.out.println(input_data_file);
    // object.readFile(scanner, input_file, output
  }
}

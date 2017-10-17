import java.util.*;
import java.util.Scanner;
import java.io.*;
public class HW2 {
  public static void main (String[] args) throws IOException{
    // Declare Scanner for user input
    Scanner user_input = new Scanner(System.in);
    String input_file, output_file;




    HW2 object = new HW2();

    System.out.print("Enter a text file: ");
    System.out.flush();
    String input = user_input.nextLine().trim();
    File input_data_file = new File(input);
    Scanner reader = new Scanner(input_data_file);

    while (reader.hasNextLine()){
      try  {
        String txt = reader.nextLine();
        Countries c = new Countries();
        String[] values = txt.split(",");
        c.countryName = values[0].trim();
        c.latitude = values[1].trim();
        c.longitude = values [2].trim();
        c.countryArea = Integer.parseInt(values[3].trim());
        c.countryPopulation =  Integer.parseInt(values[4].trim());
        c.countryGDP = Double.parseDouble(values[5].trim());
        c.countryYear = Integer.parseInt(values[6].trim());
        // TODO: add c to a list of countries
        System.out.println(txt);
      } catch(Exception e){
        System.out.println("Error parsing file");
        e.printStackTrace();
      }
    }
    object.promptUser();
    System.out.println(input_data_file);
    // object.readFile(scanner, input_file, output_file);

  }

  public static void promptUser(){
    // System.out.println("Enter the text file you would like to read: ");
    System.out.println("Countries bordering Germany: ");
    System.out.println("Countries that have a population greater than 100 million: ");
    System.out.println("Countries that border Germany & have a population greater than 100 million: ");
  }
/*
  public String readFile(Scanner scanner, String input_file, String output_file) {
    System.out.println("please enter a filename you would like to read: ");
    System.out.flush();
    String input_file = scanner.nextLine().trim();
    File input = new File(input_file);
    Scanner scanner = new Scanner(input_file);
  }
  */
}

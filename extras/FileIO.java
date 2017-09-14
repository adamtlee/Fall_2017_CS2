import java.util.*;
import java.io.*;
import java.util.Scanner;

public class FileIO{
  public static void main (String[] args) throws IOException{
    String str = "Hello";
    String fileName = "output.txt";  
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(str);

    writer.close();
  }
}

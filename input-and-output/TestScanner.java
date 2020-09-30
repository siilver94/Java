import java.io.*;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
    
      String name;
      int age;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("what is your name?");
      name = scan.nextLine();
      
      System.out.println("Welcome " + name + ".");
      
      System.out.print("Please insert your age.");
      age = scan.nextInt();
      
      Systme.out.println("Your age is " + age + ".");
      }
      
 }

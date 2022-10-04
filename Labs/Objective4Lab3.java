import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {

      java.util.Scanner scanner = new java.util.Scanner(System.in);

      Scanner keyboard = new Scanner(System.in);
      
      int birthYear = 0;
      int age = 0;
      int currentYear = 2022;

      Scanner input = new Scanner(System.in);
      System.out.println("How old are you?");

      int intInput1 = keyboard.nextInt();

      System.out.print("You were born in ");
      System.out.println(currentYear-intInput1);

      scanner.close();
    }
}

import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    double dub1 = 0;
    double dub2 = 0;
    double dub3 = 0;

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add.");
    int intInput1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int intInput2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int intInput3 = keyboard.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
    double doubleInput1 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double doubleInput2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    double doubleInput3 = keyboard.nextDouble();

    System.out.print("The sum of " + intInput1 + " " + "+ " + intInput2 + "+ " + intInput3 + " = ");
    System.out.println(intInput1+intInput2+intInput3);
    System.out.print("The sum of " + doubleInput1 + "+ " + doubleInput2 + "+ " + doubleInput3 + " = ");
    System.out.println(doubleInput1+doubleInput2+doubleInput3);


      scanner.close();

  }
}

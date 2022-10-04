import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("What is your first name?");
    String userInput1 = keyboard.nextLine();
    System.out.println("What is your last name?");
    String userInput2 = scanner.nextLine();
    System.out.println("What is your favorite animal?");
    String userInput3 = scanner.nextLine();
    System.out.println("What is your favorite food?");
    String userInput4 = scanner.nextLine();
    System.out.println("What is your favorite song?");
    String userInput5 = scanner.nextLine();
    System.out.println("My name is " + userInput1 + " " + userInput2 + ".");
    System.out.println("My favorite animal is the " + userInput3);
    System.out.println("My favorite food is " + userInput4);
    System.out.println("My favorite song is " + userInput5);

    scanner.close();
  }
}

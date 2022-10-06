public class Objective8Lab3 {
  public static void main(String[] args) {

    int counter = 1;

    for (int i=1; i<=20; i+=1) {
      System.out.print(counter);

      counter = counter + 1;

      if(counter % 2 == 0) {
        System.out.println(" is odd ");
      }

      if (counter % 2 == 1){
        System.out.println(" is even ");
      }
    }
  }
}

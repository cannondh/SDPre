public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 0;


    while(counter <= 20) {
      System.out.print(counter);
      counter = counter + 1;

      if(counter % 2 == 0){
        System.out.println(" is even.");
      }

      else{
        System.out.println(" is odd.");
      }
    }
  }
}

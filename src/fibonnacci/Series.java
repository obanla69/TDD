package fibonnacci;

public class Series {
    public static void main(String[]args){
        int number = 10;
        int firstTerm = 0;
        int secondTerm = 1;
      System.out.println("Fibonacci series till " + number + "terms");

      for(int count = 0; count <= number;count++){
          System.out.print(firstTerm + " , " );

          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;

      }

    }


}

/**
 * Created by alvin2 on 3/10/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */




public class FizzBuzz {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0) continue; {
                System.out.println("Fizz");
            } if(i % 5 == 0) continue; {
                System.out.println("Buzz");
            } if(i % 15 == 0) continue; {
                System.out.println("FizzBuzz");
            }
                System.out.println(i);


        }



    }



}

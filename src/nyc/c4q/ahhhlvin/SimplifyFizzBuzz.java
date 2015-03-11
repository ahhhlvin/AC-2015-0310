package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/10/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */


public class SimplifyFizzBuzz {
    public static void main(String[] args) {


        String text = "hello, world"; // for amount of characters in string
        // int length = text.length();
        //System.out.println(length);

        //char c = text.charAt(7);
        //System.out.println(c);

        for (int i = 0; i < text.length(); i++) {

            char currentLetter = text.charAt(i);
            System.out.println(currentLetter);

        }
    }
}

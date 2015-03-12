import java.util.Scanner;

/**
 * Created by alvin2 on 3/12/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Play {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);
        int answer = 0;
        int answer2 = 0;
        String number;

        System.out.println("Write a Roman Numeral: ");
        number = input.next();





        for (int i = 0; i < (number.length() - 1); i++) {
            if (number.charAt(i) == 'I' && number.charAt(i + 1) == 'V') {
                answer += 4;
            } else if (number.charAt(i) == 'I' && number.charAt(i + 1) == 'X') {
                answer += 9;
            } else if (number.charAt(i) == 'X' && number.charAt(i + 1) == 'L') {
                answer += 40;
            } else if (number.charAt(i) == 'X' && number.charAt(i + 1) == 'C') {
                answer += 90;
            } else if (number.charAt(i) == 'C' && number.charAt(i + 1) == 'D') {
                answer += 400;
            } else if (number.charAt(i) == 'C' && number.charAt(i + 1) == 'M') {
                answer += 900;
            } else {
                continue;
            }

        }


        for (int i = 0; i < (number.length() - 1); i++) {
            if (number.charAt(i) == 'M' && (number.charAt(i - 1) != 'C')) {
                answer2 += 1000;
            } else if (number.charAt(i) == 'D') {
                answer2 += 500;
            } else if (number.charAt(i) == 'C' && (number.charAt(i + 1) != 'M')) {
                answer2 += 100;
            } else if (number.charAt(i) == 'L') {
                answer2 += 50;
            } else if (number.charAt(i) == 'X') {
                answer2 += 10;
            } else if (number.charAt(i) == 'X' && (number.charAt(i + 1) != 'L' || number.charAt(i + 1) != 'C')) {
                answer2 += 10;
            } else if (number.charAt(i) == 'V') {
                answer2 += 5;
            } else if (number.charAt(i) == 'I') {
                answer2 += 1;
            } else if (number.charAt(i) == 'I' && (number.charAt(i + 1) != 'V' || number.charAt(i + 1) != 'X')) {
                answer2 += 1;
            } else if (number.charAt(i) != 'M' || number.charAt(i) != 'C' || number.charAt(i) != 'D' || number.charAt(i) != 'X' || number.charAt(i) != 'L' || number.charAt(i) != 'V' || number.charAt(i) != 'I') {
               //return -1;
            }
        }



    }
}

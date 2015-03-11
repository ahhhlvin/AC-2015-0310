package nyc.c4q.ahhhlvin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;


        System.out.println("Count from: ");
        int firstNum = input.nextInt();

        System.out.println("Count to: ");
        int lastNum = input.nextInt();

        System.out.println("Count by: ");
        int incrementNum = input.nextInt();


        for (i = firstNum; i <= lastNum; i = i + incrementNum) {
            System.out.print(i + " ");
        }



    }
}

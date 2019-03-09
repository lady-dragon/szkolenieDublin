package day3;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        takeNumbers();

    }

    private static void takeNumbers() {
        Scanner myReader = new Scanner(System.in);
        System.out.print("Podaj początek przedzialu: ");
        int a = myReader.nextInt();
        System.out.print("Podaj koniec przedzialu: ");
        int b = myReader.nextInt();
        checkEven(a, b);
    }

    private static void checkEven(int a, int b) {
        if (a>b){
            int c=a;
            a=b;
            b=c;
//            b = a + b;
//            a = b - a;
//            b = b - a;

        }
        for (int i=a+1; i<b; i++){
            System.out.print((i%2 == 0)?i + ", ":"");
        }
    }

}

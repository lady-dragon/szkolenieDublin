package day2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        String znak = args[0];
//        int a = Integer.parseInt(args[1]);
//        int b = Integer.parseInt(args[2]);
//        calc(a, b, znak);  //9
//        calc(a, b, "-");  //3
//        calc(a, b, "*");  //16
//        calc(a, b, "/");  //3

//        paramsFromUser();
        testRandom();
    }

    private static void testRandom() {
        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj liczbę: 1-6");
        String liczba = JOptionPane.showInputDialog("Podaj liczbę (1-2)");

        System.out.println("Twoja liczba " + liczba);
//        String znak = scanner.nextLine();
        int a = random.nextInt(2) +1;
//        JOptionPane.showMessageDialog(null, "Wylosowana liczba " + a);
        String b = a +"";
        System.out.println(liczba.equals(b) ? "Wygrałeś": "Przegrałeś Wylosowana liczba to: " + b );
//        if (liczba.equals(b)){
//            System.out.println("Wygrałeś");
//        }else {
//            System.out.println("Przegrałeś Wylosowana liczba to: " + b);
//        }

    }

    private static void paramsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj znak: ");
        String znak = scanner.nextLine();
        System.out.print("Podaj pierwszą cyfrę: ");
        int cyfra1 = scanner.nextInt();
        System.out.print("Podaj druga cyfra: ");
        int cyfra2 = scanner.nextInt();
        System.out.print("Twój wynik: ");
        calc(cyfra1, cyfra2, znak);
    }

    private static void calc(int a, int b, String znak) {

        switch (znak) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / (double) b);
                break;
            default:
                System.out.println("błędny znak");

        }

    }
}

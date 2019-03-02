package day1;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("dodawanie " + add(21,5));
        System.out.println("odejmowanie " + minus(18, 4));
        System.out.println("mnożenie " + multiply(45673, 3234));
        System.out.println("dzielenie " + divide(2, 3));
        System.out.println("dzielenie " + divide1(90, 0));
    }
    //dodawnie
    private static int add(int a, int b){
        int suma = a + b;
        return suma;
    }
    //odejmowanie
    private static int minus(int a, int b){
        int minus = a - b;
        return minus;
    }
    //mnożenie
    private static long multiply(int a, int b) {
        return a * b;
    }
    //dzielenie
    private static double divide(int a, int b) {
        if (b == 0){
            System.out.println("nie dziel przez zero, cholero, d-_-b");
            return Double.MAX_VALUE;
        }
        else {
            return (double)a / b;
        }
    }
    //odwrotne sprawdzanie dzielenia przez 0
    private static double divide1(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }
        else {
            System.out.println("zero... serio ?");
            return Double.MAX_VALUE;
        }
    }
}

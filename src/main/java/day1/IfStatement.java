package day1;

public class IfStatement {

    public static void main(String[] args) {
//        boolean jakas = 0 == 0;
//        System.out.println(jakas);
//        System.out.println(8 == 0);
        System.out.println(spr(4, 5, 0));
//        checkjakas(jakas);
////czy jest większe od 0
//        int i =-52;
//        check(i);

    }

    private static void checkjakas(boolean jakas) {
        if (jakas) {
            System.out.println("jest okej ziom");
        } else {
            System.out.println("nie jest okej :(");
        }
    }

    private static void check(int i) {
        if (i < 0) {
            System.out.println("'i' jest mniejsze od zera");
        } else if (i == 0) {
            System.out.println("'i' jest równe 0");
        } else {
            System.out.println("'i' jest większe od 0");
        }
    }

    private static boolean spr(int x, int y, int z) {
        int mnozenie = x * y;
//        if (mnozenie < z) {
//            return false;
//        } else {
//            return true;
//        }
        return !(mnozenie < z);
    }
}

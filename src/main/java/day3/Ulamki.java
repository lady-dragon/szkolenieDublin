package day3;

public class Ulamki {
    public static void main(String[] args) {
        fractions(10, 4 );
//        System.out.println(nwd(4, 8));
    }

    private static void fractions(int a, int b) {
        int calosc = a / b;
        int licznik = a % b;
        if (licznik ==0){
            System.out.println(calosc);
            return;
        }
        int nwd = nwd(licznik, b);
        String ulamek = (licznik/nwd) + "/" + (b/nwd);
        System.out.println(calosc == 0 ? ulamek: calosc + " " + ulamek);
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }
}

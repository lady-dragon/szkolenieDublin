package day3;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
//        intArray();
        stringArray();
//        copyArray();
    }

    private static void copyArray() {
        String[] tablica = {"ala", "ma", "kota"};
        String[] tablica1 = Arrays.copyOf(tablica, tablica.length+1);
        tablica1[tablica1.length-1] = "Czarny";
        tablica = tablica1;
        System.out.println(Arrays.toString(tablica));
    }

    private static void stringArray() {
        String ala = "Ala ma kot.atomn kot ma ale";
        String[] wyrazy = ala.split("[. ]");
        for (String a : wyrazy) {
            System.out.println(a);
        }
//        System.out.println(wyrazy[3]);

//        String dom = "House";
//        char[] tb = dom.toCharArray();
//        System.out.println(Arrays.toString(tb));
    }

    private static void intArray() {
        int[] tablica = new int[5];
        tablica[0] = 5;
        tablica[1] = 3;
        tablica[2] = 8;
        tablica[3] = 18;
        tablica[4] = -5;
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }

        System.out.println();
        System.out.println("********************************************");
//        tablica[3] = tablica[5] ; niedozwolone jest odwoływanie się do indexu spoza tablicy

        System.out.println(Arrays.toString(tablica));

        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));
    }

}

package day3;

public class Binary {

    public static void main(String[] args) {
//        System.out.println(binar("0101010"));
        System.out.println(dec(50));
//        char a = '~';
//        System.out.println((int)a);

    }

    private static String dec(int y) {
        String result = "";
        while (y > 0) {
            result = (y % 2) + result;
            y /= 2;
        }
        return result;
    }

    private static long binar(String b) {
        char[] tablica = b.toCharArray();
        long result = 0;
        int j = 0;
        for (int i = tablica.length - 1; i >= 0; i--) {
            int a = tablica[i] == '1' ? 1 : 0;
            result += a * Math.pow(2, j);
            j++;
        }
        return result;
    }

    private static int check(String s) {
        s = s.substring(s.indexOf("1"), s.lastIndexOf("1") + 1);
        System.out.println(s);

        String[] tablica = s.split("1");
        int result = 0;
//        for (int i =0; i<tablica.length; i++){
//            if (tablica[i].length() > result){
//                result = tablica[i].length();
//            }
//
//        }

        for (String a : tablica) {
            if (a.length() > result) {
                result = a.length();
            }
        }
        return result;
    }
}

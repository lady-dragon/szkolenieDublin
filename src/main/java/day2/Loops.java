package day2;

public class Loops {

    public static void main(String[] args) {
//        loopFor();
//        iterators();
//        loopWhile();
//        loopDoWhile();
    }

    private static void iterators() {
        int a = 0;
//        a = a + 10;
        a += 10;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a++;
        System.out.println(a);

        int b = 1;

        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(--b);
        System.out.println(b--);

        int c = 2;
        c *= 6;
        System.out.println(c);
    }


    private static void loopFor() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("ITerator " + i);
//        }
//        for(int i = 15; i >= 0; i--){
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if(i==3 || i==7) {
////                break;
//                continue;
//            }
//            System.out.print(i + ", ");
//        }
//        for (int i = 0; i < 10; i++) {
//            if(i>=3 && i<=7) {
//                continue;
//            }
//            System.out.print(i + ", ");
//        }

        int i = 0;
        for (; ; ) {
            if (i == 10) {
                break;
            }
            System.out.print(i + ", ");
            i++;
        }
    }

    private static void loopWhile() {
        int a = 0;
        String s = "";
        while (a < 10) {
            if (a == 4) {
                a++;
                continue;
            }

            System.out.print(s + "a = " + a);
            s = ", ";
            a++;

        }
    }


    private static void loopDoWhile() {
        int a = 10;
        String s = "";
        do {
            System.out.print(s + "a = " + a);
            s = ", ";
            a++;
        } while (a < 10);
    }
}

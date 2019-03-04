package day2;

public class ShortIfAndSwitchCase {
    public static void main(String[] args) {
//        shortIf(-4);
//        shortIf(23);
        switchCaseStatement("praca");
    }

    private static void shortIf(int a) {
//        if (a > 0) {
//            System.out.println(a + " jest > od 0");
//        } else {
//            System.out.println(a + " jest < lub = 0");
//        }
        System.out.println(a > 0 ? a + " jest > od 0" : a + " jest < lub = 0");
    }

    private static void switchCaseStatement(String txt) {
//        if(txt.equals("dom")) {
//            System.out.println("Jestes w domu");
//        } else if(txt.equals("praca")) {
//            System.out.println("jestes w pracy");
//        } else if (txt.equals("sklep")) {
//            System.out.println("jestes w sklepie");
//        } else {
//            System.out.println("nigdzie nie jestes");
//        }

        switch (txt) {
            case "dom":
                System.out.println("Jestes w domu");
                break;
            case "sklep":
                System.out.println("Jestes w sklepie");
                break;
            case "praca":
                System.out.println("Jestes w pracy");
                break;
            default:
                System.out.println("Nigdzie nie jestes");
        }
    }
}




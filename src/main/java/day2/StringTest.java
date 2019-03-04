package day2;

public class StringTest {

    private static void testString() {
        String a = "dom";
        String b = "dom";
        b += "moj";
        String c = new String("dom");
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.equals(c));
    }
}

package day4;

public class StringBuilderTest {

    public static void main(String[] args) {
        testStringBuilder1();
    }

    private static void testStringBuilder() {
        String s = "Dom";
        for(int i = 0; i<20;i++) {
            s += i;
        }
        System.out.println(s);
    }

    private static void testStringBuilder1() {
        StringBuilder s = new StringBuilder("Dom");
        for(int i = 0; i<20;i++) {
            s.append("dom").append(i);
        }
        System.out.println(s.toString());
    }

}

package day1;


public class SimpleVariables {


    public static void main(String[] args) {
/*
        boolean bo = true;
        System.out.println(bo);
        bo = false;
        System.out.println(bo);
        byte bt;
        bt = 120;
        System.out.println(bt);
        char c = 'b';
        System.out.println(c);
        short s = 5555;
        System.out.println(s);
        int i = 3333;
        System.out.println(i);
        long duzaLiczba = 1235555555555L;
        System.out.println(duzaLiczba);
        float f = 10.53F;
        double d = 53.54;
        System.out.println(f);
        System.out.println(d);
        Byte btWrapper = bt;
        bt =btWrapper;
        System.out.println(btWrapper);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int val = Integer.MAX_VALUE;
        val++;
        System.out.println(val);

        Character  ch = c;*/
        method();

        method1("Pawel", "Ujazdowski");
        String result = method2("Krzysztof", "Maziak");
        System.out.println(result);
    }


    public static void method() {
        System.out.println("wykonanie metody method");
    }

    public static void method1(String name, String surname) {
//        String name = "Włodzimierz ";
//        String surname = "Lenin";
        String sum = name + " " + surname;
        System.out.println("Nazywasz sie: " + sum);
    }


    public static String method2(String name, String surname) {
//        String name = "Włodzimierz ";
//        String surname = "Lenin";
        String sum = name + " " + surname;
        return "Nazywasz sie: " + sum;
    }
}

package day3;

import java.util.*;

public class Kolekcje {

    public static void main(String[] args) {
//        testList();
//        testSet();
//        System.out.println(writeFirst("acbybcau"));
//        testMap();

//        switchCaseStatement("dom");
//        switchCaseStatement("praca");
//        switchCaseStatement("sklep");
//        switchCaseStatement("sk");

        liczPowtorzenia1("hello world");
//        testMap2();
    }

    private static void liczPowtorzenia(String txt) {
        Map<Character, Integer> mapa = new TreeMap<>();
        char[] tablica = txt.toCharArray();
        for (char a : tablica) {
            if (mapa.containsKey(a)) {
                mapa.put(a, mapa.get(a) + 1);
            } else {
                mapa.put(a, 1);
            }
        }
        System.out.println(mapa);
    }

    private static void liczPowtorzenia1(String txt) {
        Map<Character, Integer> mapa = new TreeMap<>();
        char[] tablica = txt.toCharArray();
        for (char a : tablica) {
            mapa.put(a, mapa.get(a) == null ? 1 : mapa.get(a) + 1);
        }
        System.out.println(mapa);
    }

    private static void testMap2() {
//        Map<String, List<String>> mapMap = new TreeMap<>();
        Map<String, String> mapa = new HashMap<>();
        mapa.put("a", "Ala ma kota");
        mapa.put("b", "Kot ma ale");
        mapa.put("c", "Frodo");
        mapa.put("d", "Ala ma kota");


//        Set<String> keys = mapa.keySet();
//        for(String key : keys) {
//            System.out.println(key + " : " + mapa.get(key));
//        }
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " || " + entry.getValue());
        }
    }


    private static char writeFirst(String a) {
        char[] tablica = a.toCharArray();
        Set<Character> temp = new HashSet<>();
        for (Character c : tablica) {
            int i = temp.size();
            temp.add(c);
            if (temp.size() == i) {
                return c;
            }
        }
        return ' ';
    }


    private static void testList() {
        List<String> lista = new ArrayList<>();
        lista.add("ala");
        lista.add("ma");
        lista.add("kota");
        lista.add("a");
        lista.add("kot");
        lista.add("kot");
        lista.add("kot");
        lista.add(null);
        lista.add(null);
        lista.add(null);
        System.out.println(lista);
//        for(int i =0; i<lista.size();i++) {
//            System.out.print(lista.get(i) + "-");
//        }
//        for(String a : lista) {
//            System.out.print(a + ":");
//        }
//        lista.forEach(System.out::print);
//        lista.forEach(x -> System.out.print(x + ", "));
//        Collections.sort(lista);
//        System.out.println(lista);
//        lista.sort((x,y) -> x!=null?x.compareTo(y):0);
//        System.out.println(lista);
//        while (lista.contains("kot")) {
//            lista.remove("kot");
//        }
//
//        System.out.println(lista);
        lista.add(2, "NOWY KOT");
        System.out.println(lista);
    }

    private static void testSet() {
//        Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("ala");
        set.add("ma");
        set.add("kota");
        set.add("a");
        set.add("kot");
        set.add("kot");
        set.add("kot");
//        set.add(null);
//        set.add(null);
//        set.add(null);

//        System.out.println(set);
        for (String a : set) {
            if (a.equals("kot")) {
                System.out.println(a);
            }
//            System.out.println(a);
        }
    }


    private static void testMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("a", "Ala ma kota");
        mapa.put("b", "Kot ma ale");
        mapa.put("c", "Frodo");
        mapa.put("d", "Ala ma kota");
        System.out.println(mapa);

        System.out.println(mapa.get("c"));

        mapa.put("b", "Zmieniony kot");
        System.out.println(mapa);
    }

    private static void switchCaseStatement(String txt) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("dom", "Jestes w domu");
        mapa.put("sklep", "Jestes w sklepie");
        mapa.put("praca", "Jestes w pracy");
        if (mapa.containsKey(txt)) {
            System.out.println(mapa.get(txt));
        } else {
            System.out.println("Nie jestes nigdzie");
        }
    }

}

package day4.objects;

public class Main {
    private String name;

    public static void main(String[] args) {
        Main main = new Main();
//        main.method1();
//        main.method2();

//        new Main().method1();
//        new Main().method2();
//        main.method3();
    }


    private void method3() {
        Person ewa = new Person();
        ewa.id = 16;
        ewa.name = "Ewa";

        Person kasia = ewa;

        System.out.println(ewa);
        System.out.println(kasia);

        kasia.name = "kasia";

        System.out.println(ewa);
        System.out.println(kasia);

        int a = 17;
        int b = a;
        System.out.println("a="+a+"b="+b);
        b = 21;
        System.out.println("a="+a+"b="+b);

    }

    private void method3(String name) {
        Person ewa = new Person();
        ewa.id = 16;
    }

    private void method2() {
        System.out.println("Metoda 2 " + this.name);
    }

    private void method1() {
        Person pawel = new Person();
        pawel.id =1;
        pawel.name = "Pawel";
        pawel.surname = "Nowak";
        pawel.age = 26;
        Person.height = 192;

        Person darek = new Person();
        darek.id =2;
        darek.name = "Darek";
        darek.surname = "Kowalski";
        System.out.println(Person.height);
        darek.age = 96;


//        System.out.println(pawel.id + " " + pawel.name + " " + pawel.surname + " " + pawel.age);
//        System.out.println(darek.id + " " + darek.name + " " + darek.surname + " " + darek.age);

//        System.out.println(pawel);
//        System.out.println(darek);
        Person.height = 328;
        String p = pawel.toString();

        Person krzysiek = darek;

        Person[] persons = new Person[2];
        persons[0] = krzysiek;
        persons[1] = pawel;

        for (Person per : persons) {
            System.out.println(per);
        }
        this.name = "Jurek";
    }
}

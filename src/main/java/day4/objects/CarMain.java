package day4.objects;

public class CarMain {

    public static void main(String[] args) {
        Car bmw = new Car();
        System.out.println(bmw);
        bmw.setId(34);
        bmw.setName("BMW");
        bmw.setColour("Blue");
        System.out.println(bmw);
        bmw.setColour("Red");
        System.out.println(bmw);

        Car syrenka = new Car(54, "Syrenka", "kość słoniowa");
        System.out.println(syrenka);

        int syrenkaId = syrenka.getId();
        System.out.println(syrenkaId + " : " + syrenka.getName());
    }
}

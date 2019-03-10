package day4.objects;

public class Person {
    int id;
    String name;
    String surname;
    int age;
    static int height;
    public Person(){}

    public Person(String name) {

    }


    public void wypisz() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

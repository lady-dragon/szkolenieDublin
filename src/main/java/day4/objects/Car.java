package day4.objects;

public class Car {
    private int id;
    private String name;
    private String colour;

    public Car() {
        this.id = 17;
        this.name = "Toyota";
        this.colour = "Yellow";
    }


    public Car(int id, String name, String colour) {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

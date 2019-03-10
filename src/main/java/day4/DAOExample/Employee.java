package day4.DAOExample;

public class Employee {

    private int id;
    private String name;
    private String occupation;

    public Employee(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

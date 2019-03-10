package day4.DAOExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO emp = new EmployeeDAO();
        writeList(emp);
        Employee darek = new Employee("Darek", "Cleaner");
        emp.addEmployee(darek);
        writeList(emp);
        Employee employee = new Employee(null, null);
        employee.setId(3);
        emp.removeEmployee(employee);
        writeList(emp);
        Employee employee2 = new Employee("Anna", "Cleaner");
        employee2.setId(4);
        emp.editEmployee(employee2);
        writeList(emp);
        employee2.setId(18);
        emp.editEmployee(employee2);
        writeList(emp);
        System.out.println(emp.getEmployeeById(5));
        Employee eeee = emp.getEmployeeByName("ddd");
        System.out.println("-----------------------------------------");
        if (eeee.getId() != -1) {
            System.out.println(eeee);
        } else {
            System.out.println("Nie ma takiego człowieka");
        }
        emp.addEmployee(new Employee("Kaśka", "Miała"));
        writeList(emp);

//        String s = "dom";

//        System.out.println("Irlandia".replace('r','s'));

    }

    private static void writeList(EmployeeDAO emp) {
        List<Employee> list = emp.getAllEmployees();
        for (Employee em : list) {
            System.out.println(em);
        }
        System.out.println("***********************************");
    }
}

package day4.DAOExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
    private Map<Integer, Employee> employees;

    public EmployeeDAO() {
        employees = new HashMap<>();
        initialize();
    }

    private void initialize() {
        addEmployee(new Employee( "Ewa", "Accountant"));
        addEmployee(new Employee( "Stefan", "Plumber"));
        addEmployee(new Employee( "Jan", "General Operative"));
        addEmployee(new Employee( "Zofia", "Cleaner"));
        addEmployee(new Employee( "Piotr", "CEO"));
    }

    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    public Employee getEmployeeByName(String name) {
        List<Employee> empl = getAllEmployees();
        for (Employee e : empl) {
            if (name.equalsIgnoreCase(e.getName())) {
                return e;
            }
        }
        Employee emptyEmp = new Employee( "", "");
        emptyEmp.setId(-1);
        return emptyEmp;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> workers = new ArrayList<>(employees.values());
        return workers;
    }

    public void addEmployee(Employee employee) {
        if(employee.getId() == 0) {
            int id = checkId();
            employee.setId(id);
        }
        this.employees.put(employee.getId(), employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee.getId());

    }

    public void editEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            addEmployee(employee);
        } else {
            System.out.println("Nie ma Id w bazie");
        }
    }

    private int checkId() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!employees.containsKey(i)){
                return i;
            }
        }
        return 0;

    }
}

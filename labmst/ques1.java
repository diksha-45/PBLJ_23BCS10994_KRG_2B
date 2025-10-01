import java.util.HashMap;
class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
public class Employee{
    private HashMap<Integer, String> e = new HashMap<>();
    public void addEmployee(int id, String name) {
        e.put(id, name);
        System.out.println("Employee added: ID=" + id + ", Name=" + name);
    }    public String getEmployeeName(int id) throws EmployeeNotFoundException {
        if (!e.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee ID " + id + " not found!");
        }
        return e.get(id);
    }
    public static void main(String[] args) {
        Employee em = new Employee();
        em.addEmployee(1, "Diksha");
        em.addEmployee(2, "XYZ");
        try {
            System.out.println("Employee with ID 1: " + em.getEmployeeName(1));
            System.out.println("Employee with ID 4: " + em.getEmployeeName(4));

        } catch (EmployeeNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

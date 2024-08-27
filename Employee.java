import java.util.*;

class Employee {
    private int empId;
    private String empName;
    private double empSal;

    // Constructor to initialize the attributes
    Employee(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    // Getters to access the private attributes
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSal() {
        return empSal;
    }
}

class Test7 {
    public static void main(String[] args) {
        // Step 1: Creating an ArrayList of Employee objects
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(104, "Jack", 4000));
        al.add(new Employee(101, "Nelson", 1000));
        al.add(new Employee(102, "James", 2000));
        al.add(new Employee(103, "Hendry", 3000));

        // Step 2: Sorting the list based on empId in ascending order using Collections.sort
        Collections.sort(al, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getEmpId(), e2.getEmpId());
            }
        });

        // Step 3: Printing the sorted list
        for (Employee employee : al) {
            System.out.println(employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getEmpSal());
        }
    }
}

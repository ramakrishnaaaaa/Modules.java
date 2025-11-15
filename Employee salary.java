class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.salary = 50000;
        e.setName("Ramakrishna");

        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());
    }
}

package hmm;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100.0);
        }
    }

    public String toString() {
        return "ID: " + id + "\n Name: " + name + "\n Salary: " + salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        Employee employee2 = new Employee(2, "Jane Smith", 60000.0);

        System.out.println("Initial Employee Information:");
        System.out.println(employee1);
        System.out.println(employee2);

        employee1.raiseSalary(10);
        employee2.raiseSalary(5);

        System.out.println("Employee Information After Raise:");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

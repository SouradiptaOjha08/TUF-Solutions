package associationAggregationComposition.aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation: a Department uses Employees, but Employees can exist
 * independently of the Department.
 */
public class Aggregation {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice");
        Employee bob = new Employee("Bob");

        Department engineering = new Department("Engineering");
        engineering.addEmployee(alice);
        engineering.addEmployee(bob);

        System.out.println("Department employees: " + engineering.getEmployees());

        // The employees still exist after the Department reference is removed.
        engineering = null;
        System.out.println("Employee still exists: " + alice);
    }

    private static class Department {
        private final String name;
        private final List<Employee> employees = new ArrayList<>();

        private Department(String name) {
            this.name = name;
        }

        private void addEmployee(Employee employee) {
            employees.add(employee);
        }

        private List<Employee> getEmployees() {
            return employees;
        }
    }

    private record Employee(String name) {
        @Override
        public String toString() {
            return name;
        }
    }
}

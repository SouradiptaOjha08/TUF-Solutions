package associationAggregationComposition.association;

import java.util.ArrayList;
import java.util.List;

/**
 * Association: objects are connected, but neither object owns the other.
 *
 * This file demonstrates:
 * 1. One-to-one: Person has one Passport.
 * 2. One-to-many: Department has many Employees.
 * 3. Many-to-many: Students can take many Courses and vice versa.
 */
public class Association {
    public static void main(String[] args) {
        oneToOneExample();
        oneToManyExample();
        manyToManyExample();
    }

    private static void oneToOneExample() {
        Passport passport = new Passport("123456789");
        Person person = new Person("John Doe", passport);

        System.out.println("One-to-one association:");
        System.out.println(person.getName() + " -> " + person.getPassport().getNumber());
    }

    private static void oneToManyExample() {
        Department department = new Department("Engineering");
        department.addEmployee(new Employee("Alice"));
        department.addEmployee(new Employee("Bob"));

        System.out.println("\nOne-to-many association:");
        System.out.println(department.getName() + " -> " + department.getEmployees());
    }

    private static void manyToManyExample() {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Course java = new Course("Java");
        Course databases = new Course("Databases");

        alice.enrollIn(java);
        alice.enrollIn(databases);
        bob.enrollIn(java);

        System.out.println("\nMany-to-many association:");
        System.out.println(alice + " -> " + alice.getCourses());
        System.out.println(bob + " -> " + bob.getCourses());
        System.out.println(java + " -> " + java.getStudents());
    }

    private static class Person {
        private final String name;
        private final Passport passport;

        private Person(String name, Passport passport) {
            this.name = name;
            this.passport = passport;
        }

        private String getName() {
            return name;
        }

        private Passport getPassport() {
            return passport;
        }
    }

    private static class Passport {
        private final String number;

        private Passport(String number) {
            this.number = number;
        }

        private String getNumber() {
            return number;
        }
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

        private String getName() {
            return name;
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

    private static class Student {
        private final String name;
        private final List<Course> courses = new ArrayList<>();

        private Student(String name) {
            this.name = name;
        }

        private void enrollIn(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
                course.addStudent(this);
            }
        }

        private List<Course> getCourses() {
            return courses;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class Course {
        private final String name;
        private final List<Student> students = new ArrayList<>();

        private Course(String name) {
            this.name = name;
        }

        private void addStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
            }
        }

        private List<Student> getStudents() {
            return students;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

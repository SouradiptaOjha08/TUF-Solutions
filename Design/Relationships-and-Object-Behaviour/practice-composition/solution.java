// Your code goes here
import java.util.*;

// University class represents a university
class University {

  // List to store multiple College objects belonging to this university
  private List<College> colleges;

  // Stores the name of the university
  private String name;

  // Constructor of University class
  // This is called automatically when a University object is created
  University(String name) {

    // Creates an empty ArrayList to store College objects
    this.colleges = new ArrayList<>();

    // Assigns the given university name to the current object's name variable
    this.name = name;
  }

  // Method to add a college to the university
  public void addCollege(String collegeName, String collegeId) {

    // Creates a new College object using the given name and id,
    // then adds it to the colleges list
    colleges.add(new College(collegeName, collegeId));
  }

  // Method to display university details along with all college details
  public void displayDetails() {

    // Prints the university name
    System.out.println("University Name : " + name);

    // Loops through each College object stored in the colleges list
    for (College college : colleges) {

      // Calls the displayDetails method of each College object
      college.displayDetails();
    }
  }
}

// College class represents a college
class College {

  // Stores the name of the college
  private String name;

  // Stores the ID of the college
  private String id;

  // Constructor of College class
  // This is called automatically when a College object is created
  public College(String name, String id) {

    // Assigns the given college name to the current object's name variable
    this.name = name;

    // Assigns the given college id to the current object's id variable
    this.id = id;
  }

  // Method to display college details
  public void displayDetails() {

    // Prints the college name
    System.out.println("College Name : " + name);

    // Prints the college ID
    System.out.println("College ID : " + id);
  }
}

// Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your class `University` and the class 'College'.


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        List<String> collegeName, collegeId;

        //creating the object of class University with the name as constructor argument
        University university = new University(name);

        //adding the collge names and id using the addCollege mthod called through the university object
        for (int j = 0; j < collegeName.size(); j++) {
            university.addCollege(collegeName.get(j), collegeId.get(j));
        }

        //calling the method displayDetails through the university object
        university.displayDetails();

        scanner.close();
    }
}

*/

/*
//Below is the output format

System.out.println("University Name : " + name);
System.out.println("College Name : " + name);
System.out.println("College ID : " + id);

*/

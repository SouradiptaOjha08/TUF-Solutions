package cloning; // this class belongs to the "cloning" package

/*
 * Cloneable + clone() - simple example
 *
 * - Cloneable is a marker interface (no methods). Without it, clone() throws CloneNotSupportedException.
 * - super.clone() makes a SHALLOW copy: primitives/Strings are copied, but object fields share the same reference.
 * - For a DEEP copy, also clone the inner object manually inside clone().
 */

// Address implements Cloneable, which gives permission to clone its objects
class Address implements Cloneable {
    String city; // the only data this class holds

    // constructor: creates an Address with the given city
    Address(String city) {
        this.city = city; // store the passed city in this object's field
    }

    @Override // we are overriding Object.clone()
    // made public (Object.clone() is protected) so other classes can call it
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone(); // Object.clone() copies this object; cast it back to Address
    }
}

// Student implements Cloneable so that Student objects can be cloned
class Student implements Cloneable {
    String name;     // a String is immutable, so copying it is always safe
    Address address; // an object reference, this is what makes shallow vs deep matter

    // constructor: creates a Student with a name and an address
    Student(String name, Address address) {
        this.name = name;       // store the name
        this.address = address; // store the reference to the Address object
    }

    // Shallow clone: the copy shares the same Address object
    Student shallowClone() throws CloneNotSupportedException {
        return (Student) super.clone(); // copies name and the address REFERENCE (not the Address object itself)
    }

    // Deep clone: the copy gets its own Address object
    Student deepClone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone(); // step 1: shallow copy first
        copy.address = this.address.clone();    // step 2: replace the shared address with a brand new copy
        return copy;                            // return the fully independent copy
    }

    // prints the student's name and city
    void display() {
        System.out.println(name + " lives in " + address.city);
    }
}

public class CloneableExample {
    // main declares "throws" because clone() can throw CloneNotSupportedException
    public static void main(String[] args) throws CloneNotSupportedException {
        // create the original student with an address in Kolkata
        Student original = new Student("Aarav", new Address("Kolkata"));

        Student shallow = original.shallowClone(); // copy that shares the Address with the original
        Student deep = original.deepClone();       // copy that has its own separate Address

        original.address.city = "Delhi"; // change the city through the original

        System.out.print("Original : "); // label (print without a new line)
        original.display();              // Delhi, because we changed it
        System.out.print("Shallow  : ");
        shallow.display(); // Delhi, because it shares the same Address object as the original
        System.out.print("Deep     : ");
        deep.display();    // Kolkata, because it has its own Address object
    }
}

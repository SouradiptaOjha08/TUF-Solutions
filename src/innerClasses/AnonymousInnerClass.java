package innerClasses;

/*
 * Anonymous Inner Class
 *
 * Definition:
 * - An anonymous inner class is an inner class with no name that is both declared and
 *   instantiated in a single expression, using `new` followed by a supertype:
 *   `SuperType obj = new SuperType() { ... };`
 * - The supertype must be a class to extend or an interface to implement.
 * - The class body given after `new` is the definition; the object is created immediately.
 * - Common uses: one-off implementations of interfaces (Runnable, Comparator, listeners),
 *   subclasses overriding a few methods, and short callbacks/lambdas before Java 8.
 *
 * Rules:
 * - Cannot be declared with a name, access modifier, `static`, or `abstract`.
 * - Can extend at most one class or implement exactly one interface, not both.
 * - Cannot declare constructors (the class has no name); use an instance initializer block
 *   if setup code is needed.
 * - Must implement all abstract methods of the supertype.
 * - Can access all members of the enclosing class, including private ones.
 * - Can access local variables of the enclosing block only if they are final or effectively
 *   final, exactly like local inner classes.
 * - Cannot declare static members, except `static final` compile-time constants
 *   (`static` members in inner classes are allowed from Java 16 onward).
 * - `this` inside the body refers to the anonymous instance; use `Outer.this` for the
 *   enclosing instance.
 * - New methods added in the body cannot be called through a supertype reference; use
 *   `var` (Java 10+) if they must be reachable.
 * - From Java 9, the diamond operator can be used with anonymous classes where the
 *   supertype is inferable: `new Handler<>() { ... }`.
 */
public class AnonymousInnerClass {

    private int outerVal = 100;

    interface Greeting {
        void greet(String name);
    }

    abstract static class Animal {
        abstract void sound();

        void sleep() {
            System.out.println("Sleeping...");
        }
    }

    void demoLocalCapture() {
        int localVar = 10; // Effectively final - captured by the anonymous class

        // Anonymous implementation of an interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name + ", localVar = " + localVar
                        + ", outerVal = " + outerVal);
            }
        };
        greeting.greet("Hello");

        // Anonymous subclass of an abstract class, with an instance initializer
        Animal animal = new Animal() {
            {
                System.out.println("Anonymous instance initializer");
            }

            @Override
            void sound() {
                System.out.println("Meow");
            }
        };
        animal.sound();
        animal.sleep();
    }

    public static void main(String[] args) {
        AnonymousInnerClass demo = new AnonymousInnerClass();
        demo.demoLocalCapture();

        // Anonymous class passed directly as a method argument
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous Runnable");
            }
        };
        task.run();
    }

}

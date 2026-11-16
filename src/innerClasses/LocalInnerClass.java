package innerClasses;

/*
 * Local Inner Class
 *
 * Definition:
 * - A local inner class is a class declared inside a block: a method body, constructor,
 *   instance initializer, static initializer, or a loop/conditional block.
 * - It is not a member of the outer class; it exists only within the block where it is declared.
 * - It is instantiated only inside that block:
 *   `class LocalInner { ... }`
 *   `LocalInner obj = new LocalInner();`
 * - Local inner classes are not part of the outer class's public API; they are hidden
 *   implementation details of the block.
 *
 * Rules:
 * - Cannot be declared with any access modifier (public, private, protected).
 * - Cannot be declared `static` (a local class of a static context is still not static).
 * - Its scope is limited to the block in which it is declared; it cannot be used outside.
 * - Can access all members of the enclosing class, including private ones.
 * - Can access local variables of the enclosing block only if they are final or effectively
 *   final; captured variables are copied and must not be reassigned after capture.
 * - Cannot declare static members, except `static final` compile-time constants
 *   (`static` members in local/inner classes are allowed from Java 16 onward).
 * - Can extend a class or implement interfaces, and can be abstract (but must then be
 *   subclassed inside the same block).
 * - Cannot be instantiated more than once per block only by choice; multiple instances are
 *   allowed, unlike anonymous classes.
 */
public class LocalInnerClass {

    private int outerVal = 100;

    void outerMethod() {
        int localVar = 10; // Effectively final - never reassigned

        // Class defined inside a method
        class LocalInner {
            void display() {
                // Can access effectively final local variables of the enclosing block
                System.out.println("Local variable : " + localVar);
                // Can access members of the enclosing class
                System.out.println("Outer field    : " + outerVal);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        LocalInnerClass demo = new LocalInnerClass();
        demo.outerMethod();
    }

}

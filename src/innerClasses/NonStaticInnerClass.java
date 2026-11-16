package innerClasses;

/*
 * Non-Static Inner Class (Member Inner Class)
 *
 * Definition:
 * - A non-static inner class is a class declared inside an outer class without the `static` modifier.
 * - Every instance of it is linked to an instance of the outer class; the compiler adds a hidden
 *   reference to that outer object (accessible as `OuterClass.this`).
 * - It must be instantiated through an outer-class object:
 *   `OuterClass outer = new OuterClass();`
 *   `OuterClass.Inner inner = outer.new Inner();`
 * - It can directly access all members of the outer class, both static and instance,
 *   including private ones.
 * - It can declare non-static members, but cannot declare static members (other than
 *   `static final` compile-time constants) because it is tied to an outer instance.
 *
 * Limitations:
 * - Cannot exist without an enclosing outer-class instance.
 * - Cannot be instantiated from a static context without first creating an outer object.
 * - Cannot declare `static` methods or non-constant `static` fields.
 * - Holds an implicit reference to the outer object, which can cause memory leaks if the inner
 *   object outlives the outer one.
 * - Cannot be instantiated as `new OuterClass.Inner()` the way a static nested class can.
 */
public class NonStaticInnerClass {
    int val = 10;
    static int staticVal = 20;

    class Inner {
        int val = 30;

        void printVal() {
            // Own field of the inner class
            System.out.println("Inner val       : " + val);
            // Outer instance's field via OuterClass.this
            System.out.println("Outer val       : " + NonStaticInnerClass.this.val);
            // Static members of the outer class are accessible directly
            System.out.println("Outer staticVal : " + staticVal);
        }
    }

    public static void main(String[] args) {
        // An inner-class instance always needs an outer-class instance
        NonStaticInnerClass outer = new NonStaticInnerClass();
        NonStaticInnerClass.Inner inner = outer.new Inner();
        inner.printVal();
    }

}

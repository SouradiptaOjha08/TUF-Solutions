package innerClasses;

/*
 * Static Nested Class (Static Inner Class)
 *
 * Definition:
 * - A static nested class is a class declared with the `static` modifier inside an outer class.
 * - Unlike non-static inner classes, it is associated with the outer class itself rather than
 *   any specific instance of the outer class.
 * - It can be instantiated without creating an object of the outer class:
 *   `OuterClass.InnerClass obj = new OuterClass.InnerClass();`
 * - It can access all static members (including private static fields and methods) of the outer class,
 *   and it can declare both static and non-static members of its own.
 *
 * Limitations:
 * - Cannot directly access non-static (instance) variables or methods of the outer class;
 *   an explicit reference to an outer class instance is required to access them.
 * - Cannot use `OuterClass.this` because it does not hold an implicit reference to an enclosing instance.
 * - Top-level classes cannot be marked `static`; only nested classes can be static.
 * - Since it is independent of outer-class instances, it cannot directly represent state tied to a
 *   specific outer object without explicitly passing one.
 */
public class StaticInnerClass {
    static int val = 10;

    static class Inner {
        void printVal() {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
        inner.printVal();
    }

}

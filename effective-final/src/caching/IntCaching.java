package caching;

/**
 * Integer Caching in Java.
 * Integer caching was introduced in Java 5 to improve memory efficiency (...just use .equal it's saferrr)
 * This caching applies to Integer values in the range from -128 to 127.
 * Autoboxing of these values will reuse the same cached Integer object.
 * Note: Integer objects are not cached if created using the constructor.
 */
public class IntCaching {
    public static void main(String[] args) {
        Integer val1 = 100;
        Integer val2 = 100;
        System.out.println(val1 == val2); // true, both refer to the same cached object

        Integer _val1 = 128;
        Integer _val2 = 128;
        System.out.println(_val1 == _val2); // false, different objects created outside the cache range

        // equals() compares the values of Integer objects.
        System.out.println(_val1.equals(_val2)); // true, compares values, which are the same
    }
}

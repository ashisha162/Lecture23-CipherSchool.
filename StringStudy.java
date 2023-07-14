package strings;

public class StringStudy {
    public static void main(String[] args) {
        String name = "Cipherschools"; // created using string literals stored in the method area
        String name2 = "CipherSchools";
        String name3 = new String("CipherSchools"); // creating string using constructors
        String name4 = new String("Cipher Schools");
        
        System.out.println(name == name2); // operator compares references for objects and values for primitives
        System.out.println(name3 == name4);
        System.out.println(name == name3);
        
        // STRINGS ARE IMMUTABLE
        // Every time we do an operation on a string, a new object is created
        
        System.out.println("1. CONCATENATION");
        String s1 = "Hello";
        s1 = s1 + "Peps";
        System.out.println(s1);
        System.out.println(s1 + "How're you doing?");
        System.out.println(s1); // s1 remains the same
        
        // Another way to concatenate is to use the concat() function
        String s2 = new String("Hello");
        String s3 = new String(" People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2); // remains the same
        
        System.out.println("===========================");
        System.out.println("2. CHECKING IF STRINGS ARE EQUAL IN VALUE");
        
        // 2. CHECKING IF STRINGS ARE EQUAL IN VALUE
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        // equals() function -> Object class.
        // This generally compares references (hashcodes) of objects (just like == )
        // But, for the String class, it has been overridden to check for content equality
        
        System.out.println("==================================");
        System.out.println("3) CREATING NEW STRING OBJECT FROM CHARACTER ARRAY");
        
        // 3) Creating a new String object from a character array
        char[] arr =  {'C', 'I', 'P', 'H', 'E', 'R'};
        String strFromArr = new String(arr); // constructor overloaded
        System.out.println(strFromArr);
    }
}

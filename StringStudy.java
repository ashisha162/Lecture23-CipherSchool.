package strings;

import java. util.Scanner;

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
        char[] arr = {'C', 'I', 'P', 'H', 'E', 'R'};
        String strFromArr = new String(arr); // constructor overloaded
        System.out.println(strFromArr);

        System.out.println("============================");
        System.out.println("4) CREATING PARTIAL STRING OBJECT FROM CHARACTER ARRAY");

        char[] arr2 = {'C', 'T', 'P', 'H', 'E', 'R'};
        String partialStrFromArr = new String(arr2, 1, 3);
        System.out.println(partialStrFromArr);

        String partialStrFromArr2 = new String(arr2, 2, 3);
        System.out.println(partialStrFromArr2);

        System.out.println("===================================");
        System.out.println("5) CHANGING THE CASE");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name); // remains the same

        System.out.println("================================ ");
        System.out.println("6) SPLITTING");
        System.out.println("Please enter your full name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        String[] strArr = fullName.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println("Please enter something separated by commas: ");
        String csvText = sc.nextLine(); // Cipher Schools welcomes You
        String[] csvArr = csvText.split(",");
        for (int i = 0; i < csvArr.length; i++) {
            System.out.println(csvArr[i]);
        }

        System.out.println("Please enter something separated by dots: ");
        String dotText = sc.nextLine();
        String[] dotArr = dotText.split("\\.");
        for (int i = 0; i < dotArr.length; i++) {
            System.out.println(dotArr[i]);
        }

        String backSlashText = "Hello, I attend \"Java\" Class"; // these are special chars: \" etc
        String[] backslashArr = backSlashText.split("\"");
        for (int i = 0; i < backslashArr.length; i++) {
            System.out.println(backslashArr[i]);
        }

        System.out.println("================================ ");
        System.out.println("7) LENGTH OF A STRING");

        int len = name.length();
        System.out.println("Length of " + name + " is: " + len);

        System.out.println("================================ ");
        System.out.println("8) FINDING INDEX OF A CHAR IN A STRING");

        int index = name.indexOf('e');
        System.out.println("Index of 'e' in " + name + " is: " + index);

        int index2 = name.indexOf('E'); // returns -1 if not found
        System.out.println("Index of 'E' in " + name + " is: " + index2);

        int index3 = name.indexOf("School"); // return first occurrence of that string
        System.out.println("Index of 'School' in " + name + " is: " + index3);

        int index4 = name.indexOf('o', 10); // start searching from index 10 (including 10)
        System.out.println("Index of 'o' in " + name + " starting from index 10 is: " + index4);

        int indexOfO = 0;
        while (true) {
            indexOfO = name.indexOf('o', indexOfO + 1);
            if (indexOfO == -1)
                break;
            System.out.println("'o' found at index: " + indexOfO);
        }
    }
}

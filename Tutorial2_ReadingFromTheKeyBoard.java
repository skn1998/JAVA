import java.util.Scanner; // importing the Scanner class

public class Tutorial2_ReadingFromTheKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // new keyword creates an object of the class on the heap

        String myString1, myString2; // String is also a class in Java and strings are immutable in Java
        System.out.print("Give myString1: ");
        myString1 = sc.nextLine(); // reads the whole line
        System.out.printf("myString1 is: %s.\n", myString1);
        System.out.print("Give myString2: ");
        myString2 = sc.next(); // reads one string before any space
        System.out.printf("myString2 is: %s.\n", myString2);

        int b;
        System.out.print("Give the code: ");
        if(sc.hasNextInt()) {
            b = sc.nextInt();
            System.out.printf("b is %d.\n", b);
        }
        else {
            System.out.println("Integer not provided!");
        }
    }
}

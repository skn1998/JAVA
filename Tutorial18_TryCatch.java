import jdk.jfr.Experimental;

import java.security.spec.ECField;
import java.util.Scanner;

public class Tutorial18_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Give a: ");
        a = sc.nextInt();
        System.out.print("Give b: ");
        b = sc.nextInt();
        try{
            System.out.printf("%d when divided by %d gives: %d.\n", a, b, a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
        // note we can have try and multiple catch blocks //
        int index1, index2;
        int [] arr = {11, 21, 34, 16, 15};
        try{
            System.out.print("Give index1: ");
            index1 = sc.nextInt();
            System.out.printf("Element at %d index is: %d.\n", index1, arr[index1]);
            System.out.print("Give index2: ");
            index2 = sc.nextInt();
            System.out.printf("Element at %d index is: %d.\n", index2, arr[index2]);
            System.out.print("Give b: ");
            b = sc.nextInt();
            System.out.printf("%d when divided by %d gives: %d.\n", arr[index1]+arr[index2], b, (arr[index1]+arr[index2])/b);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception!");
        }
        catch(Exception e){
            System.out.println("Some exception occurred!");
        }
    }
}

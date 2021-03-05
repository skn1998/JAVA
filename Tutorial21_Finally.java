/*
1. Finally block gets always executed no matter exception has been handled or not, function has returned etc.
2. We can use finally after try i.e. try - finally or after try - catch i.e. try - catch - finally.
 */

import java.util.Scanner;

public class Tutorial21_Finally {

    public static int divide(int a, int b) throws Exception{
        try{
            return a/b;
        }
        catch(Exception e){
            return -1;
        }
        finally {
            System.out.println("Function execution completed!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Give a: ");
        a = sc.nextInt();
        System.out.print("Give b: ");
        b = sc.nextInt();
        try{
            System.out.printf("%d when divided by %d gives: %d.\n", a, b, divide(a, b));
        }
        catch(Exception e){
            System.out.println("Exception occurred!");
        }
    }
}

// we can also throw qan exception by our own //

import java.util.Scanner;

public class Tutorial19_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Give a: ");
        a = sc.nextInt();
        System.out.print("Give b: ");
        b = sc.nextInt();
        if(b==0){
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception!");
            }
        }
        else{
            System.out.printf("%d when divided by %d gives: %d.\n", a, b, a/b);
        }
    }
}

import java.util.Scanner;

// When we use throws it becomes mandatory to handle the exception
public class Tutorial20_Throws {

    public static int divide(int a, int b) throws Exception {
        return a/b;
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

import java.util.Scanner;

public class Tutorial5_Conditionals {
    public static void main(String[] args) {
        // if else //
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the check: ");
        flag = sc.nextBoolean();
        if(flag)
            System.out.println("The statement is correct!");
        else
            System.out.println("The statement is incorrect");


        // switch //
        int a;
        System.out.print("Give a: ");
        a = sc.nextInt();
        switch(a)
        {
            case 1: case 2:{
                System.out.println("Less than 3.");
                break;
            }
            case 3:{
                System.out.println("Equals to 3.");
                break;
            }
            default:{
                System.out.println("Try again!");
            }
        }
    }
}

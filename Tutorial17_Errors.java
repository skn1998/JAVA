/*
Types of error:
1. Syntax error ->can be identified while compiling
2. Logical error ->can not be identified while compiling, can only be detected by the programmer
3. Runtime error/ Exception ->can not be identified while compiling, can only be detected by the user
*/

public class Tutorial17_Errors {
    public static void main(String[] args) {
        // a = 4; this is Syntax error

        // logical error for finding prime numbers
        int i;
        for(i=3;i<=10;i+=1) {
            if(i%2!=0)
                System.out.printf("%d ", i);
        }
        System.out.println();

        /*runtime error
        int a, b;
        a = 12;
        b = 0;
        System.out.println(a/b); -> arithmetic exception
         */
    }
}

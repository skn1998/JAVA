public class Tutorial8_Methods {
    public static int add(int a, int b){
        return a + b;
    }

    public static int multiply() {
        return -1;
    }

    public static int multiply(int a) {
        return a;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static int addNumbers(int...a){
        int ans = 0;
        for(int ele:a)
            ans+=ele;
        return ans;
    }

    public static void main(String[] args) {
        int result;
        result = add(2, 3);
        System.out.printf("Adding these two numbers we will get: %d.\n",result);

        // method overloading //
        System.out.println(multiply());
        System.out.println(multiply(1));
        System.out.println(multiply(1, 2));
        System.out.println(multiply(1, 2, 3));

        System.out.println(addNumbers());
        System.out.println(addNumbers(1));
        System.out.println(addNumbers(1, 2));
        System.out.println(addNumbers(1, 2, 3));
    }
}

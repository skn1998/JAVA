public class Tutorial6_Loops {
    public static void main(String[] args) {
        // while loop // ->it checks the condition and then work accordingly
        int i = 1;
        while(i<10) {
            System.out.printf("%d ", i);
            i+=1;
        }
        System.out.println();

        // do - while loop // ->it executes the body and then checks hence is executed at least once
        i = 1;
        do {
            System.out.printf("%d ", i+10);
            i+=1;
        }
        while(i<10);
        System.out.println();

        // for loop //
        for(i=1;i<10;i+=1)
            System.out.printf("%d ", i+20);
    }
}

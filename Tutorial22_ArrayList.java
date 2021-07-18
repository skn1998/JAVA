import java.util.ArrayList;

public class Tutorial22_ArrayList {
    public static void main(String[] args) {
        // Use API documentation there are a lot of things in collection framework //
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(23);
        arr.add(14);
        System.out.println(arr);
        System.out.printf("Length of arr is: %d.\n", arr.size());
        for(int ele: arr){
            System.out.printf("%d ", ele);
        }
        System.out.println();
    }
}

public class Tutorial7_Arrays {
    public static void main(String[] args) {
        // Arrays are also class in JAVA //

        // method 1 //
        int [] arr1 = new int[5]; // declaration and allocation

        // method 2 //
        int [] arr2; // declaration
        arr2 = new int[5]; // allocation

        // method 3 //
        int [] arr3 = {1, 2, 3, 4, 5}; // declaration and initialization

        System.out.println(arr3.length);

        // for-each loop //
        for(int ele:arr3)
            System.out.printf("%d ", ele);

        // 2D string //
        int [][] arr = new int[2][4];
        String [][][] str_arr = new String[4][4][2];
    }
}

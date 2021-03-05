// An interface has default public methods and data //
// No public methods can have a body //
// We can have private and default (with default modifier) methods having bodies //
// We can only have default public data and they are final //
// A class can implement multiple interfaces //
// interface can also be extended by other interfaces //
// multiple inheritance in interfaces are allowed //

interface IF1{
    int a = 12; // by default public

    private void method1(){
        System.out.println("Method 1 in IF1 called from Method 2 in IF1!");
    }
    default void method2(){
        method1();
    }
    void method3();
};

interface IF2{
    void method4();
};

interface IF3 extends IF1, IF2{
    void method6();
}

class Class1{
    public void method5(){
        System.out.println("Method 5 in Class1!");
    }
};

class Base1 extends Class1 implements IF1, IF2{
    public void method3(){
        System.out.println("Method 2 in Base1!");
    }
    public void method4(){
        System.out.println("Method 4 in Base1!");
    }
};

public class Tutorial16_Interface {
    public static void main(String[] args) {
        Base1 obj = new Base1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
    }
}

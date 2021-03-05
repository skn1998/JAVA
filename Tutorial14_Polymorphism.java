class BC{
    public void method1(){
        System.out.println("Method 1 in base class!");
    }
    public void method2(){
        System.out.println("Method 2 in base class!");
    }
}

class DC extends BC{
    @Override
    public void method1(){
        System.out.println("Method 1 in derived class!");
    }
    public void method3(){
        System.out.println("Method 3 in derived class!");
    }
}

public class Tutorial14_Polymorphism {
    public static void main(String[] args) {
        // we can create an object of the base class having reference to the derived class //
        BC obj = new DC();
        // we can run all the methods of base class and overridden methods, but we can not run the methods of the derived class //
        obj.method1();
        obj.method2();

        // we can not create an object of the derived class having reference to the base class //
    }
}

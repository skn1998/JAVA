// A method having no body is known as an abstract method //
// A class having at least one abstract method is known as abstract class //
// We can not create an object of the abstract class //
// Class extending the abstract class needs to define the abstract method otherwise that class will also become abstract //

abstract class AbClass{
    public void method1(){
        System.out.println("Method 1 in abstract class!");
    }
    public abstract void method2();
};

abstract class SubClass1 extends AbClass{
    public void method3(){
        System.out.println("Method 3 in Subclass 1!");
    }
};

class SubClass2 extends SubClass1{
    @Override
    public void method2(){
        System.out.println("Method 2 in Subclass 2");
    }
};

public class Tutorial15_AbstractClass {
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2();
        obj.method2();
    }
}

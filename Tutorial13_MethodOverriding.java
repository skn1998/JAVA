// in case of method overriding the method of the derived class is called //
class BaseClass{
    public void fun(){
        System.out.println("Base class method!");
    }
};
class SubClass extends BaseClass{
    @Override
    public void fun(){
        System.out.println("Derived class method!");
    }
};

public class Tutorial13_MethodOverriding {
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        bc.fun();

        SubClass sc = new SubClass();
        sc.fun();
    }
}

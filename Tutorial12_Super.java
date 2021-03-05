// super keyword is used to call non-default base class constructor //
// this keyword behaves similar to the this keyword in Cpp //

class Base{
    public Base(){
        System.out.println("Base constructor with no argument!");
    }
    public Base(int a){
        System.out.println("Base constructor with 1 argument!");
    }
    public Base(int a, int b){
        System.out.println("Base constructor with 2 argument!");
    }
};

class Derived1 extends Base{
    public Derived1(){
        System.out.println("Derived constructor with no argument!");
    }
};

class Derived2 extends Base{
    public Derived2(int a){
        super(2);
        System.out.println("Derived constructor with 1 argument!");
    }
};

public class Tutorial12_Super {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2(12);
    }
}

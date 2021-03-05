// In Java we can not do multiple inheritance //
// We use extends keyword to inherit a class //
// In Inheritance constructor of the base class is called first then of the sub class//

class Human {
    public String name;
    public int age;
};

class Indian extends Human {
    public String state;
    public long number;

    public void introduce(){
        System.out.printf("Name: %s, Age: %d, State: %s, Number: %d", name, age, state, number);
    }
}

public class Tutorial11_Inheritance {
    public static void main(String[] args) {
        Indian ram = new Indian();
        ram.name = "Ram";
        ram.age = 22;
        ram.state = "Sikkim";
        ram.number = 1234567890;

        ram.introduce();
    }
}

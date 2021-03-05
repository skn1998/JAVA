class Employee
{
    public String name;
    private int experience;
    private int salary;

    // default constructor //
    public Employee(){
        name = "no_name";
        experience = -1;
        salary = -1;
    }

    // overloaded constructors //
    public Employee(String name, int experience){
        this.name = name;
        this.experience = experience;
        salary = -1;
    }

    public Employee(String name, int experience, int salary){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public void introduce(){
        System.out.printf("Name is: %s, experience: %d, salary: %d.\n", name, experience, salary);
    }

}

public class Tutorial10_Constructor {
    public static void main(String[] args) {
        Employee saurav = new Employee();
        Employee nishant = new Employee("Nishant", 2);
        Employee ravi = new Employee("Ravi", 2, 20000);

        saurav.introduce();
        nishant.introduce();
        ravi.introduce();
    }
}

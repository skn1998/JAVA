class Student
{
    public String name;
    private String roll;
    private float cgpa;

    public void setRoll(String iroll) {
        roll = iroll;
    }

    public void setCgpa(float icgpa) {
        cgpa = icgpa;
    }

    public String getRoll() {
        return roll;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void introduce(){
        System.out.printf("Hello! I am %s, and my roll number is %s. My CGPA is %f.\n", name, roll, cgpa);
    }
};


public class Tutorial9_ClassAndObject {
    public static void main(String[] args) {
        Student saurav = new Student();
        saurav.name = "Saurav Kumar Nishant";
        saurav.setRoll("17CH30049");
        saurav.setCgpa(8.59f);
        saurav.introduce();
    }
}

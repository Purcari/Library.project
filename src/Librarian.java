public class Librarian {
    private String fullName;
    private int age;
    private char sex;
    private double salary;
    private int shift;
    private String daysOff;

    public Librarian(String fullName, String daysOff, int age, char sex) {
        this.fullName = fullName;
        this.daysOff = daysOff;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.shift = shift;


    }

    public Librarian(String fullName, String daysOff) {
        this.fullName = fullName;
        this.daysOff = daysOff;
}
    public Librarian() {

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setAge(int age) {
        if (this.age < age) {
            System.out.println("Error! Age cannot be less than current age.");
        } else {
            if (age < 0 || age >= 120) {
                System.out.println("Error! Age is invalid.");
                this.age = 0;
            } else {
                this.age = age;
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + fullName  + daysOff;
    }

}

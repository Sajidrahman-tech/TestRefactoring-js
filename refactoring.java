public class refactoring {
    private String name;  // Original variable name
    private int age;      // Original variable name

    // Constructor
    public Person(String name, int age) {
        this.name = name;  // Original assignment
        this.age = age;    // Original assignment
    }

    // Method to display person's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.display();
    }
}
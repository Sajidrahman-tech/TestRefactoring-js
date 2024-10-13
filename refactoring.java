public class refactoring {
    private String fullName;  // Renamed variable
    private int yearsOld;     // Renamed variable
    private String gender;     // New variable

    // Constructor
    public Person(String fullName, int yearsOld, String gender) {
        this.fullName = fullName;  // Updated assignment
        this.yearsOld = yearsOld;   // Updated assignment
        this.gender = gender;        // New assignment
    }

    // Method to display person's details
    public void display() {
        System.out.println("Full Name: " + fullName + ", Age: " + yearsOld + ", Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "Male");  // Updated constructor call
        person.display();
    }
}
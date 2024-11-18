public class addressBookExtended {
    public static void main(String[] args) {
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890", "Teacher");
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-899-9955", "Student");
        p2.print();
        Person p3 = new Person("Bella", "bella@gmail.com", "126-754-3890", "Student");
        p3.print();
        Person p4 = new Person("Eliza", "eliza@gmail.com", "123-456-7890", "Student");
        p4.print();

        p1.updateEmail("edda@gmail.com");
        p2.updateEmail("hannnah@gmail.com");
        p3.updateEmail("bellaa@gmail.com");
        p4.updateEmail("elizza@gmail.com");

    }
}

class Person {
    private String name;
    private String email;
    private String phoneNumber;
    private String occupation;

    public Person(String Name, String Email, String Phone, String Occupation) {
        this.name = Name;
        this.email = Email;
        this.phoneNumber = Phone;
        this.occupation = Occupation;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Occupation: " + occupation);
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOccupation() {
        return occupation;
    }

    public void updateName(String newName) {
        name = newName;
    }
    public void updateEmail(String newEmail) {
        email = newEmail;
    }
    public void updatePhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }
    public void updateOccupation(String newOccupation) {
        occupation = newOccupation;
    }
}

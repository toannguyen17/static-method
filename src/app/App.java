package app;

public class App {
    public static void main(String[] args) throws Exception {
        Student.change(); // calling change method

        // creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        // calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

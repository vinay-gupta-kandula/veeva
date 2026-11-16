class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        Student s1 = new Student("Vinay");
        s1.display();
    }
}
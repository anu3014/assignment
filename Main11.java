package Sapthagiri1;
class Student2 {
    static String college = "Sapthagir College";
    String name;
    Student2(String n) {
        name = n;
    }
    static void showCollege() {  
        System.out.println("College: " + college);
    }
    void display() {
        System.out.println(name + " - " + college);
    }
}
public class Main11 {
    public static void main(String[] args) {
        Student2.showCollege();
        Student2 s1 = new Student2("navya");
        Student2 s2 = new Student2("kavya");
        s1.display();
        s2.display();
    }
}
package Sapthagiri1;
class Stud{
    String name;
    int age;
    Stud() {
        name = "Unknown";
        age = 0;
    }
    Stud(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        Stud s1 = new Stud();
        Stud s2 = new Stud("Veena", 20);
        s1.display();
        s2.display();
    }
}
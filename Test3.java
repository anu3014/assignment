package Sapthagiri1;
class Calc {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) 
    {
    	return a + b + c;
    	} 
}
class Parent1 {
    void show() {
    	System.out.println("Parent");
    	}
}
class Child extends Parent1 {
    void show() {
    	System.out.println("Child");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        Parent1 p = new Child();
        p.show();
    }
}
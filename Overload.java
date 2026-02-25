package Sapthagiri1;
public class Overload{
	 int add(int a, int b) {
		 System.out.println("sum of two integer value");
		 return a+b;
	 }
	 int add(int a,int b,int c) {
		 System.out.println("sum of three integer value");
		 return a+b+c;
	 }
	 double add(double a, double b) {
		 System.out.println("sum of two double value");
		 return a+b;
	 }
	 public static void main(String[] args) {
		 Overload od=new Overload();
		 System.out.println(od.add(4,1.2));
		 System.out.println(od.add(2, 4,5));
	 }
}
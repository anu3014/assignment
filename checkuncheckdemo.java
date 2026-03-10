package Sapthagiri1;
import java.io.*;
public class checkuncheckdemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: " + e);
        }
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }
    }
}
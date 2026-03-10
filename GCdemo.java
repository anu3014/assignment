package Sapthagiri1;
class Demo {
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}
public class GCdemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1 = null;  
        System.gc(); 
    }
}
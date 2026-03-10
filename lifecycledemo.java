package Sapthagiri1;
class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        LifeCycleDemo t2 = new LifeCycleDemo();

        System.out.println("State after creation: " + t2.getState());

        t2.start();
        System.out.println("State after start: " + t2.getState());

        try {
            Thread.sleep(100);
        } catch (Exception e) {}

        System.out.println("State after sleep: " + t2.getState());
    }
}
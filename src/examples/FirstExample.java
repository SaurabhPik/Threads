package examples;

//using Threads class
public class FirstExample {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        //Thread t1 = new Thread(obj1)
        obj1.setName("1st Thread");
        obj2.setName("2nd thread");
        obj1.setPriority(2);
        obj2.setPriority(10);
        System.out.println("first thread : " + obj1.getName() + " : " + obj1.getPriority());
        System.out.println("first thread : " + obj2.getName() + " : " + obj2.getPriority());

        obj1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        obj2.start();
    }
}

class hi extends Thread {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class hello extends Thread {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("hello");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}


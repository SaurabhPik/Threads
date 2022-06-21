public class FirstExample {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        obj1.show();
        obj2.show();
    }
}

class hi {
    public void show() {
        for (int i=1; i<=5; i++) {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class hello {
    public void show() {
        for (int i=1; i<=5; i++) {
            System.out.println("hello");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}


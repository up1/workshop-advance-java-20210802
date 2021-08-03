package patterns;

public class DemoSingleton {
    public static void main(String[] args) {
        Process p1 = Process.newInstance();
        Process p2 = Process.newInstance();
        System.out.println(p1);
        System.out.println(p2);
        p1.start();
        p2.start();
    }
}

class Process {
    private int count;
    private static Process instance;
    private Process(){}

    public static Process newInstance() {
        if (instance == null) {
            instance = new Process();
        }
        return instance;
    }

    public void start() {
        count++;
        System.out.println("Call start method with count=" + count);
    }

}

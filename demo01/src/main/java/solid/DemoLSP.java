package solid;

public class DemoLSP {
    public static void main(String[] args) {
        BaseProcess1[] processes = new BaseProcess1[] {
                new Child01(),
                new Child02()
        };
        for (BaseProcess1 process : processes) {
            if(process instanceof Child02) { // Type checking
                process.process1();
            }
        }
    }
}

class BaseProcess1 {
    void process1() {}
}

class Child01 extends BaseProcess1 {
    void process1() {
        throw new RuntimeException("Not implemented");
    }
}

class Child02 extends BaseProcess1 {
    void process1() {
        System.out.println("Called from Child02");
    }
}

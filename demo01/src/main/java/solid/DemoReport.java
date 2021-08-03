package solid;

public class DemoReport {
    public static void main(String[] args) {
        ReportType1 report1 = new Report1();
        ReportType1 report2 = new Report2();
        report1.build();
        report2.build();
    }
}

// Template method pattern
abstract class ReportType1 {
    abstract void createHeader();
    abstract void createBody();
    abstract void createFooter();
    public void build() {
        createHeader();
        createBody();
        createFooter();
    }
}

abstract class ReportWithoutHeader {
    abstract void createBody();
    abstract void createFooter();
    public void build() {
        createBody();
        createFooter();
    }
}

class Report1 extends ReportType1 {
    public void createFooter() {
        System.out.println("Report 1 createFooter");
    }
    public void createBody() {
        System.out.println("Report 1 createBody");
    }
    public void createHeader() {
        System.out.println("Report 1 createHeader");
    }
}

class Report2 extends ReportType1 {
    public void createFooter() {
        System.out.println("Report 2 createFooter");
    }
    public void createBody() {
        System.out.println("Report 2 createBody");
    }
    public void createHeader() {
        System.out.println("Report 2 createHeader");
    }
}

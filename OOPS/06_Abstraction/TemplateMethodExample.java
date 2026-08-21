abstract class ReportTemplate {
    final void generate() {
        readData();
        formatData();
        System.out.println("Report generated");
    }

    abstract void readData();
    abstract void formatData();
}

class SalesReport extends ReportTemplate {
    @Override
    void readData() {
        System.out.println("Reading sales data");
    }

    @Override
    void formatData() {
        System.out.println("Formatting sales data");
    }
}

public class TemplateMethodExample {
    public static void main(String[] args) {
        new SalesReport().generate();
    }
}
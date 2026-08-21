interface PrintableDocument {
    void print();
}

class InvoiceDocument implements PrintableDocument {
    @Override
    public void print() {
        System.out.println("Printing invoice");
    }
}

public class PrintableExample {
    public static void main(String[] args) {
        PrintableDocument document = new InvoiceDocument();
        document.print();
    }
}
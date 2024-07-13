package csMiddle.object.invoice;

class Product {
    public final String title;
    public final double price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }
}

class InvoiceItem {
    public final Product product;
    private final int quantity;
    public InvoiceItem next;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return quantity * product.price;
    }
}

class Invoice {
    private final String invoiceNumber;
    private final InvoiceItem invoiceItemHead;

    public Invoice(String invoiceNumber, InvoiceItem invoiceItemHead) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceItemHead = invoiceItemHead;
    }

    public double amountDue(boolean taxes) {
        InvoiceItem item = invoiceItemHead;
        double sum = 0;
        while(item != null) {
            sum += taxes ? item.getTotalPrice() * 1.1 : item.getTotalPrice();
            item = item.next;
        }
        return sum;
    }
}

class MyClass{
    public static void main(String[] args){
        Product product1 = new Product ("shampoo", 10);
        Product product2 = new Product ("conditioner", 5);
        Product product3 = new Product ("tooth brush", 3);

        InvoiceItem firstItem = new InvoiceItem(product1, 7);
        InvoiceItem secondItem = new InvoiceItem(product2, 9);
        InvoiceItem thirdItem = new InvoiceItem(product3, 10);

        firstItem.next = secondItem;
        secondItem.next = thirdItem;

        Invoice invoice = new Invoice ("UC1234567890", firstItem);

        System.out.println(formatDouble(invoice.amountDue(false)));
        System.out.println(formatDouble(invoice.amountDue(true)));
    }

    private static String formatDouble(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%s", value);
        }
    }
}
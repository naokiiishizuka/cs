package csMiddle.object.product;

class Product {
    public final String title;
    public final int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
class MyClass{
    public static void main(String[] args){
        Product product1 = new Product ("shampoo", 10);
        System.out.println(product1.title);
        System.out.println(product1.price);

        Product product2 = new Product ("conditioner", 5);
        System.out.println(product2.title);
        System.out.println(product2.price);
    }
}

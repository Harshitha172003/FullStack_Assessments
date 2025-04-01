package Day2_Day3;

abstract class Product {
    protected double price;
    public Product(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();
}

class Electronics extends Product {
    public Electronics(double price) {
        super(price);
    }
    public double calculateDiscount() {
        return price * 0.10;
    }
}

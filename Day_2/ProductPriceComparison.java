package Day2_Day3;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

        Product product = (Product) obj;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Laptop", 50000);
        System.out.println(p1.equals(p2)); // true
    }
}

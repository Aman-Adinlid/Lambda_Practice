package se.lexicon.Moudle;

public class Product {

    private String prodName;
    private double price;
    private int stock;


    public Product() {
    }

    public Product(String prodName, double price, int stock) {
        this.prodName = prodName;
        this.price = price;
        this.stock = stock;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

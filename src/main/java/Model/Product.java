package Model;

public class Product {
    private int idProduct ;
    private String nameProduct ;
    private double price ;
    private int count ;
    private String color ;
    private String descrision ;
    private int idCategory ;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price, int count, String color, String descrision, int idCategory) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.count = count;
        this.color = color;
        this.descrision = descrision;
        this.idCategory = idCategory;
    }

    public Product(String nameProduct, double price, int count, String color, String descrision, int idCategory) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.count = count;
        this.color = color;
        this.descrision = descrision;
        this.idCategory = idCategory;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescrision() {
        return descrision;
    }

    public void setDescrision(String descrision) {
        this.descrision = descrision;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}

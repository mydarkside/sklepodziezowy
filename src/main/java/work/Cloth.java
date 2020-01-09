package work;

public class Cloth extends Product {
    private String size;
    private String material;
    public final static String PRODUCT_SEPARATOR = "#";

    public Cloth(int id, String productName, double price, double weight, String color, int productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return super.toString() + PRODUCT_SEPARATOR +
                PRODUCT_SEPARATOR + size + '\'' +
                PRODUCT_SEPARATOR + material + '\'' +
                '}';
    }
}

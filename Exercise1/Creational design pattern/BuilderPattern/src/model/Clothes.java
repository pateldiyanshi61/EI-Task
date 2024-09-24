package model;

public class Clothes {
    private String material;
    private String size;
    private Double price;
    private String type;
    private String color;
    private String brand;

    public Clothes(String material, String size, Double price, String type, String color, String brand) {
        this.material = material;
        this.size = size;
        this.price = price;
        this.type = type;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Clothes[material: " + material + ", size: " + size + ", price: " + price +
                ", type: " + type + ", color: " + color + ", brand: " + brand + "]";
    }
}

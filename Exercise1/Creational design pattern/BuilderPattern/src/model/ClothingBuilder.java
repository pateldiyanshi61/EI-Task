package model;

public class ClothingBuilder {
    private String material;
    private String size;
    private Double price;
    private String type;
    private String color;
    private String brand;

    public ClothingBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public ClothingBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public ClothingBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public ClothingBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ClothingBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ClothingBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Clothes build() {
        return new Clothes(material, size, price, type, color, brand);
    }
}

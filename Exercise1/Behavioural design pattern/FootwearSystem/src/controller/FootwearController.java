package controller;

import model.Footwear;
import view.FootwearView;

public class FootwearController {
    private Footwear model;
    private FootwearView view;

    public FootwearController(Footwear model, FootwearView view) {
        this.model = model;
        this.view = view;
    }

    public void setFootwearBrand(String brand) {
        model.setBrand(brand);
    }

    public String getFootwearBrand() {
        return model.getBrand();
    }

    public void setFootwearType(String type) {
        model.setType(type);
    }

    public String getFootwearType() {
        return model.getType();
    }

    public void updateView() {
        view.printFootwearDetails(model.getBrand(), model.getType());
    }
}

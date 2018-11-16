package dao;

import java.io.Serializable;
import java.util.Collection;

public class Vehicle implements Serializable {
    private String id;
    private String webId;
    private String category;
    private String year;
    private String make;
    private String model;
    private String trim;
    private String type;
    private String price;
    private String images;

    public Vehicle(String id, String webId, String category, String year, String make, String model, String trim, String type, String price, String images) {
        this.id = id;
        this.webId = webId;
        this.category = category;
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.type = type;
        this.price = price;
        this.images = images;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImages(String images) {
        this.images = images;
    }

    //getter

    public String getId() {
        return id;
    }

    public String getWebId() {
        return webId;
    }

    public String isCategory() {
        return category;
    }

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTrim() {
        return trim;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getImages() {
        return images;
    }
}


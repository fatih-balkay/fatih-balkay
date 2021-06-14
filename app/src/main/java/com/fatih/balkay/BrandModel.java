package com.fatih.balkay;

import java.io.Serializable;

public class BrandModel implements Serializable {
    private String name;
    private int resImage;
    private String country;

    public BrandModel(String name, int resImage, String country) {
        this.name = name;
        this.resImage = resImage;
        this.country = country;
    }

    public BrandModel() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

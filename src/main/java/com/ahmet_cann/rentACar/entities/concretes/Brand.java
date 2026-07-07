package com.ahmet_cann.rentACar.entities.concretes;

public class Brand {
    private String brandName;
    private int id;

    public Brand() {
    }

    public Brand(String brandName, int id) {
        this.brandName = brandName;
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
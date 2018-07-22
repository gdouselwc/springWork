package com.beans.cycle;

public class Car {
    private String brand;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void init(){
        System.out.println("init...");
    }
    public void destory(){
        System.out.println("destory...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

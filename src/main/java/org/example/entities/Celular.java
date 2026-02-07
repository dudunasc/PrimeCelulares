package org.example.entities;

public class Celular {
    private int id;
    private String brand;
    private String model;
    private float price;
    private int stock;

    public Celular(int id, String brand, String model, float price, int stock) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
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
        return brand + (" ") + model;
    }

    public void status(){
        System.out.println("Sobre o celular: ");
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Está custando R$" + this.price);
        System.out.println("Ainda tem " + this.stock + " unidades no estoque.");

    }
}

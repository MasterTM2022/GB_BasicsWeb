package ru.gb.perov.GBBasicsWeb;

import java.time.Instant;
import java.util.Arrays;

import static java.lang.Math.random;

public class Product {
    static int count = 0;
    int id;
    private String title;
    private double cost;

    public Product(String title, double cost) {
        this.id = ++count;
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static Product[] createProductList(int size) {
        Product[] product = new Product[size];
        for (int i = 0; i < size; i++) {
            product[i] = new Product("product-" + (int)(random()*10) + "." + (int)(random()*100) , (double)((int)(random()*10000))/100);
        }
        return product;
    }
}

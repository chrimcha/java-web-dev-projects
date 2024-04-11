package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    //constructor

    //use if item is new
    public MenuItem(String aName, double aPrice, String aDescription, String aCategory) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
    }

    //use if item is not new
    public MenuItem(String aName, double aPrice, String aDescription, String aCategory, boolean aIsNew) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = aIsNew;
    }

    //methods


    //getters and setters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //overrides
    @Override
    public String toString() {
        return "\n##########################################" +
                "\nMenuItem: " + name +
                "\nPrice: " + price +
                "\nDescription: " + description +
                "\nCategory: " + category +
                "\nIs It New?: " + isNew
                + "\n##########################################";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}


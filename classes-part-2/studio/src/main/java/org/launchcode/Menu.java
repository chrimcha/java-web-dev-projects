package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    //contractor
    public Menu(LocalDate aDate, ArrayList<MenuItem> aItem) {
        this.lastUpdated = aDate;
        this.items = aItem;
    }

    public Menu(ArrayList<MenuItem> aItem) {
        this.items = aItem;
    }

    //methods

    //addMeunItem method
    public void addMenuItem(MenuItem menuItem) {
        items.add(menuItem);
        lastUpdated = LocalDate.now();
    }
    //removeMenuItem method
    public void removeMunuItem(MenuItem menuItem) {
        items.remove(menuItem);
        lastUpdated = LocalDate.now();
    }

    //getters and setters
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    //overrides
    @Override
    public String toString() {
        return "Menu was Last Updated on " + lastUpdated +
                "\nWith these items: " + items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(items, menu.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}



package com.sya.simple;

public class Booking {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPreorder() {
        return preorder;
    }

    public void setPreorder(String preorder) {
        this.preorder = preorder;
    }

    String date;
    String preorder;

    public Booking(String id, String name, String date, String preorder) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.preorder = preorder;
    }

    public String toString() {
        return "id: " + id + " name: " + name + " date: " + date + " preorder: " + preorder;
    }
}

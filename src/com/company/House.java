package com.company;

/**
 * Created by MashaJM on 28.01.2016.
 */
public class House  {

    private int area;
    private String address;


    public House(int area, String address) {
        this.area = area;
        this.address = address;

    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }




}

package com.epam;

/**
 * Created by m18 on 26.02.2016.
 */
public class Device {

    private String manufacture;
    private float price;
    private String serialNumber;

    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacture='" + manufacture + ","+
                "price=" + price +","+
                "serialNumber='" + serialNumber;

    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

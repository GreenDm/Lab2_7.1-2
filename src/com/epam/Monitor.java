package com.epam;

/**
 * Created by m18 on 26.02.2016.
 */
public class Monitor extends Device {

    private int resolutionX;
    private int resolution;

    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolution) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "manufactorer="+getManufacture() + ","+
                "price="+getPrice()+","+
                "serialNumber="+getSerialNumber()+","+
                "X=" + resolutionX +","+
                "Y=" + resolution;

    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolution() {
        return resolution;
    }
}

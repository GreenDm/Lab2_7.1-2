package com.epam;

/**
 * Created by m18 on 26.02.2016.
 */
public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter (int speed , String mac){
        super("IBM",0,"ABC");
        this.speed=speed;
        this.mac=mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter:" +
                "manufactorer="+getManufacture() + ","+
                "price="+getPrice()+","+
                "serialNumber="+getSerialNumber()+","+
                "speed=" + speed + ","+
                "mac=" + mac;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}

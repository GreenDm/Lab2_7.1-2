package com.epam;

/**
 * Created by m18 on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        Device d1 =new Device("Samsung",120,"AB1234567CD");
        Monitor m1 = new Monitor("Samsung",120,"AB1234567CD",1280,1024);
        EthernetAdapter e1 = new EthernetAdapter(120,"Mac");

        System.out.println(d1);
        System.out.println(m1);
        System.out.println(e1);
    }
}

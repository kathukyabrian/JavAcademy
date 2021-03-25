package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Networks {
    static InetAddress ip;

    static String hostname;

    public static void main(String[] args) {
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

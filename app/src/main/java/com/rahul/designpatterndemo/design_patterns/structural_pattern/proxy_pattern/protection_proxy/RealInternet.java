package com.rahul.designpatterndemo.design_patterns.structural_pattern.proxy_pattern.protection_proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to "+ serverHost);
    }
}

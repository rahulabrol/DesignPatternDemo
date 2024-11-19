package com.rahul.designpatterndemo.design_patterns.structural_pattern.proxy_pattern.protection_proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ghi.com");
        bannedSites.add("jkl.com");
        bannedSites.add("mno.com");
    }

    private final Internet internet = new RealInternet();

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        //connect to remote server.
        internet.connectTo(serverHost);
    }
}

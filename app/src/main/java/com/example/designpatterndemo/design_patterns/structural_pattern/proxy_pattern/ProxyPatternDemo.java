package com.example.designpatterndemo.design_patterns.structural_pattern.proxy_pattern;

import com.example.designpatterndemo.design_patterns.structural_pattern.proxy_pattern.protection_proxy.Internet;
import com.example.designpatterndemo.design_patterns.structural_pattern.proxy_pattern.protection_proxy.ProxyInternet;

/**
 * Intent
 * <p>
 * Provide a surrogate(duplicate) or placeholder for another object to control access to it.
 * <p>
 * Types of Proxy
 * <p>
 * 1.Remote Proxy
 * <p>
 * They are responsible for representing the object located remotely. Talking to the real object
 * might involve marshalling and unmarshalling of data and talking to the remote object. All that
 * logic is encapsulated in these proxies and the client application need not worry about them.
 * <p>
 * 2.Virtual Proxy
 * <p>
 * These proxies will provide some default and instant results if the real object is supposed
 * to take some time to produce results. These proxies initiate the operation on real objects and
 * provide a default result to the application. Once the real object is done, these proxies push
 * the actual data to the client where it has provided dummy data earlier.
 * <p>
 * 3.Protection Proxy
 * <p>
 * If an application does not have access to some resource then such proxies will talk to the
 * objects in applications that have access to that resource and then get the result back.
 * <p>
 * 4.Smart proxy
 * <p>
 * A smart proxy provides additional layer of security by interposing specific actions when
 * the object is accessed. An example can be to check if the real object is locked before it is
 * accessed to ensure that no other object can change it.
 * <p>
 * Explanation(Real World Example based on Protection Proxy)
 * <p>
 * A very simple real life scenario is our college internet.Which restrict few site access.The proxy
 * first checks the host you are connecting to,If it is not part of restricted site list,then it connect
 * to the real internet.
 * <p>
 * In plain words
 * <p>
 * Using proxy pattern,a class represent the functionality of another class.
 * <p>
 * Wikipedia says
 * <p>
 * A proxy in its most general form,is a class functioning as an interface to something else.A proxy
 * is a wrapper or agent object that is being called by the client to access the real serving object
 * behind the scenes.Use of the proxy can simple be forwarding to the real object or can provide
 * additional logic.In the proxy extra functionality can be provided, for example caching when operation
 * on the real object are resource intensive,or checking preconditions before operations on the real
 * object are invoked.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("abc.com");
            internet.connectTo("google.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

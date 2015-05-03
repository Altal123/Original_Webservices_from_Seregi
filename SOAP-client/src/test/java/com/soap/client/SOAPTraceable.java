package com.soap.client;

import com.soap.utils.SOAPClient;
import com.soap.ws.helloworld.HelloWorld;

public class SOAPTraceable {
    public static void main(String[] args) {

        HelloWorld soapClient = new SOAPClient().client;

        System.out.println(soapClient.getHelloWorldAsString("Hello"));

        System.out.println(soapClient.getProduct());
    }
}

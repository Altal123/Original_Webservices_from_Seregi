package com.soap.ws;

import com.soap.jaxb.Product;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return name;
    }
}

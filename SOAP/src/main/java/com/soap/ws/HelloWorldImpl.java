package com.soap.ws;

import javax.jws.WebService;

//Create a Web Service Endpoint Implementation
@WebService(endpointInterface = "com.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name)
    {
        return "Hello World JAX-WS " + name;
    }
}

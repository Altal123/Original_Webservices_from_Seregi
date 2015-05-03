package com.soap.client;

import com.soap.ws.helloworld.HelloWorld;
import com.soap.ws.helloworld.HelloWorldImplService;

public class HelloWorldClient {

    public static void main(String[] args) {
        HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldImplService.getHelloWorldImplPort();

        System.out.println(helloWorld.getHelloWorldAsString("Sergii"));
    }
}

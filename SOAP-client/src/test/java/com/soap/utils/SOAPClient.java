package com.soap.utils;

import com.soap.ws.helloworld.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class SOAPClient {

    public static HelloWorld client;

    public SOAPClient() {
        try {

            URL url = new URL("http://localhost:9999/ws/hello?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://ws.soap.com/", "HelloWorldImplService");

            Service service = Service.create(url, qname);

            service.setHandlerResolver(new JaxWsHandlerResolver());

            client = service.getPort(HelloWorld.class);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

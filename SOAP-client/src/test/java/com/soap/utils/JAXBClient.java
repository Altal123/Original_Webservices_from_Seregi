package com.soap.utils;

import com.soap.ws.jaxb.ProductInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class JAXBClient {

    public static ProductInterface client;

    public JAXBClient() {
        try {

            URL url = new URL("http://localhost:9999/ws/product?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://jaxb.soap.com/", "ProductService");

            Service service = Service.create(url, qname);

            service.setHandlerResolver(new JaxWsHandlerResolver());

            client = service.getPort(ProductInterface.class);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

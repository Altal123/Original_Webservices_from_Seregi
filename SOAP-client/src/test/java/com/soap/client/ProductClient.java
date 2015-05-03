package com.soap.client;

import com.soap.ws.jaxb.Product;
import com.soap.ws.jaxb.ProductInterface;
import com.soap.utils.JAXBClient;

public class ProductClient {

    public static void main(String[] args) {

        ProductInterface soapClient = new JAXBClient().client;

        Product product =  soapClient.getProduct();

        System.out.println(product.getProductName());

    }
}

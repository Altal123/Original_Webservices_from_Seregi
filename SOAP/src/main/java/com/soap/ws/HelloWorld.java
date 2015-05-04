package com.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Create service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);
}

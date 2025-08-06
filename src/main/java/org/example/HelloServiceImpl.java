package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}

package com.example.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.example.client.exampleService;

public class exampleServiceImpl extends RemoteServiceServlet implements exampleService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}
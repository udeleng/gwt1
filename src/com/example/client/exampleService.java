package com.example.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("exampleService")
public interface exampleService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use exampleService.App.getInstance() to access static instance of exampleServiceAsync
     */
    public static class App {
        private static exampleServiceAsync ourInstance = GWT.create(exampleService.class);

        public static synchronized exampleServiceAsync getInstance() {
            return ourInstance;
        }
    }
}

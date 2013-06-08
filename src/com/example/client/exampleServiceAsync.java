package com.example.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface exampleServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}

package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class example implements EntryPoint {

    interface mainUiBinder extends UiBinder<HTMLPanel, example> {

    }

    private static mainUiBinder ourUiBinder = GWT.create(mainUiBinder.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);

        RootPanel.get().add(rootElement);

    }
}

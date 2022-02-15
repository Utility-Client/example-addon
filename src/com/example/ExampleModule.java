package com.example;

import org.utilityclient.overlay.IModule;

public class ExampleModule extends IModule {
    @Override
    public String getName() {
        return "Example";
    }

    @Override
    public String getValue() {
        return "Value";
    }

    @Override
    public String getAuthor() {
        return "You";
    }
}

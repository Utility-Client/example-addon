package com.example;

import org.utilityclient.UtilityClient;
import org.utilityclient.addons.UC2Addon;
import org.utilityclient.overlay.ModuleHandler;

public class ExampleAddon implements UC2Addon {
    @Override
    public String getName() {
        // Enter the name of this add-on here.
        return "ExampleAddon";
    }

    @Override
    public String getAuthor() {
        // Enter your name here.
        return "You";
    }

    @Override
    public String getVersion() {
        // Version of this add-on.
        return "1.0.0";
    }

    @Override
    public void onStartEvent() {
        System.out.println("Hello World");

        // Register your themes, keybindings and modules here.

        // Register keybindings:
        UtilityClient.addKeyBind("Name", 0, false);

        // Register overlay modules:
        ModuleHandler.modules.add(new ExampleModule());

        // Register themes:
        UtilityClient.themes.add(new ExampleTheme());
    }

    @Override
    public void onUpdateEvent() {
        // Called every frame.
        // Check your keybindings here.
    }
}

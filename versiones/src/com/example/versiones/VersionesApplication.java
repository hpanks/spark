package com.example.versiones;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class VersionesApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Versiones Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}

package com.example.versiones;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class VersionesApplication extends Application {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		Window mainWindow = new Window("Spark");
		Label label = new Label("Usando git");
		Label labelDev = new Label("Estamos en desarrollo");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}

package com.nathan.yang.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.nathan.yang.fxml.AppConfig;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class MainButtonController implements Initializable {
	
	public FXMLLoader getLoader() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(AppConfig.MAIN_BUTTON_FXML_PATH));
		return loader;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

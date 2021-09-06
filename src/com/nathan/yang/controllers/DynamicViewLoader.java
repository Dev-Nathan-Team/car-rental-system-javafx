package com.nathan.yang.controllers;

import java.io.IOException;

import com.nathan.yang.fxml.AppConfig;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class DynamicViewLoader {

	public Node load(String fileName) {
		try {
			return FXMLLoader.load(getClass().getResource(AppConfig.FXML_PARENT_PATH + fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Pane();
		}
	}
}

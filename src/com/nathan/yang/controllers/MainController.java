package com.nathan.yang.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.nathan.yang.fxml.AppConfig;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController {
	
	Parent mainView;
	
	
	public MainController() throws IOException {
		this.mainView = FXMLLoader.load(getClass().getResource(AppConfig.MAIN_FXML_PATH));;
	}


	

	
}

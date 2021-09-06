package com.nathan.yang.controllers;

import java.io.IOException;

import com.nathan.yang.fxml.AppConfig;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewLoader {
	
	// define your offsets here
	private double xOffset = 0;
	private double yOffset = 0;

	
	public void run(Stage primaryStage) throws IOException {
	
		Parent root = FXMLLoader.load(getClass().getResource(AppConfig.MAIN_FXML_PATH));

    	primaryStage.initStyle(StageStyle.TRANSPARENT);

		// grab your root here
		root.setOnMousePressed(event -> {
			xOffset = event.getSceneX();
			yOffset = event.getSceneY();
		});

		// move around here
		root.setOnMouseDragged(event -> {
			primaryStage.setX(event.getScreenX() - xOffset);
			primaryStage.setY(event.getScreenY() - yOffset);
		});
		
		
		Scene scene = new Scene( root);
		// set transparent
		scene.setFill(Color.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

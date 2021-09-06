package com.nathan.yang;

import com.nathan.yang.controllers.ViewLoader;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    

	
    @Override
    public void start(Stage primaryStage) throws Exception{
		new ViewLoader().run(primaryStage);
		
    }


    public static void main(String[] args) {
        launch(args);
    }
}

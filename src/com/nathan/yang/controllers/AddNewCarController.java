package com.nathan.yang.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AddNewCarController implements Initializable{


	@FXML
	private Button addNewCarBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		addNewCarBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt->{
			MainViewController.addToCarRentalSystem();
		});
		
	}

}

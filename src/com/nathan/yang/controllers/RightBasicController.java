package com.nathan.yang.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RightBasicController implements Initializable{

	@FXML
	private Button settingsBtn;
	@FXML
	private Button closeBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {	
		closeBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->{
			Stage s  =(Stage)(this.closeBtn.getScene().getWindow());
			s.close();
		});
	}
}

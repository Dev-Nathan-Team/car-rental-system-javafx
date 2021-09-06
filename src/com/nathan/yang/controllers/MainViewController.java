package com.nathan.yang.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.nathan.yang.fxml.AppConfig;
import com.nathan.yang.models.CarRentalSystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	
	static CarRentalSystem instance;

	@FXML
	private VBox leftPanel;

	@FXML
	private VBox midPanel;

	@FXML
	private VBox rightPanel;

	public void setLeftPanel(Node panel) {
		this.leftPanel.getChildren().clear();
		this.leftPanel.getChildren().add(panel);
	}

	public void setMidPanel(Node panel) {
		this.midPanel.getChildren().clear();
		this.midPanel.getChildren().add(panel);
	}

	public void setRightPanel(Node panel) {
		this.rightPanel.getChildren().clear();
		this.rightPanel.getChildren().add(panel);
	}

	public VBox getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(VBox leftPanel) {
		this.leftPanel = leftPanel;
	}

	public VBox getMidPanel() {
		return midPanel;
	}

	public VBox getRightPanel() {
		return rightPanel;
	}

	public static String[] MAIN_MENU_MID_FXML = { 
			"overview_mid.fxml", 
			"add_new_car.fxml" ,
			"cars_list_view.fxml",
			"cars_table_view.fxml"};

	public static String[] MAIN_MENU = { 
			"Overview", 
			"Add New Car" ,
			"View All Cars",
			"Cars Table"};

	private void loadButtons(String path, String btnText) {
		Button btn = (Button) new DynamicViewLoader().load("menu_button.fxml");
		btn.setText(btnText);
		btn.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			VBox midPanelView = (VBox) new DynamicViewLoader().load(path);
			this.midPanel.getChildren().clear();
			this.midPanel.getChildren().add(midPanelView);
			System.out.println("Clicked");
		});
		this.leftPanel.getChildren().add(btn);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = CarRentalSystem.getInstance();
		System.out.println("Main Controller");
		setLeftMenuBtns();
		setRightPanel();

	}

	private void setRightPanel() {
		try {
			VBox rightPanel = FXMLLoader.load(getClass().getResource(AppConfig.MAIN_CONTROL_FXML_PATH));
			this.rightPanel.getChildren().clear();
			this.rightPanel.getChildren().add(rightPanel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void setLeftMenuBtns() {
		for (int i = 0; i < MAIN_MENU_MID_FXML.length; i++) {
			loadButtons(MAIN_MENU_MID_FXML[i], MAIN_MENU[i]);
		}
	}
	
	public static void addToCarRentalSystem() {
		instance.add();
	}

}
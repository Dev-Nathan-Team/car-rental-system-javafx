package com.nathan.yang.controllers;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class CarListViewController implements Initializable {

	ObservableList<HBox> items = FXCollections.observableArrayList();

	@FXML
	private ListView<HBox> carListView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		carListView.setItems(items);
		System.out.println();
		for (String s : ModelController.getCarList()) {
			HBox hb = new HBox();
			Text text = new Text(s);

			Button btn = new Button("Remove");

			btn.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
				action(ModelController.getCarList().indexOf(s));
			});
			hb.getChildren().addAll(text, btn);
			items.add(hb);
		}
	}
	
	private void action(int index) {
		ModelController.removeCar(index);
		items.remove(index);
		
	}

}

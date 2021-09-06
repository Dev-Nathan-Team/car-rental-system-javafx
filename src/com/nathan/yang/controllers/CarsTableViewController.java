package com.nathan.yang.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import com.nathan.yang.controllers.helpers.*;

public class CarsTableViewController implements Initializable {

	private ObservableList<TableCells> items = FXCollections.observableArrayList();

	
	@FXML
	Text tableNameText;
	
	@FXML
	TableView<TableCells> carsTableView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		carsTableView = new TableView<>(items);
//		carsTableView = new TableView<>(items);
		carsTableView.setItems(items);
		
		TableColumn<TableCells, String> columnIndex = new TableColumn<>("#");
		columnIndex.setCellValueFactory(new PropertyValueFactory<>("number"));
		TableColumn<TableCells, String> columnContent = new TableColumn<>("Content");
		columnContent.setCellValueFactory(new PropertyValueFactory<>("content"));

		carsTableView.getColumns().add(columnIndex);
		carsTableView.getColumns().add(columnContent);

		for (int i = 0; i < ModelController.getCarList().size(); i++) {
			items.add(new TableCells(i, ModelController.getCarList().get(i)));
			System.out.println("Table row loaded.");
		}
		System.out.println("Cars Table Loaded.");

	}



}

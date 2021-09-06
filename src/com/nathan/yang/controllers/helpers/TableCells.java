package com.nathan.yang.controllers.helpers;

public class TableCells {
	private int index;
	private String content;
	private int number;

	public TableCells(int index, String content) {
		this.index = index;
		this.number = index + 1;
		this.content = content;
	}

	public int getIndex() {
		return index;
	}

	public int getNumber() {
		return number;
	}

	
	public String getContent() {
		return content;
	}

}
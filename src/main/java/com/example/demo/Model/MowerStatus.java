package com.example.demo.Model;

public class MowerStatus {

	private String id;
	private Position position;
	private String orientation;
	
	
	
	
	public MowerStatus(String id, Position position, String orientation) {
		super();
		this.id = id;
		this.position = position;
		this.orientation = orientation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	

	
	
}

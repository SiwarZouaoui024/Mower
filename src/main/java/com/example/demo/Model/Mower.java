package com.example.demo.Model;

import java.util.List;

public class Mower {

	private String id;
    private Position start_position;
    private String orientation;
    private List<String> instructions;
    
	public Mower(String id, Position start_position, String orientation, List<String> instructions) {
		super();
		this.id = id;
		this.start_position = start_position;
		this.orientation = orientation;
		this.instructions = instructions;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Position getPosition() {
		return start_position;
	}
	public void setPosition(Position start_position) {
		this.start_position = start_position;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public List<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}
    
    
    
}

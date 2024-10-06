package com.example.demo.Request;

import com.example.demo.Model.Field;
import com.example.demo.Model.Mower;
import java.util.List;


public class MowerRequest {
    private Field field;
    private List<Mower> mowers;
    
    
    
    
	public MowerRequest(Field field, List<Mower> mowers) {
		super();
		this.field = field;
		this.mowers = mowers;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public List<Mower> getMowers() {
		return mowers;
	}
	public void setMowers(List<Mower> mowers) {
		this.mowers = mowers;
	}

    
}

package com.example.demo.Service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Field;
import com.example.demo.Model.Mower;
import com.example.demo.Model.Position;
import com.example.demo.Model.MowerStatus; 
import com.example.demo.Request.MowerRequest; 

@Service
public class MowerService {

	
	public List<MowerStatus> moveMowers(MowerRequest request) {
        List<MowerStatus> mowerStatuses = new ArrayList<>();
        for (Mower mower : request.getMowers()) {
            Position position = mower.getPosition();

            String orientation = mower.getOrientation();

            for (String instruction : mower.getInstructions()) {
                switch (instruction) {
                    case "D":
                        orientation = turnRight(orientation);
                        break;
                    case "G":
                        orientation = turnLeft(orientation);
                        break;
                    case "A":
                        position = moveForward(position, orientation, request.getField());
                        break;
                }
            }

            mowerStatuses.add(new MowerStatus(mower.getId(), position, orientation));
        }

        return mowerStatuses;
    }

	private String turnRight(String orientation) {
	    switch (orientation) {
	        case "N":
	            return "E";
	        case "E":
	            return "S";
	        case "S":
	            return "W";
	        case "W":
	            return "N";
	        default:
	            throw new IllegalArgumentException("Orientation invalide: " + orientation);
	    }
	}

	private String turnLeft(String orientation) {
	    switch (orientation) {
	        case "N":
	            return "W";
	        case "W":
	            return "S";
	        case "S":
	            return "E";
	        case "E":
	            return "N";
	        default:
	            throw new IllegalArgumentException("Orientation invalide: " + orientation);
	    }
	}

	private Position moveForward(Position position, String orientation, Field field) {
		
		
	    int x = position.getX();
	    int y = position.getY();
	    switch (orientation) {
	        case "N": 
	            if (y < field.getMaxY()) {
	                y++;
	            }
	            break;
	        case "E": 
	            if (x < field.getMaxX()) {
	                x++;
	            }
	            break;
	        case "S": 
	            if (y > 0) {
	                y--;
	            }
	            break;
	        case "W": 
	            if (x > 0) {
	                x--;
	            }
	            break;
	        default:
	            throw new IllegalArgumentException("Orientation invalide: " + orientation);
	    }

	    return new Position(x, y);
	}
}

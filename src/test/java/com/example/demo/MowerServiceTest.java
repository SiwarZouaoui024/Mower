package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Field;
import com.example.demo.Model.Mower;
import com.example.demo.Model.MowerStatus;
import com.example.demo.Model.Position;
import com.example.demo.Request.MowerRequest;
import com.example.demo.Service.MowerService;

@SpringBootTest
public class MowerServiceTest {
    @Autowired
    private MowerService mowerService;

    @Test
    public void testMoveMowers() {
     
        Field field = new Field(5, 5); 

        
        Mower mower1 = new Mower("mower1", new Position(1, 2), "N", Arrays.asList("G", "A", "G", "A", "G", "A", "G", "A", "A"));
        Mower mower2 = new Mower("mower2", new Position(3, 3), "E", Arrays.asList("A", "A", "D", "A", "A", "D", "A", "D", "D", "A"));

        
        List<Mower> mowers = Arrays.asList(mower1, mower2);
        MowerRequest mowersRequest = new MowerRequest(field, mowers);

     
        List<MowerStatus> result = mowerService.moveMowers(mowersRequest);


        assertEquals(1, result.get(0).getPosition().getX());  
        assertEquals(3, result.get(0).getPosition().getY());  
        assertEquals("N", result.get(0).getOrientation());    

        assertEquals(5, result.get(1).getPosition().getX());  
        assertEquals(1, result.get(1).getPosition().getY());  
        assertEquals("E", result.get(1).getOrientation());    
    }
}
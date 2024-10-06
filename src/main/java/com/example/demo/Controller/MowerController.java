package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Request.MowerRequest;
import com.example.demo.Service.MowerService;
import com.example.demo.Model.MowerStatus;

@RestController
@RequestMapping("/api/mowers")
public class MowerController {
    @Autowired
    private MowerService mowerService;

    @PostMapping("/move")
    public ResponseEntity<List<MowerStatus>> moveMowers(@RequestBody MowerRequest request) {
    	
        List<MowerStatus> mowerStatuses = mowerService.moveMowers(request);
        return ResponseEntity.ok(mowerStatuses);
    }
}

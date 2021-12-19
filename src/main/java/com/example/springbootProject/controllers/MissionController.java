package com.example.springbootProject.controllers;


import com.example.springbootProject.exception.ResourceNotFoundException;
import com.example.springbootProject.models.Mission;
import com.example.springbootProject.models.User;
import com.example.springbootProject.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v11/")
public class MissionController {

    @Autowired
    private MissionRepository missionRepository;


    // Create ordre de mission REST API
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/mission")
    public Mission createEmployee(@RequestBody Mission mission){
        return missionRepository.save(mission);
    }


    // Liste des OM
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listeordre")
    public List<Mission> getAllEmployees(){
        return missionRepository.findAll();
    }

    // Get Employee By Id REST API
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listeordre/{id}")
    public ResponseEntity<Mission> getEmployeeById(@PathVariable Integer id){
        Mission employee = missionRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));
        return ResponseEntity.ok(employee);
    }


    // Delete Mission Rest API
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/listeordre/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
        Mission employee = missionRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));

        missionRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}

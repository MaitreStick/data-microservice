package com.usco.data_microservice.controller;

import com.usco.data_microservice.entity.DataEntity;
import com.usco.data_microservice.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createData(@RequestBody DataEntity dataEntity) {
        dataRepository.save(dataEntity);
    }
}

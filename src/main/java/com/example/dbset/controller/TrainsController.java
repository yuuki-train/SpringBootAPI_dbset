package com.example.dbset.controller;

import com.example.dbset.entity.Trains;
import com.example.dbset.exception.ResourceNotFoundException;
import com.example.dbset.repository.TrainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainsController {
    @Autowired
    private TrainsRepository trainsRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Trains add(@RequestBody Trains trains){
        return trainsRepository.save(trains);
    }

    @GetMapping
    public List<Trains> getAll(){
        return trainsRepository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Trains getOne(@PathVariable String id) {
        return trainsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @PutMapping(value = "/{id}")
    public Trains update(@PathVariable String id, @RequestBody Trains updatedTrains) {
        Trains trains = trainsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        trains.setId(updatedTrains.getId());
        trains.setDeparture(updatedTrains.getDeparture());
        trains.setDepHour(updatedTrains.getDepHour());
        trains.setDepMinute(updatedTrains.getDepMinute());
        trains.setDestination(updatedTrains.getDestination());
        trains.setArvHour(updatedTrains.getArvHour());
        trains.setArvMinute(updatedTrains.getArvMinute());
        trains.setTrainType(updatedTrains.getTrainType());
        trains.setFee(updatedTrains.getFee());
        return trainsRepository.save(trains);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void delete(@PathVariable String id) {
        Trains trains = trainsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        trainsRepository.delete(trains);
    }
}

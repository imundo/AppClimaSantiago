package com.hendisantika.springbootrestapipostgresql.controller;

import com.hendisantika.springbootrestapipostgresql.entity.Comuna;
import com.hendisantika.springbootrestapipostgresql.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/climaComuna")
public class ComunaRestController {

    @Autowired
    private ComunaRepository repository;

    @PostMapping
    public ResponseEntity<?> addComuna(@RequestBody Comuna comuna) {
        return new ResponseEntity<>(repository.save(comuna), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Collection<Comuna>> getAllComunas() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comuna> getComunasWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

    @GetMapping(params = {"comuna"})
    public ResponseEntity<Collection<Comuna>> findComunaWithName(@RequestParam(value = "comuna") String comuna) {
        return new ResponseEntity<>(repository.findByName(comuna), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comuna> updateComunaFromDB(@PathVariable("id") long id, @RequestBody Comuna comuna) {

        Comuna currentComuna = repository.findOne(id);
        currentComuna.setLocation(comuna.getLocation());

        currentComuna.setStatus(comuna.getStatus());
        currentComuna.setTempmax(comuna.getTempmax());
        currentComuna.setTempmin(comuna.getTempmin());
        currentComuna.setUnit(comuna.getUnit());
        currentComuna.setUrl(comuna.getUrl());
        return new ResponseEntity<>(repository.save(currentComuna), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteComunaWithId(@PathVariable Long id) {
        repository.delete(id);
    }

    @DeleteMapping
    public void deleteAllComuna() {
        repository.deleteAll();
    }
}

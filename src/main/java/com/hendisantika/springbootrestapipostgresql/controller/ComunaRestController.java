package com.hendisantika.springbootrestapipostgresql.controller;

import com.hendisantika.springbootrestapipostgresql.entity.Comuna;
import com.hendisantika.springbootrestapipostgresql.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/comunaClima")
public class ComunaRestController {

    @Autowired
    private ComunaRepository repository;

    @PostMapping
    public ResponseEntity<?> addComunaClima(@RequestBody Comuna comuna) {
        return new ResponseEntity<>(repository.save(comuna), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Collection<Comuna>> getAllComunaClima() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comuna> getComunaClimaWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

    @GetMapping(params = {"name"})
    public ResponseEntity<Collection<Comuna>> findComunaClimaWithName(@RequestParam(value = "name") String name) {
        return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public void deleteComunaClimaWithId(@PathVariable Long id) {
        repository.delete(id);
    }

    @DeleteMapping
    public void deleteAllComunaClima() {
        repository.deleteAll();
    }
}
package com.practice.controller;

import com.practice.entity.LeadEntity;
import com.practice.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LeadRestController {
    @Autowired
    private LeadRepository leadRepo;

    @PostMapping("/post")
    public LeadEntity post(@RequestBody LeadEntity lead){
        LeadEntity save = leadRepo.save(lead);
        return save;
    }


    @GetMapping("/getAll")
    public List<LeadEntity> getAll(){
        List<LeadEntity> all = leadRepo.findAll();
        return all;
    }

    @GetMapping("/getById/{id}")
    public LeadEntity getById(@PathVariable("id") long id){
        Optional<LeadEntity> all = leadRepo.findById(id);
        return all.get();
    }

    @GetMapping("/get/{name}/{city}")
    public List<LeadEntity> getByName(@PathVariable("name") String name, @PathVariable("city") String city){
        List<LeadEntity> byName = leadRepo.findByName(name, city);
        return byName;
    }

    @PutMapping("/put")
    public LeadEntity update(@RequestBody LeadEntity lead){
        LeadEntity save = leadRepo.save(lead);
        return save;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        leadRepo.deleteById(id);
        return "${id} is deleted sucessfully";
    }
}

package com.enock.springbootdemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService{
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> findAll(){return softwareEngineerRepository.findAll();}

    public void createSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    }
}

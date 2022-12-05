package com.javatech.controller.doctor;

import com.javatech.model.doctor.Doctor;
import com.javatech.model.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return Service.getDoctorService();
    }
}
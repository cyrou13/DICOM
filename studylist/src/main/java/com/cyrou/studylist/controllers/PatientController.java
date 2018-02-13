package com.cyrou.studylist.controllers;

import com.cyrou.studylist.repositories.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientController {

    private PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @RequestMapping("/patients")
    public String getPatients(Model model){

        model.addAttribute("patients", patientRepository.findAll());

        return "patients"; // view's name must be patients.html
    }
}

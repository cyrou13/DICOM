package com.cyrou.studylist.controllers;

import com.cyrou.studylist.repositories.StudyRepository;
import com.cyrou.studylist.services.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyController {

    private StudyService studyService;

    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }


    @RequestMapping("/study/details/{id}")
    public String detailsById(@PathVariable String id, Model model){

        model.addAttribute("studies", studyService.findById(new Long(id)));

        return "study/details";
    }
}

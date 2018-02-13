package com.cyrou.studylist.controllers;

import com.cyrou.studylist.services.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private StudyService studyService;

    public IndexController(StudyService studyService) {
        this.studyService = studyService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){

        // Use of queries
        // System.out.println(studyRepository.findByDescription("Brain").get());

        model.addAttribute("studies",studyService.getStudies());

        return "index";
    }
}

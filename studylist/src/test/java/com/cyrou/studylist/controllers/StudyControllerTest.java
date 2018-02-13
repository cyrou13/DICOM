package com.cyrou.studylist.controllers;

import com.cyrou.studylist.model.Study;
import com.cyrou.studylist.services.StudyService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class StudyControllerTest {

    @Mock
    StudyService studyService;


    StudyController studyController;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        studyController = new StudyController(studyService);

    }

    @Test
    public void detailsById() throws Exception {
        Study study = new Study();
        Long id = 1L;
        study.setId(id);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(studyController).build();


        when(studyService.findById(anyLong())).thenReturn(Optional.of(study));

        mockMvc.perform(get("/study/details/"+id))
                .andExpect(status().isOk())
                .andExpect(view().name("study/details"));
    }
}
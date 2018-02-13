package com.cyrou.studylist.controllers;

import com.cyrou.studylist.model.Study;
import com.cyrou.studylist.services.StudyService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {

    @Mock
    StudyService studyService;

    @Mock
    Model model;

    IndexController indexController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(studyService);

    }

    @Test
    public void getIndexPage() throws Exception{

        Set<Study> studies = new HashSet<>();
        studies.add(new Study("uid1","description1"));
        studies.add(new Study("uid2","description2"));

        when(studyService.getStudies()).thenReturn(studies);

        ArgumentCaptor<Set<Study>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String viewPage = indexController.getIndexPage(model);

        assertEquals("index",viewPage);

        verify(studyService, times(1)).getStudies();
        verify(model, times(1)).addAttribute(eq("studies"),argumentCaptor.capture());

        Set<Study> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }


    @Test
    public void mockMVC() throws Exception {

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));

    }
}
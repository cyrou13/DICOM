package com.cyrou.studylist.services;

import com.cyrou.studylist.model.Study;
import com.cyrou.studylist.repositories.StudyRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StudyServiceImplTest {

    StudyServiceImpl studyService;

    @Mock
    StudyRepository studyRepository;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        studyService = new StudyServiceImpl(studyRepository);

    }

    @Test
    public void getStudies() {

        Study study = new Study();

        Set<Study> mockSet = new HashSet<>();
        mockSet.add(study);

        when(studyRepository.findAll()).thenReturn(mockSet);

        assertEquals(1,studyService.getStudies().size());

        verify(studyRepository, times(1)).findAll();

    }
}
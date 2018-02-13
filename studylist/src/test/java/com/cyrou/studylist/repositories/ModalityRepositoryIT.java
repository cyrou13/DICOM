package com.cyrou.studylist.repositories;

import com.cyrou.studylist.model.Modality;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ModalityRepositoryIT {

    @Autowired
    ModalityRepository modalityRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescriptionMR() {
        Optional<Modality> mrModality = modalityRepository.findByName("MR");

        assertEquals("MR", mrModality.get().getName());
        assertEquals("Magnetic Resonance", mrModality.get().getDescription());
    }

    @Test
    public void findByDescriptionCT() {
        Optional<Modality> mrModality = modalityRepository.findByName("CT");

        assertEquals("CT", mrModality.get().getName());
        assertEquals("Computed Tomography", mrModality.get().getDescription());
    }
}
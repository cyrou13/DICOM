package com.cyrou.studylist.model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StudyTest {

    @Test
    public void testEqualsAndHash() {
        Study study1 = new Study("uid", "description");
        study1.setId(1L);
        Study study2 = new Study("uid", "description");
        study2.setId(2L);

        Set<Study> studies = new HashSet<>();

        studies.add(study1);
        studies.add(study2);

        //hashcode
        assertEquals(2,studies.size());
        assertFalse(study1.equals(study2));
    }
}
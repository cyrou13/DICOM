package com.cyrou.studylist.mapper;

import com.cyrou.studylist.domain.StudyDTO;
import com.cyrou.studylist.model.Study;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudyMapperTest {

    StudyMapper studyMapper = StudyMapper.INSTANCE;

    @Test
    public void studyToStudyDTO() {

        // given
        Study study = new Study();
        study.setId(1L);
        study.setDescription("Description");
        study.setUid("123456");

        // when
        StudyDTO studyDTO = studyMapper.studyToStudyDTO(study);

        // then
        assertNotNull(studyDTO);
        assertEquals(Long.valueOf(1L), studyDTO.getId());
        assertEquals("Description", studyDTO.getDescription());
        assertEquals("123456", studyDTO.getUid());

    }
}
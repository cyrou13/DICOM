package com.cyrou.studylist.mapper;

import com.cyrou.studylist.domain.StudyDTO;
import com.cyrou.studylist.model.Study;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudyMapper {

    StudyMapper INSTANCE = Mappers.getMapper(StudyMapper.class);

    StudyDTO studyToStudyDTO(Study study);
}

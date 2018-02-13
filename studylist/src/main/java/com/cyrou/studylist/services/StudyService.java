package com.cyrou.studylist.services;


import com.cyrou.studylist.model.Study;

import java.util.Optional;
import java.util.Set;

public interface StudyService {

    Set<Study> getStudies();

    Optional<Study> findById(Long id);
}

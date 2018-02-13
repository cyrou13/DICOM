package com.cyrou.studylist.services;

import com.cyrou.studylist.model.Study;
import com.cyrou.studylist.repositories.StudyRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class StudyServiceImpl implements StudyService {

    private StudyRepository studyRepository;

    public StudyServiceImpl(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    @Override
    public Set<Study> getStudies() {
        Set<Study> studies = new HashSet<>();
        studyRepository.findAll().iterator().forEachRemaining(studies::add);

        return studies;
    }

    @Override
    public Optional<Study> findById(Long id) {
        return studyRepository.findById(id);
    }
}

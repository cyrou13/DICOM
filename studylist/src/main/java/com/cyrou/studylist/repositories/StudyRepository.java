package com.cyrou.studylist.repositories;

import com.cyrou.studylist.model.Study;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudyRepository extends CrudRepository<Study, Long>{

    // SQL query
    Optional<Study> findByDescription(String description);

}

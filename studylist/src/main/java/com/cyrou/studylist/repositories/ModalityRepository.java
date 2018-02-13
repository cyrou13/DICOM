package com.cyrou.studylist.repositories;

import com.cyrou.studylist.model.Modality;
import com.cyrou.studylist.model.Study;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ModalityRepository extends CrudRepository<Modality,Long>{

    // SQL query
    Optional<Modality> findByName(String name);

}

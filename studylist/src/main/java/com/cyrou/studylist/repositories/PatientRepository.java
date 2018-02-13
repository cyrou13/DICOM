package com.cyrou.studylist.repositories;

import com.cyrou.studylist.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long>{

}

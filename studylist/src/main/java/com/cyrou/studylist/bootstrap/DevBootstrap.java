package com.cyrou.studylist.bootstrap;

import com.cyrou.studylist.model.Patient;
import com.cyrou.studylist.model.Series;
import com.cyrou.studylist.model.Study;
import com.cyrou.studylist.repositories.PatientRepository;
import com.cyrou.studylist.repositories.SeriesRepository;
import com.cyrou.studylist.repositories.StudyRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PatientRepository patientRepository;

    private StudyRepository studyRepository;

    private SeriesRepository seriesRepository;

    public DevBootstrap(PatientRepository patientRepository, StudyRepository studyRepository, SeriesRepository seriesRepository) {
        this.patientRepository = patientRepository;
        this.studyRepository = studyRepository;
        this.seriesRepository = seriesRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Patient patient = new Patient("Cyril DI GRANDI");

        Study study = new Study("1.2.840.10008.7988978932", "Brain");

        Series series = new Series("1.32789312.8932189321", "dWI");

        study.getSeries().add(series);
        patient.getStudies().add(study);

        seriesRepository.save(series);
        studyRepository.save(study);
        patientRepository.save(patient);

    }
}

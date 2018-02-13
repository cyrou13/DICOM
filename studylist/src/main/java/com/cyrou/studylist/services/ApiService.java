package com.cyrou.studylist.services;

import com.cyrou.studylist.model.Study;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<Study> getStudies(Integer limit);

    Flux<Study> getStudies(Mono<Integer> limit);
}

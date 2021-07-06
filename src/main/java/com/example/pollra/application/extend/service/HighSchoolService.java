package com.example.pollra.application.extend.service;

import com.example.pollra.application.extend.entity.HighSchool;
import com.example.pollra.application.extend.repository.HighSchoolRepository;
import com.example.pollra.infra.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description high school service
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class HighSchoolService {

    private final HighSchoolRepository highSchoolRepository;

    public HighSchool add(HighSchool highSchool) {
        return highSchoolRepository.save(highSchool);
    }

    public HighSchool get(Long id) {
        return highSchoolRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}

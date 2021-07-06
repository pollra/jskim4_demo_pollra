package com.example.pollra.application.extend.repository;

import com.example.pollra.application.extend.entity.HighSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description high school repository
 **********************************************************************************************************************/
@Repository
public interface HighSchoolRepository extends JpaRepository<HighSchool, Long> {
}

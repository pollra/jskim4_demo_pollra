package com.example.pollra.application.team.repository;

import com.example.pollra.application.team.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description TeamRepository
 **********************************************************************************************************************/
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}

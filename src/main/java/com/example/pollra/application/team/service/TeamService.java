package com.example.pollra.application.team.service;

import com.example.pollra.application.team.entity.Team;
import com.example.pollra.application.team.repository.TeamRepository;
import com.example.pollra.infra.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

import static com.example.pollra.application.team.mapper.TeamMapper.mapper;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberService
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class TeamService {
	
	private final TeamRepository teamRepository;
	
	@Transactional(readOnly=true)
	public Team get(Long teamId) {
		return teamRepository.findById(teamId).orElseThrow(NotFoundException::new);
	}
	
	public Team create(Team team) {
		return teamRepository.save(team);
	}

	public Team modify(Long teamId, Team team) {
		return mapper.modify(team, get(teamId));
	}
}

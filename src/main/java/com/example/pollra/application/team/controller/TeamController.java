package com.example.pollra.application.team.controller;

import com.example.pollra.application.team.form.TeamForm.*;
import com.example.pollra.application.team.mapper.TeamContext;
import com.example.pollra.application.team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.pollra.application.team.mapper.TeamMapper.mapper;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberController
 **********************************************************************************************************************/
@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {
	
	private final TeamService teamService;

	@GetMapping("/{teamId}")
	public Response.FindOne get(@PathVariable Long teamId) {
		return mapper.toFindOne(teamService.get(teamId));
	}
	
	@PostMapping
	public Response.FindOne add(@Valid @RequestBody Request.Merge merge) {
		return mapper.toFindOne(teamService.create(mapper.toEntity(TeamContext.create(), merge, 0L)));
	}
 
	@PutMapping("/{teamId}")
	public Response.FindOne modify(@PathVariable Long teamId, @Valid @RequestBody Request.Merge merge) {
		return mapper.toFindOne(teamService.modify(teamId, mapper.toEntity(TeamContext.create(), merge, teamId)));
	}
}

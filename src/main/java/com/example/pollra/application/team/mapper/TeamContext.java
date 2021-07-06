package com.example.pollra.application.team.mapper;

import com.example.pollra.application.team.entity.Member;
import com.example.pollra.application.team.entity.Team;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;

import javax.persistence.EntityManager;

/**
 * @since       2021.04.19
 * @author      pollra
 * @description TeamContext
 **********************************************************************************************************************/
@Builder
public class TeamContext {

	private Member member;
	private Team   team;

	@BeforeMapping
	public void init(Team team) {
		this.team = team;
	}

	@BeforeMapping
	public void init(Member member) {
		this.member = member;
	}
	
	@AfterMapping
	public void set(@MappingTarget Member target) {
		target.setTeam(team);
	}
	
	public static TeamContext create(){
		return TeamContext.builder().build();
	}
}

package com.example.pollra.application.team.entity;

import com.example.pollra.application.team.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @since       2021.04.17
 * @author      pollra
 * @description Member
 **********************************************************************************************************************/
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private Integer age;
	
	@JoinColumn(name="TEAM_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	private Team team;
	
	private LocalDateTime createdDt;
	
	private String createdAt;
}

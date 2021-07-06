package com.example.pollra.application.team.entity;

import com.example.pollra.application.team.entity.Team;
import lombok.*;

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
	
	@Getter(AccessLevel.PRIVATE)
	private String name;
	
	private Integer age;
	
	@JoinColumn(name="TEAM_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	private Team team;
	
	private LocalDateTime createdDt;
	
	private String createdAt;
}

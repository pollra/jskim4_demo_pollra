package com.example.pollra.application.team.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @since       2021.04.17
 * @author      pollra
 * @description Team
 **********************************************************************************************************************/
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	@Id
	@GeneratedValue
	@Column(name="TEAM_ID")
	private Long id;
	
	private String name;
	
	@BatchSize(size=10)
	@OneToMany(mappedBy="team", cascade=CascadeType.ALL, fetch=FetchType.EAGER, orphanRemoval=true)
	private List<Member> members = new ArrayList<>();
	
}

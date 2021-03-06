package com.example.pollra.application.team.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author pollra
 * @description TeamForm
 * @since 2021.04.18
 **********************************************************************************************************************/
public class TeamForm {
	
	public static class Request {

		@Setter
		@Getter
		@AllArgsConstructor
		@NoArgsConstructor
		public static class Merge {

			@NotBlank
			private String name;
			
			@Valid
			@NotEmpty
			private List<Member> members;
			
			@Setter
			@Getter
			@AllArgsConstructor
			@NoArgsConstructor
			public static class Member {

				@NotNull
				private Long id;
				
				@NotBlank
				private String name;
				
				@NotNull
				private Integer age;
				
				@NotBlank
				private String createdAt;
				
				@NotNull
				private LocalDateTime createdDt;
				
				@JsonIgnore
				private Team team;
				
				@Setter
				@Getter
				@AllArgsConstructor
				@NoArgsConstructor
				public static class Team {

					@NotNull
					private Long id;
				}
			}
		}
	}
	
	public static class Response {
		
		@Data
		public static class FindOne {
			private Long id;
			private String name;
			private List<Member> members;
			
			@Data
			public static class Member {
				private Long id;
				private String name;
				private Integer age;
				private String createdAt;
				private LocalDateTime createdDt;
			}
		}
	}
}

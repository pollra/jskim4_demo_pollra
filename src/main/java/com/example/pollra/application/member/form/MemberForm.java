package com.example.pollra.application.member.form;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberForm
 **********************************************************************************************************************/
public class MemberForm {
	public static class Request {
		@Data
		public static class Add {
			private String name;
			private Integer age;
			@Valid
			private Team team;
			
			@Data
			public static class Team {
				@NotNull
				private Long id;
			}
		}
	}
	
	public static class Response {
		@Data
		public static class FindOne {
			private Long id;
			private String name;
			private Integer age;
			private LocalDateTime createdDt;
			private String createdAt;
		}
	}
}

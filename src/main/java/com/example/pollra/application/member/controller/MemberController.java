package com.example.pollra.application.member.controller;

import com.example.pollra.application.member.form.MemberForm.*;
import com.example.pollra.application.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.pollra.application.member.mapper.MemberMapper.mapper;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberController
 **********************************************************************************************************************/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

	private final MemberService memberService;
	
	@PostMapping
	public Response.FindOne add(@Valid @RequestBody Request.Add add) {
		return mapper.toFindOne(memberService.add(mapper.toEntity(add)));
	}
	
	@GetMapping("/{memberId}")
	public Response.FindOne get(@PathVariable Long memberId) {
		return mapper.toFindOne(memberService.get(memberId));
	}
	
}

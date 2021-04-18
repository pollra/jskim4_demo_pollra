package com.example.pollra.application.member.service;

import com.example.pollra.application.member.entity.Member;
import com.example.pollra.application.member.repository.MemberRepository;
import com.example.pollra.infra.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberService
 **********************************************************************************************************************/
@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	public Member add(Member member) {
		return memberRepository.save(member);
	}
	
	public Member get(Long memberId) {
		return memberRepository.findById(memberId).orElseThrow(NotFoundException::new);
	}
}

package com.example.pollra.application.member.repository;

import com.example.pollra.application.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberRepository
 **********************************************************************************************************************/
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

package com.example.pollra.application.member.mapper;

import com.example.pollra.application.member.entity.Member;
import com.example.pollra.application.member.form.MemberForm;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description MemberMapper
 **********************************************************************************************************************/
@Mapper(unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface MemberMapper {
	MemberMapper mapper =Mappers.getMapper(MemberMapper.class);
	
	Member toEntity(MemberForm.Request.Add form);
	
	MemberForm.Response.FindOne toFindOne(Member entity);
}

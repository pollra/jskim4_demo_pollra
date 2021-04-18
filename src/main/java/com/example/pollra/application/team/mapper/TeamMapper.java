package com.example.pollra.application.team.mapper;

import com.example.pollra.application.team.entity.Member;
import com.example.pollra.application.team.entity.Team;
import com.example.pollra.application.team.form.TeamForm;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description TeamMapper
 **********************************************************************************************************************/
@Mapper(unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface TeamMapper {
	TeamMapper mapper =Mappers.getMapper(TeamMapper.class);
	
	default Team modify(Team source, @MappingTarget Team target){
		if(null == target) return null;

		target.setName(source.getName());
		for (int i=0; i < source.getMembers().size(); i++) {
			modifyMember(source.getMembers().get(i), target.getMembers().get(i));
		}
		return target;
	}
	
	@Mapping(target="id", ignore=true)
	@Mapping(target="team", ignore=true)
	Member modifyMember(Member source, @MappingTarget Member target);
	
	Team toEntity(TeamForm.Request.Add form);
	Team toEntity(TeamForm.Request.Modify form);
	
	Member toEntityMember(TeamForm.Request.Add.Member form);
	Member toEntityMember(TeamForm.Request.Modify.Member form);
	
	TeamForm.Response.FindOne toFindOne(Team entity);
}

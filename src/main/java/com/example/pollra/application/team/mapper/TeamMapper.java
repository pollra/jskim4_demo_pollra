package com.example.pollra.application.team.mapper;

import com.example.pollra.application.team.entity.Team;
import com.example.pollra.application.team.form.TeamForm.Request;
import com.example.pollra.application.team.form.TeamForm.Response;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @since       2021.04.18
 * @author      pollra
 * @description TeamMapper
 **********************************************************************************************************************/
@Mapper(unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface TeamMapper {
	TeamMapper mapper = Mappers.getMapper(TeamMapper.class);

	Team toEntity(@Context TeamContext context, Request.Merge form, Long id);

	@Mapping(target="id", ignore=true)
	Team modify(Team source, @MappingTarget Team target);

	Response.FindOne toFindOne(Team entity);
}

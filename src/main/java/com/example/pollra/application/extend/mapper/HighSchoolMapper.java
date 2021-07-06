package com.example.pollra.application.extend.mapper;

import com.example.pollra.application.extend.entity.HighSchool;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.pollra.application.extend.form.HighSchoolForm.*;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description high school mapper
 **********************************************************************************************************************/
@Mapper
public interface HighSchoolMapper {
    HighSchoolMapper mapper = Mappers.getMapper(HighSchoolMapper.class);

    HighSchool toHighSchool(Request.Add form);

    Response.FindOne toFindOne(HighSchool entity);
}

package com.example.pollra.application.extend.controller;

import com.example.pollra.application.extend.service.HighSchoolService;
import com.example.pollra.application.extend.form.HighSchoolForm.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.pollra.application.extend.mapper.HighSchoolMapper.mapper;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description high school controller
 **********************************************************************************************************************/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/high-schools")
public class HighSchoolController {

    private final HighSchoolService highSchoolService;

    @GetMapping("/{schoolId}")
    public Response.FindOne get(@PathVariable Long schoolId) {
        return mapper.toFindOne(highSchoolService.get(schoolId));
    }

    @PostMapping
    public Response.FindOne add(@Valid @RequestBody Request.Add add) {
        return mapper.toFindOne(highSchoolService.add(mapper.toHighSchool(add)));
    }
}

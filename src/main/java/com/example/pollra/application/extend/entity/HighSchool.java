package com.example.pollra.application.extend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description high school
 **********************************************************************************************************************/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="high_school")
@Entity
public class HighSchool extends School{

    @OneToMany
    @JoinTable(name="student", joinColumns=@JoinColumn(name="school_id"), inverseJoinColumns=@JoinColumn(name="person_id"))
    private List<Student> students;
}

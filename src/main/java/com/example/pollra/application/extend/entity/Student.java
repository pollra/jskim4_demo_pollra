package com.example.pollra.application.extend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description student
 **********************************************************************************************************************/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
@Entity
public class Student extends Person{

    private Integer num;
}

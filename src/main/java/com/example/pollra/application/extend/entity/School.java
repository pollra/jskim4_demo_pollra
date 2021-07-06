package com.example.pollra.application.extend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description school
 **********************************************************************************************************************/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="school")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class School {

    @Id @GeneratedValue
    @Column(name = "school_id")
    private Long id;

    private String name;
}

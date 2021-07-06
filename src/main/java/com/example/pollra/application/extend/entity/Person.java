package com.example.pollra.application.extend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description 조인 대상이 되는 엔티티. 이미 데이터베이스에 저장되어 있는 사람이다.
 **********************************************************************************************************************/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="person")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
    @Id @GeneratedValue
    @Column(name = "person_id")
    private Long id;

    private String name;
}

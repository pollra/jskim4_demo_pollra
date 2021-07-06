package com.example.pollra.application.extend.form;

import lombok.*;

import java.util.List;

/**
 * @since       2021.06.14
 * @author      pollra
 * @description student form
 **********************************************************************************************************************/
public class HighSchoolForm {
    public static class Request {

        @Getter
        @Setter
        @Builder(toBuilder=true)
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Add {

            private String name;

            private List<Student> students;

            @Getter
            @Setter
            @Builder(toBuilder=true)
            @NoArgsConstructor
            @AllArgsConstructor
            public static class Student{

                private Long id;
                private Integer number;
            }
        }

        @Getter
        @Setter
        @Builder(toBuilder=true)
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Modify {

            private List<Student> students;

            @Getter
            @Setter
            @Builder(toBuilder=true)
            @NoArgsConstructor
            @AllArgsConstructor
            public static class Student{

                private Long id;
                private Integer number;
            }
        }
    }

    public static class Response {

        @Data
        public static class FindOne {
            private Long id;
            private String name;
            private List<Student> students;

            @Data
            public static class Student{

                private Long id;
                private String name;
                private Integer number;
            }
        }
    }
}

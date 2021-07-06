create table team (
     id   int      auto_increment
    ,name nvarchar
    ,primary key (id)
);

create table member (
     id         int      auto_increment
    ,name       nvarchar
    ,age        int
    ,created_dt timestamp
    ,created_at nvarchar
    ,team_id    int not null
    ,primary key (id)
    ,foreign key (team_id) references team(id)
);

create table person (
     id   int     auto_increment
    ,name varchar not null
    ,primary key (id)
);

create table school (
     id   int     auto_increment
    ,name varchar not null
    ,primary key (id)
);

create table high_school (
     school_id int not null
    ,person_id int not null
    ,primary key (school_id, person_id)
    ,foreign key (school_id) references school(id)
    ,foreign key (person_id) references person(id)
);

create table student (
     person_id int not null
    ,school_id int not null
    ,num       int
    ,primary key (person_id, school_id)
    ,foreign key (person_id) references
);

--  Datas
insert into person (name) values ('pollra'), ('lob')
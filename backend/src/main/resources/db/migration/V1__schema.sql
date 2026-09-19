create table country (
    id_country bigint primary key,
    name varchar(255),
    description varchar(255),
    flag_url varchar(255),
    formation_date date,
    dismatle_date date
);

create table discipline (
    id_discipline bigint primary key,
    name varchar(255),
    description varchar(255)
);

create table idea (
    id_idea bigint primary key,
    name varchar(255),
    description varchar(255)
);

create table work (
    id_work bigint primary key,
    name varchar(255),
    description varchar(255),
    language varchar(255),
    creation_date date
);

create table "character" (
    id_character bigint primary key,
    name varchar(255),
    birth_place varchar(255),
    description varchar(255),
    image_url varchar(255),
    birth_date date,
    passing_date date,
    id_work bigint,
    id_idea bigint,
    foreign key (id_work) references work(id_work),
    foreign key (id_idea) references idea(id_idea)
);

create table character_nationality (
    id_character bigint not null,
    nationalities varchar(255),
    foreign key (id_character) references "character"(id_character)
);

create table character_language (
    id_character bigint not null,
    language varchar(255),
    foreign key (id_character) references "character"(id_character)
);

create table characters_countrys (
    id_character bigint not null,
    id_country bigint not null,
    primary key (id_character, id_country),
    foreign key (id_character) references "character"(id_character),
    foreign key (id_country) references country(id_country)
);

create table characters_disciplines (
    id_character bigint not null,
    id_discipline bigint not null,
    primary key (id_character, id_discipline),
    foreign key (id_character) references "character"(id_character),
    foreign key (id_discipline) references discipline(id_discipline)
);
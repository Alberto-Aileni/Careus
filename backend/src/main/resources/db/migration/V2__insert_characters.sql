
INSERT INTO country (
    id_country,
    name,
    description,
    flag_url,
    formation_date,
    dismatle_date
) VALUES (
    1,
    'Reino Unido',
    'País de origen de Charles Darwin y lugar donde desarrolló gran parte de su carrera científica.',
    'https://flagcdn.com/w320/gb.png',
    '1707-05-01',
    NULL
);

INSERT INTO discipline (
    id_discipline,
    name,
    description
) VALUES (
    1,
    'Biología',
    'Ciencia que estudia los seres vivos, su origen, evolución, estructura y funcionamiento.'
);

INSERT INTO idea (
    id_idea,
    name,
    description
) VALUES (
    1,
    'Evolución por selección natural',
    'Teoría según la cual las poblaciones de seres vivos evolucionan a lo largo de generaciones mediante la selección natural de características hereditarias favorables.'
);

INSERT INTO work (
    id_work,
    name,
    description,
    language,
    creation_date
) VALUES (
    1,
    'On the Origin of Species',
    'Obra fundamental de Charles Darwin en la que presenta evidencias y argumentos para explicar la evolución de las especies mediante la selección natural.',
    'Inglés',
    '1859-11-24'
);

INSERT INTO "character" (
    id_character,
    name,
    birth_place,
    description,
    image_url,
    birth_date,
    passing_date,
    id_work,
    id_idea
) VALUES (
    1,
    'Charles Darwin',
    'Shrewsbury, Inglaterra',
    'Naturalista británico conocido por desarrollar la teoría de la evolución mediante selección natural.',
    'https://upload.wikimedia.org/wikipedia/commons/2/2e/Charles_Darwin_by_Julia_Margaret_Cameron_2.jpg',
    '1809-02-12',
    '1882-04-19',
    1,
    1
);

INSERT INTO character_nationality (
    id_character,
    nationalities
) VALUES (
    1,
    'Británica'
);

INSERT INTO character_language (
    id_character,
    language
) VALUES (
    1,
    'Inglés'
);

INSERT INTO characters_countrys (
    id_character,
    id_country
) VALUES (
    1,
    1
);

INSERT INTO characters_disciplines (
    id_character,
    id_discipline
) VALUES (
    1,
    1
);
INSERT INTO country (
    id_country,
    name,
    description,
    flag_url,
    formation_date,
    dismatle_date
) VALUES
(1, 'reino unido', 'país soberano e insular ubicado al noroeste de la europa continental.', 'https://flagcdn.com/w320/gb.png', '1707-05-01', null),
(2, 'alemania', 'país europeo con una importante tradición científica y filosófica.', 'https://flagcdn.com/w320/de.png', '1871-01-18', null),
(3, 'polonia', 'país de europa central conocido por su importante contribución a la ciencia.', 'https://flagcdn.com/w320/pl.png', '1918-11-11', null),
(4, 'italia', 'país europeo con una larga tradición científica, artística y cultural.', 'https://flagcdn.com/w320/it.png', '1861-03-17', null),
(5, 'austria', 'país centroeuropeo con una importante tradición científica y cultural.', 'https://flagcdn.com/w320/at.png', '1918-11-12', null),
(6, 'estados unidos', 'país norteamericano con una gran influencia científica y tecnológica.', 'https://flagcdn.com/w320/us.png', '1776-07-04', null),
(7, 'francia', 'país europeo con una destacada tradición científica, filosófica y cultural.', 'https://flagcdn.com/w320/fr.png', '1792-09-22', null),
(8, 'serbia', 'país de los balcanes conocido por la contribución científica de nikola tesla.', 'https://flagcdn.com/w320/rs.png', '2006-06-05', null),
(9, 'grecia', 'país considerado uno de los lugares fundamentales para el desarrollo de la filosofía occidental.', 'https://flagcdn.com/w320/gr.png', '1974-12-08', null),
(10, 'países bajos', 'país europeo con una importante tradición científica y filosófica.', 'https://flagcdn.com/w320/nl.png', '1815-08-24', null)
ON CONFLICT (id_country) DO NOTHING;


INSERT INTO discipline (
    id_discipline,
    name,
    description
) VALUES
(1, 'biología', 'ciencia que estudia los seres vivos, su origen, evolución y propiedades.'),
(2, 'física', 'ciencia que estudia la materia, la energía, el espacio, el tiempo y sus interacciones.'),
(3, 'química', 'ciencia que estudia la composición, estructura y propiedades de la materia.'),
(4, 'astronomía', 'ciencia que estudia los cuerpos celestes, el universo y los fenómenos astronómicos.'),
(5, 'filosofía', 'disciplina que estudia cuestiones fundamentales sobre la existencia, el conocimiento y la realidad.'),
(6, 'matemáticas', 'disciplina dedicada al estudio de estructuras, cantidades, formas y relaciones.'),
(7, 'ingeniería', 'disciplina que aplica conocimientos científicos y matemáticos para resolver problemas prácticos.'),
(8, 'medicina', 'ciencia dedicada al estudio de la salud, las enfermedades y sus tratamientos.'),
(9, 'informática', 'disciplina dedicada al estudio del procesamiento automático de la información.'),
(10, 'psicología', 'disciplina que estudia la mente, el comportamiento y los procesos mentales.')
ON CONFLICT (id_discipline) DO NOTHING;


INSERT INTO idea (
    id_idea,
    name,
    description
) VALUES
(2, 'teoría de la relatividad', 'teoría física que describe la relación entre el espacio, el tiempo, la materia y la energía.'),
(3, 'radiactividad', 'fenómeno por el cual ciertos núcleos atómicos inestables emiten radiación.'),
(4, 'método científico', 'método basado en la observación, experimentación y formulación de explicaciones para estudiar fenómenos naturales.'),
(5, 'leyes del movimiento', 'principios físicos que describen la relación entre las fuerzas y el movimiento de los cuerpos.'),
(6, 'selección natural', 'proceso mediante el cual determinadas características hereditarias favorecen la supervivencia y reproducción de los organismos.'),
(7, 'electromagnetismo', 'teoría que describe la relación entre los fenómenos eléctricos y magnéticos.'),
(8, 'estructura atómica', 'modelo que explica la materia a partir de átomos y de las partículas que los componen.'),
(9, 'computación', 'estudio de los procesos de cálculo y procesamiento automático de información.'),
(10, 'evolución biológica', 'proceso mediante el cual las poblaciones de seres vivos cambian a través de las generaciones.')
ON CONFLICT (id_idea) DO NOTHING;


INSERT INTO work (
    id_work,
    name,
    description,
    language,
    creation_date
) VALUES
(2, 'relativity: the special and general theory', 'obra en la que albert einstein explica los fundamentos de la relatividad especial y general.', 'alemán', '1916-01-01'),
(3, 'recherches sur les substances radioactives', 'investigaciones de marie curie sobre las sustancias radiactivas y sus propiedades.', 'francés', '1898-01-01'),
(4, 'dialogue concerning the two chief world systems', 'obra de galileo galilei que compara los modelos geocéntrico y heliocéntrico del universo.', 'italiano', '1632-02-22'),
(5, 'philosophiæ naturalis principia mathematica', 'obra fundamental de isaac newton en la que presenta sus leyes del movimiento y la gravitación universal.', 'latín', '1687-07-05'),
(6, 'the descent of man', 'obra de charles darwin en la que aplica la teoría de la evolución al ser humano.', 'inglés', '1871-02-24'),
(7, 'a dynamical theory of the electromagnetic field', 'trabajo de james clerk maxwell que desarrolla una teoría matemática del electromagnetismo.', 'inglés', '1865-01-01'),
(8, 'traité de chimie minérale', 'obra relacionada con los estudios químicos de henri moissan y la química inorgánica.', 'francés', '1900-01-01'),
(9, 'on computable numbers', 'trabajo fundamental de alan turing sobre los números computables y las bases teóricas de la computación.', 'inglés', '1936-01-01'),
(10, 'the interpretation of dreams', 'obra fundamental de sigmund freud sobre los sueños y los procesos inconscientes.', 'alemán', '1899-01-01')
ON CONFLICT (id_work) DO NOTHING;


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
) VALUES
(2, 'albert einstein', 'ulm, alemania', 'físico alemán conocido por desarrollar la teoría de la relatividad y sus contribuciones a la física moderna.', 'https://upload.wikimedia.org/wikipedia/commons/d/d3/albert_einstein_head.jpg', '1879-03-14', '1955-04-18', 2, 2),
(3, 'marie curie', 'varsovia, polonia', 'física y química polaca nacionalizada francesa conocida por sus investigaciones sobre la radiactividad.', 'https://upload.wikimedia.org/wikipedia/commons/c/c8/marie_curie_c._1920s.jpg', '1867-11-07', '1934-07-04', 3, 3),
(4, 'galileo galilei', 'pisa, italia', 'astrónomo, físico e ingeniero italiano considerado una figura fundamental de la revolución científica.', 'https://upload.wikimedia.org/wikipedia/commons/2/2e/galileo_galilei_2.jpg', '1564-02-15', '1642-01-08', 4, 4),
(5, 'isaac newton', 'woolsthorpe, inglaterra', 'físico y matemático inglés conocido por sus leyes del movimiento y la gravitación universal.', 'https://upload.wikimedia.org/wikipedia/commons/3/39/sir_isaac_newton_by_sir_godfrey_kneller%2c_bt.jpg', '1643-01-04', '1727-03-31', 5, 5),
(6, 'charles darwin', 'shrewsbury, inglaterra', 'naturalista británico conocido por desarrollar la teoría de la evolución mediante selección natural.', 'https://upload.wikimedia.org/wikipedia/commons/2/2e/charles_darwin_by_julia_margaret_cameron_2.jpg', '1809-02-12', '1882-04-19', 6, 6),
(7, 'james clerk maxwell', 'edimburgo, escocia', 'físico y matemático escocés conocido por desarrollar la teoría clásica del electromagnetismo.', 'https://upload.wikimedia.org/wikipedia/commons/b/b0/james_clerk_maxwell.png', '1831-06-13', '1879-11-05', 7, 7),
(8, 'henri moissan', 'parís, francia', 'químico francés conocido por sus investigaciones sobre el flúor y por desarrollar el horno eléctrico de arco.', 'https://upload.wikimedia.org/wikipedia/commons/1/1d/henri_moissan.jpg', '1852-09-28', '1907-02-20', 8, 8),
(9, 'alan turing', 'londres, inglaterra', 'matemático y lógico británico considerado uno de los fundadores de la informática teórica.', 'https://upload.wikimedia.org/wikipedia/commons/a/a1/alan_turing_aged_16.jpg', '1912-06-23', '1954-06-07', 9, 9),
(10, 'sigmund freud', 'freiberg, imperio austríaco', 'médico y neurólogo austriaco considerado una de las figuras principales en el desarrollo del psicoanálisis.', 'https://upload.wikimedia.org/wikipedia/commons/1/1f/sigmund_freud_life.jpg', '1856-05-06', '1939-09-23', 10, 10)
ON CONFLICT (id_character) DO NOTHING;


INSERT INTO character_nationality (
    id_character,
    nationalities
) VALUES
(2, 'alemana'),
(3, 'polaca'),
(4, 'italiana'),
(5, 'británica'),
(6, 'británica'),
(7, 'británica'),
(8, 'francesa'),
(9, 'británica'),
(10, 'austriaca');


INSERT INTO character_language (
    id_character,
    language
) VALUES
(2, 'alemán'),
(3, 'polaco'),
(4, 'italiano'),
(5, 'inglés'),
(6, 'inglés'),
(7, 'inglés'),
(8, 'francés'),
(9, 'inglés'),
(10, 'alemán');


INSERT INTO characters_countrys (
    id_character,
    id_country
) VALUES
(2, 2),
(3, 3),
(4, 4),
(5, 1),
(6, 1),
(7, 1),
(8, 7),
(9, 1),
(10, 5)
ON CONFLICT (id_character, id_country) DO NOTHING;


INSERT INTO characters_disciplines (
    id_character,
    id_discipline
) VALUES
(2, 2),
(3, 3),
(4, 4),
(5, 2),
(6, 1),
(7, 2),
(8, 3),
(9, 9),
(10, 10)
ON CONFLICT (id_character, id_discipline) DO NOTHING;


SELECT setval(pg_get_serial_sequence('country', 'id_country'), COALESCE((SELECT MAX(id_country) FROM country), 1));
SELECT setval(pg_get_serial_sequence('discipline', 'id_discipline'), COALESCE((SELECT MAX(id_discipline) FROM discipline), 1));
SELECT setval(pg_get_serial_sequence('idea', 'id_idea'), COALESCE((SELECT MAX(id_idea) FROM idea), 1));
SELECT setval(pg_get_serial_sequence('work', 'id_work'), COALESCE((SELECT MAX(id_work) FROM work), 1));
SELECT setval(pg_get_serial_sequence('"character"', 'id_character'), COALESCE((SELECT MAX(id_character) FROM "character"), 1));
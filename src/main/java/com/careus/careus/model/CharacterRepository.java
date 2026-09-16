package com.careus.careus.model;

import com.careus.careus.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    Optional<Character> findById(Long id);

    Optional<Character> findByWork_Id(Long idWork);

    Optional<Character> findByidea_Id(Long idIdea);

    List<Character> findByNameContainingIgnoreCase(String name);

    List<Character> findByCountrys_Id(Long idCountry);

    List<Character> findByDisciplines_Id(long idDiscipline);
}

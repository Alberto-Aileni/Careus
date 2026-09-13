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

    List<Character> findByNameContainingIgnoreCase(String name);

    Optional<Character> findByBirthDate(LocalDate birthgDate);

    Optional<Character> findByPassingDate(LocalDate passingDate);

    List<Character> findByNacionalityContainingIgnoreCase(String nacionality);

    List<Character> findByLanguageContainingIgnoreCase(String language);

    List<Character> FindByDisciplineIdContainingIgnoreCase(Long idDiscipline);

    List<Character> FindByCountryId(Long idCountry);
}

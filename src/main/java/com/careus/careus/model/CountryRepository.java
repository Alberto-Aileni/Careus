package com.careus.careus.model;

import com.careus.careus.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> FindById(Long id);

    Optional<List<Country>> FindByName(String name);

    Optional<List<Country>> FindByCharacterIdContatiningIgnoreCase(Long idCharacter);
}

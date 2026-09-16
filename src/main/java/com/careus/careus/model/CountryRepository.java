package com.careus.careus.model;

import com.careus.careus.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findById(Long id);

    List<Country> findByName(String name);

    List<Country> findByCharaceter_Id(long idCharacter);
}

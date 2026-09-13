package com.careus.careus.model;

import com.careus.careus.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {

    Optional<Discipline> findById(Long id);

    Optional<List<Discipline>> findByName(String name);

    Optional<List<Discipline>> findByCharacterIdContainingIgnoreCase(Long id);
}

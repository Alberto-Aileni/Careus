package com.careus.careus.model;

import com.careus.careus.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {

    Optional<Idea> findById(Long id);

    Optional<List<Idea>> findByName(String name);
}

package com.quizgame.repository;

import com.quizgame.entity.Difficulty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DifficultyRepository extends CrudRepository<Difficulty, Long> {
}

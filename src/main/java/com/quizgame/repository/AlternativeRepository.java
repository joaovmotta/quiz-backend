package com.quizgame.repository;

import com.quizgame.entity.Alternative;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeRepository extends CrudRepository<Alternative, Long> {
}

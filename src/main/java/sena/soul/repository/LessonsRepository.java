package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.Lessons;

@Repository
public interface LessonsRepository extends JpaRepository<Lessons, Long>{
}
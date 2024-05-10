package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long>{

    Lesson findByTitle(String title);
}
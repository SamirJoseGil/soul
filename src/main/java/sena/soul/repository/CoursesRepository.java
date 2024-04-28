package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{
}
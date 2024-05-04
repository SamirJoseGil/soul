package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sena.soul.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

    Course findByName(String name);

    boolean existByName(String name);
}
package sena.soul.services;

import org.springframework.beans.factory.annotation.Autowired;

import sena.soul.models.Course;
import sena.soul.repository.CourseRepository;

import java.util.List;

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {this.courseRepository = courseRepository;}

    public Iterable<Course> getAllCourses() {
        var CoursesList = courseRepository.findAll();
        return CoursesList;
    }

    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public Course validateCourse(String name) {
        Course course = courseRepository.findByName(name);
        return course;
    }

    public boolean existingCourseByName(String name) {
        return courseRepository.existByName(name);
    }

    public boolean addCourse(Course course) {
        Course result = courseRepository.save(course);
        return result != null;
    }




}

package sena.soul.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sena.soul.models.Course;
import sena.soul.services.CourseService;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getAllCourses() {
        return courseService.getAll();
    }

    @GetMapping("/addCourse")
    @ResponseStatus(HttpStatus.OK)
     public ResponseEntity<String> addCourse(@RequestBody Course course) {
        if (
            course.getName().isEmpty() ||
            course.getLevel().isEmpty() ||
            course.getDescription().isEmpty() ||
            course.getDuration().isEmpty()
        ) return new ResponseEntity<>("Falto llenar un campo", HttpStatus.BAD_REQUEST);

        else if (
                courseService.existingCourseByName(course.getName())
        ) return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);

        boolean result = courseService.addCourse(course);

        if (result)
            return ResponseEntity.ok("Se ha creado el curso correctamente");
        else
            return ResponseEntity.ok("No se ha podido crear el curso");
    }

    @GetMapping("/validaCourse")
    @ResponseStatus(HttpStatus.OK)
    public Course validateCourses(@Param("name") String name) {
        return courseService.validateCourse(name);
    }


}

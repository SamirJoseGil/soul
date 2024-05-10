package sena.soul.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sena.soul.models.Lesson;
import sena.soul.services.LessonService;

import java.util.List;

@RestController
@RequestMapping("/lesson")
@CrossOrigin(origins = "*")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<Lesson> getAllLesson() {return lessonService.getAll();}

    @GetMapping("/gettitle")
    @ResponseStatus(HttpStatus.OK)
    public Lesson getLesson(@Param("title") String title) {return lessonService.getLessonByTitle(title);}

    @GetMapping("/validate")
    @ResponseStatus(HttpStatus.OK)
    public Lesson validateLesson(@Param("title") String title) {return lessonService.validateLesson(title);}

    @PutMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> addLesson(@RequestBody Lesson lesson) {
        if (lesson.getTitle().isEmpty() || lesson.getDescription().isEmpty() || lesson.getContent().isEmpty()){
            return new ResponseEntity<>("Falto llenar algun parametro", HttpStatus.BAD_REQUEST);
        }

        boolean result = lessonService.addLesson(lesson);

        if (result)
            return ResponseEntity.ok("Se ha creado la leccion correctamente");
        else
            return ResponseEntity.ok("No se ha podido crear la leccion");
    }

}

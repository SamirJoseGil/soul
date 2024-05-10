package sena.soul.services;


import org.springframework.beans.factory.annotation.Autowired;
import sena.soul.models.Lesson;
import sena.soul.repository.LessonRepository;

import java.util.List;

public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {this.lessonRepository = lessonRepository;}

    public Iterable<Lesson> getAllLessons() {
        var lessonList = lessonRepository.findAll();
        return lessonList;
    }

    public boolean addLesson(Lesson lesson) {
        Lesson result = lessonRepository.save(lesson);
        return result != null;
    }

    public List<Lesson> getAll(){return lessonRepository.findAll();}

    public Lesson getLessonByTitle(String title) {return lessonRepository.findByTitle(title);}

    public  Lesson validateLesson(String title) {
        Lesson lesson = lessonRepository.findByTitle(title);
        return lesson;
    }




}

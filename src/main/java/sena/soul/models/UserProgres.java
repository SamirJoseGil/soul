package sena.soul.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="userprogress")
public class UserProgres {
    
    private Long UserId;
    private Long LessonId;
    private Date Date;



    //Getters and Setters
    public Long getUserId() {
        return UserId;
    }
    public void setUserId(Long userId) {
        UserId = userId;
    }
    public Long getLessonId() {
        return LessonId;
    }
    public void setLessonId(Long lessonId) {
        LessonId = lessonId;
    }
    public Date getDate() {
        return Date;
    }
    public void setDate(Date date) {
        Date = date;
    }

}
